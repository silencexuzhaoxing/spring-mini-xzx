package org.springframework.test.ioc;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;

import static org.assertj.core.api.Assertions.assertThat;


public class SimpleContainerTest {
    @Test
    public void testGetBean() {
        BeanFactory beanFactory = new BeanFactory();
        Hello hello = new Hello();
        beanFactory.registerBean("helloService" , hello);
        Hello helloService = (Hello) beanFactory.getBean("helloService");
        assertThat(helloService).isNotNull();
        assertThat(helloService.sayHello()).isEqualTo("hello");
    }

    class Hello {
        public String sayHello() {
            System.out.println("hello");
            return "hello";
        }

    }
}
