package br.ifce.edu.utils;

import jakarta.servlet.http.HttpServletRequest;
import org.apache.commons.beanutils.BeanUtils;

import java.util.Map;

public class BeanUtilities {

    public static void populateBean(Object formBean, HttpServletRequest request) {
        populateBean(formBean, request.getParameterMap());
    }

    public static void populateBean(Object bean, Map propertyMap) {
        try {
            BeanUtils.populate(bean, propertyMap);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
