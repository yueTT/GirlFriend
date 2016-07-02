package com.company;

public class Main {

    static String[] firstName = {"赵","钱","孙","李","张","刘"};
    static String[] lastName = {"莉莉","欢欢","媛媛","妮妮","喵喵","颖颖"};


    public static void main(String[] args) {



        for(int i=0; i<1000; i++){

            String f_name = firstName[(int)(Math.random()*firstName.length)];
            String l_name = lastName[(int)(Math.random()*lastName.length)] ;
            String name = f_name + l_name;
            int age = (int)(Math.random()*10)+11;
            girlfriend gf = new girlfriend(name,age);
            System.out.println( gf.toString() );

        }

    }

}
