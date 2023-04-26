package org.example;

public class Calc {
    public int summ(int a, int b){
        int result;
        result = a + b;
        //System.out.println(" Сумма " + a + " и " + b + " равна " + result);
        System.out.printf("Сумма %d и %d равна %d", a, b, result);
        System.out.println();
        return result;
    }
    public int subtract(int a, int b){
        int result = a - b;
        //System.out.println("Если из " + a + " вычесть " + b + " получится " + result);
        System.out.printf("Если из %d вычесть %d получится %d", a, b, result);
        System.out.println();
        return result;
    }
}
