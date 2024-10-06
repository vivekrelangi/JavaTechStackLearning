package Strings;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s1 = "                hello                 ";
//        String s2 = "hello";
        //String s2 = new String("world");
        //s1.replace('l','b');//this does not change s1 value instead it creates another object "hebbo" in the memory
//        s1=s1.replace('l','b');
        System.out.println(s1);
//        System.out.println(s2);

       /* int n = s1.length();

        System.out.println(n);

        char c = s1.charAt(3);

        System.out.println(c);

        char[] arr = s1.toCharArray();

       *//* System.out.println(arr[2]);*//*
        System.out.println(Arrays.toString(arr));

        System.out.println(s1.toUpperCase());

        System.out.println(s1);

        String s2 = "Hello";
        String s3 = "hello";
        String s4 ="world";
        System.out.println(s1.toLowerCase() == s2.toLowerCase());//returns false because they are in different memory pool
        System.out.println(s1 == s3);//returns true because both s1 and s3 point to same memory in memory pool
        System.out.println(s1.toLowerCase().equals(s2.toLowerCase()));//this should be used to compare the values and cases of two strings
        System.out.println(s1.equals(s3));

        System.out.println(s1.compareTo(s2));
        //lexicographical comparision i.e. order of alphabets if s1<s2 => -ve value s1>s2 =>+ve value s1=s2 => 0
        System.out.println((int)'h');
        System.out.println((int)'H');//here first non matching values unicode are subtracted

        System.out.println(s1.compareToIgnoreCase(s2 ));//ignore the lower or upper case

        System.out.println(s1.concat(s2));//This concatenates two strings
        System.out.println(s1 + s4);//you can also use this to concat*/
/*
        System.out.println(s1.substring(1));
        System.out.println(s1.substring(1,3));//till end index - 1 are printed*/

        System.out.println(s1.trim());//All these methods do not modify string object they return a new object

        int n=7;

        System.out.println(String.valueOf(n));
    }
}
