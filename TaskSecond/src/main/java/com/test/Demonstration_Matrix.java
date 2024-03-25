package com.test;

public class Demonstration_Matrix {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(2, 2);
        m1.setValue(0, 0, 1);
        m1.setValue(0, 1, 2);
        m1.setValue(1, 0, 3);
        m1.setValue(1, 1, 4);

        Matrix m2 = new Matrix(2, 2);
        m2.setValue(0, 0, 5);
        m2.setValue(0, 1, 6);
        m2.setValue(1, 0, 7);
        m2.setValue(1, 1, 8);

        System.out.println("Matrix 1:");
        m1.print(m1);

        System.out.println("Matrix 2:");
        m2.print(m2);

        System.out.println("Matrix addition:");
        Matrix res1 = Matrix.addition(m1, m2);
        res1.print(res1);

        System.out.println("Matrix multiplication by 2:");
        Matrix res2 = Matrix.multiply(m1, 2);
        res2.print(res2);

        System.out.println("Matrix multiplication:");
        Matrix res3 = Matrix.multiplication(m1, m2);
        res3.print(res3);
    }
}
