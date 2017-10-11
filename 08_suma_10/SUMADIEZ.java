package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br ; br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Escribe un valor:");
        int num1 = Integer.parseInt(br.readLine());
        System.out.print("Escribe un valor:");
        int num2 = Integer.parseInt(br.readLine());
        System.out.print("Escribe un valor:");
        int num3 = Integer.parseInt(br.readLine());
        System.out.print("Escribe un valor:");
        int num4 = Integer.parseInt(br.readLine());
        System.out.print("Escribe un valor:");
        int num5 = Integer.parseInt(br.readLine());
        System.out.print("Escribe un valor:");
        int num6 = Integer.parseInt(br.readLine());
        System.out.print("Escribe un valor:");
        int num7 = Integer.parseInt(br.readLine());
        System.out.print("Escribe un valor:");
        int num8 = Integer.parseInt(br.readLine());
        System.out.print("Escribe un valor:");
        int num9 = Integer.parseInt(br.readLine());
        System.out.print("Escribe un valor:");
        int num10 = Integer.parseInt(br.readLine());
        int res = num1 +num2 +num3 +num4 +num5 +num6 +num7 +num8 +num9 +num10;
        System.out.print("El valor es: " +res);

        }
    }