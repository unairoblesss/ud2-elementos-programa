package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br ; br = new BufferedReader(new InputStreamReader(System.in));
        int cont = 0;
        int num1;
        int res = 0;
        System.out.print("Escribe un valor: ");
        int num3 = Integer.parseInt(br.readLine());
        do {
            System.out.print("Escribe un valor: ");
            num1 = Integer.parseInt(br.readLine());
             cont = cont +1;
            res = res + num1;
        } while (cont < num3);
        System.out.print("El resultado es: " +res);
    }}
