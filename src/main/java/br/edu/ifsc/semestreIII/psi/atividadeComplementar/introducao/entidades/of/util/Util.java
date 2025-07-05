package br.edu.ifsc.trabalhopsi_atividadescomplementares.entidades.of.util;

import java.util.Scanner;

public class Util {
    public static int lerInt(){
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        return i ;
    }
    
    public static String lerString(){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        return s;
    }
    
    public static double lerDouble(){
        Scanner in = new Scanner(System.in);
        double i = in.nextDouble();
        return i ;
    }
    
    public static float lerFloat(){
        Scanner in = new Scanner(System.in);
        float i = in.nextFloat();
        return i ;
    }
}
