package com.mike;

public class AddString {
    public static void main(String[] args){
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1;
        s1 = s3 + "Java";
        System.out.println("s1="+s1+","+"s2="+s2+","+"s3="+s3);
    }
}
