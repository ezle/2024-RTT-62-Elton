package sba.sms.services;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import sba.sms.models.Student;
import sba.sms.utils.CommandLine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.mysql.cj.conf.PropertyKey.PASSWORD;
import static org.assertj.core.api.Assertions.*;


class StudentServiceTest {

    StudentService studentService = new StudentService();

    @BeforeAll
    public static void initializeStudents() {
        CommandLine.addData();
    }

    @Test
    public void validateStudentTest() {
        String email = "reema@gmail.com";
        String password = "password";
        Assertions.assertTrue(studentService.validateStudent(email, password));
    }

}