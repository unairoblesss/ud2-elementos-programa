package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        char x = br.readLine().charAt(0);
        double res;
        int num1;
        if ( x = "F") {
            System.out.print("Escribe un valor: ");
            num1 = Integer.parseInt(br.readLine());
            res = num1 * 1.8 + 32;
        } else if (x = "K") {
            System.out.print("Escribe un valor: ");
            num1 = Integer.parseInt(br.readLine());
            res = num1 + 273.15;
            } else {
                // 0}
        System.out.print("La conversión de " +num1)( " en grados" +x)( " tiene como resultado " +res);
    }
}

