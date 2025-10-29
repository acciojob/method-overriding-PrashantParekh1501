package com.driver;

public class main {
    public static void main(String[] args) {  //  correct main method
        B obj = new B();

        // calling meth() from parent class A (using type casting)
        System.out.println(((A)obj).meth());

        // calling overridden meth() from subclass B
        System.out.println(obj.meth());
    }
}
