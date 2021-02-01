package com.bjpowernode.dao;

import com.bjpowernode.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface StudentDao {
    List<Student> selectStudent();
    List<Student> selectStudent1(@Param("myname") Integer integer);
    List<Map<Object,Object>> selectStudentMap(@Param("myMap") Integer integer);


}
