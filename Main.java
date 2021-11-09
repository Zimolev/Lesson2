package com.company;


 import java.util.Random;
 import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число строк: ");
        int i = scanner.nextInt();
        System.out.println("Введите число колонок: ");
        int j = scanner.nextInt();

        String[][] str = new String[i][j];
        for (int n = 0; n < i; n++) {
            for (int m = 0; m < j; m++) {

                str[n][m] = "" + ((int) (Math.random() * 100));
                System.out.print(str[n][m]);
                System.out.print(" ");
            }
            System.out.println();
        }

    //    для проверки MyArrayDataException
//        Random r = new Random();
//        int a = r.nextInt(4);
//        int b = r.nextInt(4);
//        str[a][b] = "Q";
//        System.out.println(a + "," + b);

        arraySum(str, i, j);
    }

    private static void arraySum(String[][] str, int n, int m) {
        if (n != 4) {
            throw new MyArraySizeException();
        }
        if (m != 4) {
                throw new MyArraySizeException();
            }


        int sum = 0;
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                myArrayDataExc(str[i][j], i, j);
                sum = sum + Integer.parseInt(str[i][j]);
            }
        }
        System.out.println("Результат: ");
        System.out.println(sum);
    }

    private static void myArrayDataExc(String str, int x, int y) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                throw new MyArrayDataException(x, y);
                }
        }
    }


}