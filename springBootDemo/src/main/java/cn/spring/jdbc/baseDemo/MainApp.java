package cn.spring.jdbc.baseDemo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/jdbc/baseDemo/Beans.xml");
        StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");
        
//        studentJDBCTemplate.create("Zara", 11);
        
        //查询
        List<Student> students = studentJDBCTemplate.listStudents();
        for (Student record : students) {
            System.out.print("ID : " + record.getId());
            System.out.print(", Name : " + record.getName());
            System.out.println(", Age : " + record.getAge());
        }
        
////        //更新
//        studentJDBCTemplate.update(2, 20);
//        Student student = studentJDBCTemplate.getStudent(2);
//        System.out.print("ID : " + student.getId());
//        System.out.print(", Name : " + student.getName());
//        System.out.println(", Age : " + student.getAge());
    }
}