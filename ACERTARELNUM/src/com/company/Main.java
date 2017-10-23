package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br ; br = new BufferedReader(new InputStreamReader(System.in));
        Random r = new Random();
        int aleatorio = r.nextInt(100);
        do {
            System.out.print(" Adivina el numero! ");
            String num1 = (br.readLine());
            if (num1 = aleatorio){
                System.out.print(" ACERTASTES! ");}
            else {
                if (num1 >> aleatorio){
                    System.out.print(" El numero es menor ");
                    System.out.print(" Adivina el numero! ");
                    String num1 = (br.readLine());}
                else {" El numero es mayor "}
                    System.out.print(" Adivina el numero! ");
                    String num1 = (br.readLine());}
            }
        } while ()

                                                                }
                }


