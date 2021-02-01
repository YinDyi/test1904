package com.bjpowernode;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.pojo.Student;
import com.bjpowernode.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class StudentTest  {

    @Test
    public void studentTest(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> students = dao.selectStudent();
        for (Student stu:students) {
            System.out.println("学生="+stu);
        }
    }
    @Test
    public void studentTest1(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> students = dao.selectStudent1(2102);
        for (Student stu:students) {
            System.out.println("学生="+stu);
        }
    }
    @Test
    public void studentTestMap(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Map<Object,Object>> students = dao.selectStudentMap(0);
        System.out.println(students);
    }

}
