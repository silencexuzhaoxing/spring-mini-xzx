package org.springframework.test.ioc;

import org.junit.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

public class BeanDefinitionAndBeanDefinitionRegistryTest {

    @Test
    public void testBeanFactory() {
        BeanDefinition beanDefinition = new BeanDefinition(HelloService.class);
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        defaultListableBeanFactory.registryBeanDefinition("hello", beanDefinition);
        HelloService hello = (HelloService) defaultListableBeanFactory.getBean("hello");
        hello.sayHello();
    }

}
