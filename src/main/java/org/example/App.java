/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jack Nelson
*/


package org.example;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("What is the input string?" );
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        int length=str.length();
        System.out.printf("%s has %d characters.",str,length);
    }
}
