package com.example.helloworld;

//Parancssori paraméterek legnagyobb és legkisebb, átlag kiírása
public class HelloWorld {
    public static void main(String[] args) {
        int i;
        int max = 0;
        int min = Integer.parseInt(args[0]);
        int sum = 0;
        for (i = 0; i < args.length; i++){
            sum += Integer.parseInt(args[i]);
            if (Integer.parseInt(args[i]) > max) {
                max = Integer.parseInt(args[i]);
            } else {
                min = Integer.parseInt(args[i]);
            }
        }
        System.out.println("max érték: " + max);
        System.out.println("min érték: " + min);
        System.out.println("átlag: " + sum/args.length);
    }
}
