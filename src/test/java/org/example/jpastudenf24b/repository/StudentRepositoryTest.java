package org.example.jpastudenf24b.repository;

import org.example.jpastudenf24b.model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class StudentRepositoryTest {

    @Autowired
    StudentRepository studentRepository;

    @BeforeEach
    void setUp() throws Exception {
        Student student = new Student();
        student.setName("test");
        studentRepository.save(student);
    }

    @Test
    public void testOneStudent() {
        List<Student> students = studentRepository.findAll();
        assertEquals(1, students.size());
    }

}