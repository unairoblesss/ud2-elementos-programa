package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {


            BufferedReader br ; br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Escribe una temperatura: ");
            int num1 = Integer.parseInt(br.readLine()) ;
            System.out.print(" Escribe la conversión F o K ");
            String temp = br.readLine();
            double res;
        if (temp.equals("F")) {
            res = num1 *1.8 + 2;
            System.out.print("La conversión de " +num1);
            System.out.print(" En grados  " +temp);
            System.out.print(" tiene como resultado " +res);
        } else if (temp.equals("K")) {
            res = num1 +273.15;
            System.out.print("La conversión de " +num1);
            System.out.print(" En grados  " +temp);
            System.out.print(" tiene como resultado " +res);
            } else {
            System.out.print("Esta unidad de medida no existe");
        }
    }
}

