package com.unairobles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(" ¿Cuanto vale el producto? en centimos. ");
        int precio = Integer.parseInt(br.readLine());
        System.out.print(" ¿Cuanto has intoroducido? en centimos. ");
        int introducido = Integer.parseInt(br.readLine());
        int vueltas = (introducido - precio);
            while (vueltas > 0 && vueltas % 5 == 0)
                if (precio + introducido == 0) {
                    System.out.print(" No hay vueltas. ");
                } else {
                    vueltas = vueltas / 200;
                    System.out.print(" Las vueltas en monedas de dos euros son " + vueltas );
                    vueltas = vueltas % 200;
                    vueltas = vueltas / 100;
                    vueltas = vueltas % 100;
                    System.out.print(" Las vueltas en monedas de euro son " + vueltas);
                    vueltas = vueltas / 50;
                    vueltas = vueltas % 50;
                    System.out.print(" Las vueltas en monedas de cincuenta centimos son " + vueltas);
                    vueltas = vueltas / 20;
                    vueltas = vueltas % 20;
                    System.out.print(" Las vueltas en monedas de veinte centimos son " + vueltas);
                    vueltas = vueltas / 10;
                    vueltas = vueltas % 10;
                    System.out.print(" Las vueltas en monedas de diez centimos son " + vueltas);
                    vueltas = vueltas / 5;
                    vueltas = vueltas % 5;
                    System.out.print(" Las vueltas en monedas de cinco centimos son " + vueltas);
                }}}