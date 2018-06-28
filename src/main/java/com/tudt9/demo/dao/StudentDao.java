package com.tudt9.demo.dao;

import com.tudt9.demo.model.Student;
import java.util.List;
import java.util.UUID;

public interface StudentDao {
  //insert
  int insertNewStudent(UUID studentId, Student student);
  //return a Student object
  Student selectStudentById(UUID studentId);
  List<Student> selectAllStudents();//return list of student objects
  //update
  int updateStudentById(UUID studentId, Student studentUpdate);
  //delete
  int deleteStudentById(UUID studentId);
}
