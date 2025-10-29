package com.driver.test;


public class TestCases {
   public static void main(String[]args){
       B obj = new B();

       System.out.println(((A)obj).meth());

       System.out.println(obj.meth());
   }
}
