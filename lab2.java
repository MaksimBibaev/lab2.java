package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int c = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое неотрицательное число <15");
        int a = scanner.nextInt();
        System.out.println("Вы ввели число "+ a);
        for (int i = 1; i < a+1; i++) {
            c = c * i;
        }
        System.out.println("Факториал введенного вами числа равен: "+ c);
    }
}
