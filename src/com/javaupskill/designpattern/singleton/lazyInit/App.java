package com.javaupskill.designpattern.singleton.lazyInit;

public class App {
    public  static void main (String args[]){
        //Calling first time to create new instance
        SingletonLazyInit newObject = SingletonLazyInit.getSingletonLazyInitObject();
        //will return existing Instance instead of creating a new instance
        SingletonLazyInit existingObject = SingletonLazyInit.getSingletonLazyInitObject();
        if(newObject.equals(existingObject)){
            System.out.println("Object 1 and 2 are equal");
        }
    }
}
