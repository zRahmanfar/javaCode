package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String text;
        Scanner scanner =new Scanner(System.in);
        System.out.println("pelese enter your text :");
        text =scanner.next();
        convert(text);

    }

    public static int convert(String text){
        int t = 0;
        for (int i=0; i<=text.length();i++){
            t= (int) (i+10);


        }

        return t;
    }
}
