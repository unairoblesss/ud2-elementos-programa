package com.company;




import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br ; br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Escribe:");
        String texto = br.readLine();
        System.out.println("Has escrito:"+texto);
    }
}
