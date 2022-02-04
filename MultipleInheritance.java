package com.pack;

 

public class MultipleInheritance implements OldInterface,NewInterface{
    public static void main(String[] args) {
    	MultipleInheritance mc = new MultipleInheritance();
        mc.myMethod();
    }

 

    @Override
    public void myMethod() {        
        NewInterface.super.myMethod();
    }
}

 

interface OldInterface {
    default void myMethod() {
        System.out.print("old");
    }
    
    static void myStaticMethod() {
        System.out.println("static method");
    }
}

 

interface NewInterface {
    default void myMethod() {
        System.out.print("new");
    }
    
    static void myStaticMethod() {
        System.out.println("static method");
    }
}