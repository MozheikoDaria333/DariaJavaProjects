package edu.ntu.mozheiko.lr5.dao;

import edu.ntu.mozheiko.lr5.model.Student;
import java.util.List;

public interface StudentDao {
    List<Student> findByBirthMonth(int month);
}