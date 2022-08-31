package com.javaupskill.designpattern.singleton.lazyInit;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Refelection can be used to break the singleton pattern
 */
public class SingletonReflection {
    public  static  void main(String [] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {

        SingletonLazyInit newObject = SingletonLazyInit.getSingletonLazyInitObject();
        SingletonLazyInit reflectionUtilObject = null;
        System.out.println("Hashcode of new Object:"+newObject.hashCode());
        Constructor[] definedConstructors = SingletonLazyInit.class.getDeclaredConstructors();
        for(Constructor con : definedConstructors){
            con.setAccessible(true);
            reflectionUtilObject = (SingletonLazyInit) con.newInstance();
        }
        System.out.println("Hashcode of new reflectionUtilObject:"+reflectionUtilObject.hashCode());
    }
}
