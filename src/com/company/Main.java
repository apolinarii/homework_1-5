package com.company;

public class Main {

    public static void main(String[] args) {
        int [] weight = new int [3];
        weight[0] = 50;
        weight[1] = 60;
        weight[2] = 70;

        System.out.println(weight[0]);
        System.out.println(weight[1]);
        System.out.println(weight[2]);

        double [] weightTwo = {1.57, 7.654, 9.986 };
        int[] weightFree = new int [10];

        int [] a = new int [3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        System.out.println(a[0] + ",");
        System.out.println(a[1] + ",");
        System.out.println(a[2] + "   ");
        double[] b = new double [3];
        b[0] = 1.57;
        b[1] = 7.654;
        b[2] = 9.986;
        System.out.println(b[0] + ",");
        System.out.println(b[1] + ",");
        System.out.println(b[2] + "   ");
        int[] mass = {2, 5, 77};
        for (int u = 0; u < mass.length; u++) {
            if (u == mass.length - 1)
                System.out.println(mass[u]);
            else
                System.out.println(mass[u] + ",");
        }
        int [] y = new int [10];
        for (int y = 0; y < numbers.length; y++) {
            if (numbers[y] % 2 != 0) {
                numbers[y] = numbers[y] + 1;
            } else if (numbers[y] % 2 == 0) {
            }
            System.out.print(numbers[y] + ", ");



    }
}
