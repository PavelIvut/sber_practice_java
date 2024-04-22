package com.test;

public class Matrix {
    private int rows;
    private int columns;
    private double[][] table;

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public double[][] getTable() {
        return table;
    }
    public double getValue(int i, int j){
        return this.table[i][j];
    }

    public Matrix(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        this.table = new double[rows][columns];
    }

    public void setValue(int i, int j, double value) {
        this.table[i][j] = value;
    }

    public static Matrix addition(Matrix m1, Matrix m2){
        Matrix res = new Matrix(m1.getRows(), m2.getColumns());

        for (int rows = 0; rows < m1.getRows(); rows++) {
            for (int columns = 0; columns < m1.getColumns(); columns++) {
                res.setValue(rows, columns,m1.getValue(rows, columns) + m2.getValue(rows, columns));
            }
        }
        return res;
    }

    public static Matrix multiply(Matrix matrix, double value){
        Matrix res = new Matrix(matrix.getRows(), matrix.getColumns());

        for (int i = 0; i < matrix.getRows(); i++) {
            for (int j = 0; j < matrix.getColumns(); j++) {
                res.setValue(i, j, res.getValue(i, j)*value);
            }
        }
        return res;
    }

    public void print(Matrix matrix) {
        for (int i = 0; i < matrix.getRows(); i++) {
            for (int j = 0; j < matrix.getColumns(); j++) {
                System.out.print(matrix.getValue(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static Matrix multiplication(Matrix m1, Matrix m2) {
        Matrix res = new Matrix(m1.getRows(), m2.getColumns());

        for (int i = 0; i < m1.getRows(); i++) {
            for (int j = 0; j < m2.getColumns(); j++) {
                //res.setValue(i, j, 0);
                for (int k = 0; k < m1.getColumns(); k++) {
                    res.setValue(i, j, m1.getValue(i, k)* m2.getValue(k,j));
                }
            }
        }

        return  res;
    }
}