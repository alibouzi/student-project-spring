package com.example.second;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    private  final StudentRepository studentRepository;
@Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<Student> getStudent(){
     //   System.out.println("Hello");
      //  return List.of(new Student("ali","Ali", LocalDate.of(2000, Month.APRIL,5),26));

       return studentRepository.findAll();

    }

}
