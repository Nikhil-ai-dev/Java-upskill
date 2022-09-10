package com.javaupskill.designpattern.prototype;

import com.javaupskill.designpattern.singleton.lazyInit.SingletonLazyInit;

public class PrototypeExample implements  Cloneable {
    public Object cloneObject() throws CloneNotSupportedException {
        return super.clone();
    }
}
