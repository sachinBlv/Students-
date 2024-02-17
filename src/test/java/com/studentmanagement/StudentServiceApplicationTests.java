package com.studentmanagement;

import com.studentmanagement.model.Student;
import com.studentmanagement.repository.StudentRepository;
import com.studentmanagement.service.StudentService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
@RunWith(SpringRunner.class)
class StudentServiceApplicationTests {


    @MockBean
    StudentRepository StudentRepository;
    @Autowired
    StudentService StudentService;

    @Test
    public void test_getAllStudent() {
        when(StudentRepository.findAll()).thenReturn(Stream.of(new Student(1, "sachin", "bang", 9162663366L), new Student(2, "prabhu", "pune", 9162663366L)).collect(Collectors.toList()));
        assertEquals(2, StudentService.getAllStudent().size());
    }
    @Test
    public void test_saveStudent() {
        Student std=new Student(2, "prabhu", "pune", 9162663366L);
        when(StudentRepository.save(std)).thenReturn(std);
       // assertEquals(std,StudentService.saveStudent(std));
        assertEquals("prabhu",StudentService.saveStudent(std).getName());
    }
    @Test
    public void test_updateStudent() {
        Student std=new Student(2, "prabhu", "pune", 9162663366L);
        Student Newstd=new Student(2, "prabhuPiraji", "pune", 9162663366L);
        when(StudentRepository.save(Newstd)).thenReturn(Newstd);
        // assertEquals(std,StudentService.saveStudent(std));
        assertEquals("prabhuPiraji",StudentService.updateStudent(Newstd).getName());
    }
    @Test
    public void test_getById(){
        Student std = new Student(2, "prabhu", "pune", 9162663366L);
        // long id=2;
        when(StudentRepository.findById(std.getId())).thenReturn(Optional.of(std));
        //assertEquals(2, StudentService.getById(2).get().getId());
        assertEquals("pune",StudentService.getById(2).get().getAddress());
    }


}
