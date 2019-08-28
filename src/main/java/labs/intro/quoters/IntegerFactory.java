package labs.intro.quoters;

import org.springframework.beans.factory.FactoryBean;

public class IntegerFactory
//        implements FactoryBean<Integer>
{
    public Integer createInteger() {
        return RandomUtil.getRandomValue(0, 100);
    }
//    @Override
//    public Integer getObject() throws Exception {
//        return RandomUtil.getRandomValue(0, 100);
//    }
//
//    @Override
//    public Class<?> getObjectType() {
//        return Integer.class;
//    }
//
//    @Override
//    public boolean isSingleton() {
//        return false;
//    }
}
