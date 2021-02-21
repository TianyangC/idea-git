package com.itheima.method1;

public class DemoMethod {
    public static void main(String[] args) {
        isEvenNumber(10);
    }

    public static void isEvenNumber(int num){
        if(num%2 == 0){
            System.out.println("偶数");
        }else{
            System.out.println("奇数");
        }
    }
}
