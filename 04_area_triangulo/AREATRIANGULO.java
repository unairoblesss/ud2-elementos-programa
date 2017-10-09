package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br ; br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Escribe el base:");
        int num1 = Integer.parseInt(br.readLine());
        System.out.println("Escribe la altura:");
        int num2 = Integer.parseInt(br.readLine());
        int num3 = num2 * num1 / 2;
        System.out.println("La base del triangulo es " +num3);
    }
}