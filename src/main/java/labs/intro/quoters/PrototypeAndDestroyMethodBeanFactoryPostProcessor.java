package labs.intro.quoters;

import lombok.SneakyThrows;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.lang.reflect.Method;

@Component
public class PrototypeAndDestroyMethodBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @SneakyThrows
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory factory) throws BeansException {
        String[] names = factory.getBeanDefinitionNames();
        for (String name : names) {
            BeanDefinition definition = factory.getBeanDefinition(name);
            if (definition.getScope().equalsIgnoreCase("prototype")) {
                if (definition.getDestroyMethodName() != null) {
                    throw new IllegalArgumentException("Don't use prototype scope and destroy method at the same time, cause destroy method won't work!");
                }
                String beanClassName = definition.getBeanClassName();
                Class<?> aClass = Class.forName(beanClassName);
                Method[] methods = aClass.getDeclaredMethods();
                for (Method method : methods) {
                    if (method.isAnnotationPresent(PreDestroy.class)) {
                        throw new IllegalArgumentException("Don't use prototype scope and destroy method at the same time, cause destroy method won't work!");
                    }
                }
            }
        }
    }
}
