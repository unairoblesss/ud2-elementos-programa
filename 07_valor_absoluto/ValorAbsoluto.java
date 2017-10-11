package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        int num1;
        do {
            System.out.print("Escribe un valor: ");
            num1 = Integer.parseInt(br.readLine());

            if (num1 < 0) {
                int num2 = num1 / -1;
                System.out.println("El valor absoluto es: " + num2);
            } else if (num1 > 0) {
                System.out.println("El valor absoluto es: " + num1);
            } else {
                // 0
            }

        } while (num1 != 0);
    }
}

