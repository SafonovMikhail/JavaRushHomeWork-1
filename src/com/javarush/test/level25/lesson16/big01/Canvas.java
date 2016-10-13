package com.javarush.test.level25.lesson16.big01;

public class Canvas {
    int width;
    int height;
    char[][] matrix;

    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
        this.matrix = new char[width][height];
    }

    public void setPoint(double x, double y, char c) {
        int iX = (int) x;
        int iY = (int) y;

        if (iY < 0 || iY >= matrix.length) return;
        if (iX < 0 || iX >= matrix[iY].length) return;

        matrix[iY][iX] = c;
    }

    public void drawMatrix(double x, double y, int[][] matrix, char c) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1)
                    setPoint(x + j, y + i, c);
            }
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public char[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(char[][] matrix) {
        this.matrix = matrix;
    }
}
