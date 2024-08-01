package sba.sms.services;

import jakarta.persistence.TypedQuery;
import lombok.extern.java.Log;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import sba.sms.dao.StudentI;
import sba.sms.models.Course;
import sba.sms.models.Student;
import sba.sms.utils.HibernateUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * StudentService is a concrete class. This class implements the
 * StudentI interface, overrides all abstract service methods and
 * provides implementation for each method. Lombok @Log used to
 * generate a logger file.
 */

public class StudentService {
    public void createStudent(Student student) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        session.save(student);
        session.getTransaction().commit();
        session.close();

    }

    public List<Student> getAllStudents() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "SELECT s FROM Student s";
        TypedQuery<Student> query = session.createQuery(hql, Student.class);

        List<Student> students = query.getResultList();
        session.close();
        return students;
    }



    public Student getStudentByEmail(String email) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "SELECT s FROM Student s WHERE s.email = :email";
        TypedQuery<Student> query = session.createQuery(hql, Student.class);
        query.setParameter("email", email);

        try {
            Student result = query.getSingleResult();
            return result;
        } catch ( Exception e ) {
            return null;
        } finally {
            session.close();
        }
    }

    public boolean validateStudent(String email, String password) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        //HQL statement needs an and.
        String hql = "SELECT s FROM Student s WHERE s.email = :email AND s.password = :password";

        TypedQuery<Student> query = session.createQuery(hql, Student.class);

        query.setParameter("email", email);
        query.setParameter("password", password);
        // Execute the query and check if a student exists
        try {
            Student result = query.getSingleResult();
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            session.close();
        }
    }
    public void registerStudentToCourse(String email, int courseId) {
        CourseService courseService = new CourseService();
        boolean foundMatch = false;
        Student student = getStudentByEmail(email);
        Set<Course> studentCourses = student.getCourses();
        for (Course c : studentCourses) {
            if (c.getId() == courseId) {
                System.out.println("Student already registered for this class.");
                foundMatch = true;
            }
        }
        if (foundMatch == false) {
            System.out.printf("successfully register %s to %s%n", getStudentByEmail(email).getName(), courseService.getCourseById(courseId).getName());
        }

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String hql = "Select c from Course c where c.id = :courseId";
        TypedQuery<Course> query = session.createQuery(hql, Course.class);
        query.setParameter("courseId", courseId);
        Course course = query.getSingleResult();


        studentCourses.add(course);
        student.setCourses(studentCourses);
        session.merge(student);
        session.getTransaction().commit();
        session.close();
    }

    public List<Course> getStudentCourses(String email) {
        Student student = getStudentByEmail(email);

        Set<Course> setOfCourses = student.getCourses();
        List<Course> listOfCourses = new ArrayList<Course>();
        listOfCourses.addAll(setOfCourses);
        return listOfCourses;
    }


}
