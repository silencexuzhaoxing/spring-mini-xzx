package org.springframework.beans.factory;

import java.util.HashMap;
import java.util.Map;

public interface BeanFactory {
    Object getBean(String name);
}
