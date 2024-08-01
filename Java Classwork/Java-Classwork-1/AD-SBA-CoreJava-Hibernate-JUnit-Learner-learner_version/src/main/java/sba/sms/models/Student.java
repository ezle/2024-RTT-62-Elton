package sba.sms.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;


/**
 * Student is a POJO, configured as a persistent class that represents (or maps to) a table
 * name 'student' in the database. A Student object contains fields that represent student
 * login credentials and a join table containing a registered student's email and course(s)
 * data. The Student class can be viewed as the owner of the bi-directional relationship.
 * Implement Lombok annotations to eliminate boilerplate code.
 */
@Getter
@Setter
@Entity
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student")

public class Student {
    @Id                         //primary key
    @Column(name = "email")
    private String email;       //variable = field/column

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToMany(fetch = FetchType.EAGER,
            cascade = {CascadeType.DETACH, CascadeType.REMOVE, CascadeType.MERGE, CascadeType.PERSIST})
    @JoinTable(name = "students_courses",
            joinColumns = {
                    @JoinColumn(name = "student_email", referencedColumnName = "email",
                            nullable = false, updatable = false)},
            inverseJoinColumns = {
                    @JoinColumn(name = "course_id", referencedColumnName = "id",
                            nullable = false, updatable = false)})
    @Column(name = "courses")
    private Set<Course> courses;

    public Student(String mail, String name, String password) {
        this.email = mail;
        this.name = name;
        this.password = password;
    }

}

/*
Student entity - basically a table for students

Field	    Datatype	Description	            Database attributes @Column()
email	    String	    Student’s               unique identifier	Primary key, 50 character limit, name email
name	    String	    Student’s name	        50 character limit, not null, name name
password	String	    Student’s password	    50 character limit not null, name password
courses	    Set<Course>	Student courses list	Join table strategy name student_courses ,
                                                name of student primary key column student_email
                                                and inverse primary key (courses) column courses_id
                                                , fetch type EAGER, cascade type DETACH,REMOVE,MERGE,PERSIST

 */


