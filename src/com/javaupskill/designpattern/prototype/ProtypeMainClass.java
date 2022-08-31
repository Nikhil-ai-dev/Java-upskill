package com.javaupskill.designpattern.prototype;

import com.javaupskill.designpattern.singleton.lazyInit.SingletonLazyInit;

public class ProtypeMainClass {
    public static void main(String args[]) throws CloneNotSupportedException {
        //Created Dummy object
        PrototypeExample protoType = new PrototypeExample();
        System.out.println("Original protoType Object"+protoType.hashCode());

        Object cloneObject = protoType.cloneObject();
        System.out.println("Cloned protoType Object"+cloneObject.hashCode());
    }
}
