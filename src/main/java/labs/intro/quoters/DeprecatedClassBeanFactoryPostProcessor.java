package labs.intro.quoters;

import lombok.SneakyThrows;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

//@Component
public class DeprecatedClassBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @SneakyThrows
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory factory) throws BeansException {
        String[] names = factory.getBeanDefinitionNames();
        for (String name : names) {
            BeanDefinition definition = factory.getBeanDefinition(name);
            String beanName = definition.getBeanClassName();
            if (beanName == null) {
                continue;
            }
            Class<?> aClass = Class.forName(beanName);
            DeprecatedClass deprecated = aClass.getAnnotation(DeprecatedClass.class);
            if (deprecated != null) {
                definition.setBeanClassName(deprecated.newImplementation().getName());
            }
        }
    }
}
