package edu.ntu.mozheiko.lr5.dao;

import edu.ntu.mozheiko.lr5.model.Student;
import edu.ntu.mozheiko.lr5.util.DbConnectionManager;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoJdbc implements StudentDao {

    private static final String SQL_FIND_BY_MONTH =
            "SELECT * FROM students WHERE EXTRACT(MONTH FROM birth_date) = ?";

    @Override
    public List<Student> findByBirthMonth(int month) {
        List<Student> students = new ArrayList<>();

        try (Connection connection = DbConnectionManager.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_FIND_BY_MONTH)) {

            statement.setInt(1, month);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Student student = new Student(
                        resultSet.getInt("id"),
                        resultSet.getString("last_name"),
                        resultSet.getString("first_name"),
                        resultSet.getString("middle_name"),
                        resultSet.getDate("birth_date").toLocalDate(),
                        resultSet.getString("record_book_no")
                );
                students.add(student);
            }

        } catch (SQLException e) {
            System.err.println("Помилка при запиті до БД: " + e.getMessage());
        }

        return students;
    }
}