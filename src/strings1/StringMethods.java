package strings1;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String s="  welcome suresh  ";
        System.out.println(s);

        String sg=new String("java-selenium");
        System.out.println(sg);
        //length()--return length of the string

        //int l=sg.length();
        //System.out.println(l);

        //length---keyword to to find size in array
        //length()--method used to find size of string
        System.out.println(s.length());//direct usage

        //concat()--join string
        String s1="selenium";
        String s2="java";
        String s3="TestNG";
        System.out.println(s1+s2); //using +
        System.out.println(s1.concat(s2));//join string using concat()
        System.out.println(s1+s2+s3);
        System.out.println(s1.concat(s2).concat(s3));

        System.out.println("welcome".concat("ToJAVA"));

        //trim()--trimdpsces left side and right side
        System.out.println(s.length()); //18
        System.out.println(s.trim().length()); //14

        //charAt()--returns single character from string based on index(starts from 0)
        System.out.println(sg.charAt(5)); //s

        //*****contains()---returns boolean---check a string is a part of main string
        System.out.println(s.contains("wel")); //true
        System.out.println(s.contains("Come")); //false --C uppercase(Java is case sensitive)
        System.out.println(s.contains("weme")); //false---value should be sequence

        //equals()---compare 2 strings(Case Sensitive)
        //returns boolean value true /false

        String a="welcome";
        String b="welcome";

        System.out.println(a.equals(b));//true
        System.out.println(a.equals("Welcome"));//false
        System.out.println(a.equalsIgnoreCase("Welcome"));//true

        //replace()--replace single character or sequence of characters
        String rep="welcome to java selenium ";
        System.out.println(rep.replace("java","python")); //welcome to python selenium
        System.out.println(rep.replace('a','o')); //welcome to jovo selenium

        //substring()--return substring from main string
        //staring index starts from 0
        //ending index starts from 1
        System.out.println(a.substring(0,3)); //wel
        System.out.println(a.substring(1,6));//elcom

        //toUpperCase  toLowerCase---converting case
        String c="wElCoMe";
        System.out.println(c.toUpperCase());//WELCOME
        System.out.println(c.toLowerCase());//welcome

        //split()---split into 2 strings based on delimeter(@)
        String mail="sureshpudi@gmail.com";
        String data[]=mail.split("@");// split and stores in array, so assigned in array
        System.out.println(data[0]);//sureshpudi
        System.out.println(data[1]);//gmail.com

        // example replace()
        String amount="$15,20,55";
        System.out.println(amount.replace("$","").replace(",","")); //152055

        //ex-abc,123@xyz--output--abc 123 xyz
        /*String sp="abc,123@xyz";
        String arr[]=sp.split(",");
        System.out.println(arr[0]);//abc
        System.out.println(arr[1]);
        String arr2[]=arr[1].split("@");
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr[0]+" "+arr2[0]+" "+arr2[1]);
*/
        //ex-- abc 123 xyz
        String ss="abc 123 xyz";
        String arr[]=ss.split(" ");
        System.out.println(Arrays.toString(arr)); //[abc, 123, xyz]
        // you can not use as deliemeters-- * % ^ & ( )


        //problem

        String name="John Kenedy";
        System.out.println(name.contains("john"));//false
        System.out.println(name.toLowerCase().contains("john"));//true
        System.out.println(name.replace('J','j').contains("john"));// true

        /*length()
        trim()
        concat()
        replace()
        split()
        charAT()
        equals()
        equalIngnore()
        toLowercase()
        toUppercase()
        sunstring()*/
    }
}
