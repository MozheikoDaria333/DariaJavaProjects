package edu.ntu.mozheiko.lr2;

import java.util.Scanner;

public class Main {

    private static final int RANDOM_MIN = -50;
    private static final int RANDOM_MAX = 50;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Створення матриці");
        System.out.print("Введіть кількість рядків (до 20): ");
        int rows = scanner.nextInt();

        System.out.print("Введіть кількість стовпців (до 20): ");
        int cols = scanner.nextInt();

        if (rows > 20 || cols > 20 || rows <= 0 || cols <= 0) {
            System.out.println("Помилка: розмір матриці повинен бути 1..20");
            return;
        }

        System.out.println("Оберіть спосіб створення матриці:");
        System.out.println("1 — Ввести вручну");
        System.out.println("2 — Заповнити рандомно");
        int choice = scanner.nextInt();

        int[][] matrix;
        if (choice == 1) {
            matrix = fillMatrixManual(rows, cols, scanner);
        } else {
            matrix = fillMatrixRandom(rows, cols);
        }

        printMatrix(matrix);

        int min = findMin(matrix);
        int max = findMax(matrix);
        double average = findAverage(matrix);
        double geometric = findGeometricMean(matrix); // додаткове

        System.out.println("Мінімальний елемент: " + min);
        System.out.println("Максимальний елемент: " + max);
        System.out.println("Середнє арифметичне: " + average);
        System.out.println("Середнє геометричне: " + geometric);
    }


    public static int[][] fillMatrixManual(int rows, int cols, Scanner scanner) {
        int[][] m = new int[rows][cols];
        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                m[i][j] = scanner.nextInt();
            }
        }
        return m;
    }

    public static int[][] fillMatrixRandom(int rows, int cols) {
        int[][] m = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                m[i][j] = RANDOM_MIN + (int) (Math.random() * (RANDOM_MAX - RANDOM_MIN + 1));
            }
        }
        return m;
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("Матриця:");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    public static int findMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int[] row : matrix)
            for (int v : row)
                if (v < min) min = v;
        return min;
    }

    public static int findMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] row : matrix)
            for (int v : row)
                if (v > max) max = v;
        return max;
    }

    public static double findAverage(int[][] matrix) {
        int sum = 0, count = 0;
        for (int[] row : matrix)
            for (int v : row) {
                sum += v;
                count++;
            }
        return (double) sum / count;
    }

    public static double findGeometricMean(int[][] matrix) {
        double product = 1.0;
        int count = 0;

        for (int[] row : matrix)
            for (int v : row) {
                product *= Math.abs(v) + 1; // уникаємо множення на 0
                count++;
            }

        return Math.pow(product, 1.0 / count);
    }
}
