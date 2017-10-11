package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduce un numero del 1 al 7 = ");
        int num1 = Integer.parseInt(br.readLine());
            switch (num1) {
                case 1:
                    System.out.print("Lunes");
                    break;
                case 2:
                    System.out.print("Martes");
                    break;
                case 3:
                    System.out.print("Miercoles");
                    break;
                case 4:
                    System.out.print("Juves");
                    break;
                case 5:
                    System.out.print("Viernes");
                    break;
                case 6:
                    System.out.print("Sabado");
                    break;
                case 7:
                    System.out.print("Domingo");
                    break;
                default:System.out.print("Reinicia y escribe un valor valido");}
        }
    }
