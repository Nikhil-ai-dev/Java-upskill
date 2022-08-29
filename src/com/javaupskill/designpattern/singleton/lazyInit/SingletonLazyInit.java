package com.javaupskill.designpattern.singleton.lazyInit;

public class SingletonLazyInit {
    private static SingletonLazyInit singletonLazyInit;

    private  SingletonLazyInit(){
    }

    public static  SingletonLazyInit getSingletonLazyInitObject(){
        if(singletonLazyInit == null) {
            System.out.println("Creating an object for the first time");
            singletonLazyInit = new SingletonLazyInit();
            return  singletonLazyInit;
        }else{
            System.out.println("Giving access to the previously created Object");
            return singletonLazyInit;
        }
    }
}
