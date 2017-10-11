package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br ; br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Escribe un valor:");
        int num1 = Integer.parseInt(br.readLine());
        if (num1 % 2 == 0) {
        System.out.println("Es un numero par ");}
        else {System.out.println("Es un numero impar ");
    }
}}