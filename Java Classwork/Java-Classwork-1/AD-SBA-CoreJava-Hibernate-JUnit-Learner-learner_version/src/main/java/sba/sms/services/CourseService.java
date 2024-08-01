package sba.sms.services;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import sba.sms.dao.CourseI;
import sba.sms.models.Course;
import sba.sms.utils.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * CourseService is a concrete class. This class implements the
 * CourseI interface, overrides all abstract service methods and
 * provides implementation for each method.
 */
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;
import java.util.Set;

public class CourseService {
    public void createCourse(Course course) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        session.save(course);
        session.getTransaction().commit();
        session.close();
    }

    public Course getCourseById(int courseId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "SELECT c FROM Course c WHERE c.id = :id";

        TypedQuery<Course> query = session.createQuery(hql, Course.class);

        query.setParameter("id", courseId);

        try {
            Course result = query.getSingleResult();
            return result;
        } catch (Exception e) {
            return null;
        } finally {
            session.close();
        }
    }

    public List<Course> getAllCourses() {
        Session session = HibernateUtil.getSessionFactory().openSession();

        String hql = "SELECT c FROM Course c";
        TypedQuery<Course> query = session.createQuery(hql, Course.class);

        List<Course> courses = query.getResultList();
        session.close();
        return courses;
    }

}
