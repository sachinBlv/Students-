package com.studentmanagement.service;

import com.studentmanagement.model.Student;
import com.studentmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
  private  StudentRepository StudentRepository;
    public Student saveStudent(Student std) {
        Student save = StudentRepository.save(std);
        return save;
    }

    public Student updateStudent(Student std) {

        Student update = StudentRepository.save(std);
        return  update;
    }

    public Optional<Student> getById(long id) {
        Optional<Student> StdDetails = StudentRepository.findById(id);
        return StdDetails;
    }
    public List<Student> getAllStudent() {

        return StudentRepository.findAll();
    }
}
