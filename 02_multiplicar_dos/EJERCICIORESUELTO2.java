package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {

                BufferedReader br ; br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Escribe un valor:");
                int num1 = Integer.parseInt(br.readLine());
                System.out.println("Escribe otro valor:");
                int num2 = Integer.parseInt(br.readLine());
                int num3 = num2 * num1;
                System.out.println("El resultado de la multiplicacion es " +num3);
            }
        }