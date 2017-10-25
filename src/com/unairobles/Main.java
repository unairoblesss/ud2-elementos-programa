package com.unairobles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //numero aleatorio lo llamas r y le asignas un valor entre 0 y 100, lo renombras como aleatorio en numero (int)
        Random r = new Random();
        int aleatorio = r.nextInt(100);

        System.out.print(" ¿Quieres acabar? Escribe fin ");
        String exit = br.readLine();
        System.out.print(" ACIERTA EL NUMERO!!!!! :D ");
        int ad = Integer.parseInt(br.readLine());
           //Hacer mientras el numero este entre 0 o 100
           do {
               if (ad < 100 || ad > 0) {
                   if (ad > aleatorio) {
                       System.out.print(" El numero es mas pequeño :D VUELVE A INTENTARLO: ");
                   } else if (ad < aleatorio) {
                       System.out.print(" El numero es mas grande ;D VUELVE A INTENTARLO: ");
                   } else if (ad == aleatorio) {
                       System.out.print(" ¡ACERTASTESSSS!!! :D escribe fin para salir o VUELVE A INTENTARLO: ");
                   } else {System.out.print( "Pon un numero valido. ");}
                   System.out.print(" ¿Quieres acabar? Escribe fin o pulsa intro! ");
                   exit = br.readLine();
                   System.out.print(" vuelve a intentarlo :) ");
                   ad = Integer.parseInt(br.readLine());

               }
           } while (!exit.equals("fin"));
        {System.out.print(" HAS ACABADO EL JUEGO.");
        }
    }
}

