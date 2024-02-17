//package com.studentmanagement.controller;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.studentmanagement.model.Student;
//import com.studentmanagement.service.StudentService;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//
//@WebMvcTest(StudentController.class)
//public class TestStudentController {
//    @MockBean
//    StudentService studentService;
//
//    @Autowired
//    MockMvc MockMvc;
//    @Test
//    public void test_addStudent(){
//        Student std=new Student(1,"ram","bidar",8466585);
//      //  ObjectMapper objectMapper = new ObjectMapper();
//        when(studentService.saveStudent(std)).thenReturn(std);
//        MockMvc.perform(post("/addstd").contentType(MediaType.APPLICATION_JSON).content(new ObjectMapper.writeValueasString(std)))
//    }
//
//}
