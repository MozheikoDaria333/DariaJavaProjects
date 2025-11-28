package edu.ntu.mozheiko.lr5;

import edu.ntu.mozheiko.lr5.dao.StudentDao;
import edu.ntu.mozheiko.lr5.dao.StudentDaoJdbc;
import edu.ntu.mozheiko.lr5.model.Student;

import java.util.List;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Використовуємо інтерфейс для створення об'єкта
        StudentDao studentDao = new StudentDaoJdbc();

        System.out.println(" Лабораторна робота №5: JDBC (Mozheiko) ");
        System.out.print("Введіть місяць народження для пошуку (1-12): ");

        if (scanner.hasNextInt()) {
            int month = scanner.nextInt();

            if (month >= 1 && month <= 12) {
                List<Student> result = studentDao.findByBirthMonth(month);

                if (result.isEmpty()) {
                    System.out.println("Студентів у цьому місяці не знайдено.");
                } else {
                    System.out.println("\nРезультат пошуку:");
                    for (Student s : result) {
                        System.out.println(s);
                    }
                }
            } else {
                System.out.println("Число має бути від 1 до 12.");
            }
        } else {
            System.out.println("Введено некоректні дані.");
        }

        scanner.close();
    }
}