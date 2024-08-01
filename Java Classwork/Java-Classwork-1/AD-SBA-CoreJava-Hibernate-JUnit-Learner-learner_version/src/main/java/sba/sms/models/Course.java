package sba.sms.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Course is a POJO, configured as a persistent class that represents (or maps to) a table
 * name 'course' in the database. A Course object contains fields that represent course
 * information and a mapping of 'courses' that indicate an inverse or referencing side
 * of the relationship. Implement Lombok annotations to eliminate boilerplate code.
 */
@Getter
@Setter
@Entity
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "instructor")
    private String instructor;

    @ManyToMany(fetch = FetchType.EAGER,
            cascade = {CascadeType.DETACH, CascadeType.REMOVE, CascadeType.MERGE, CascadeType.PERSIST})
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @Column(name = "students")
    private Set<Student> students;

    public Course(String name, String instructor) {
        this.name = name;
        this.instructor = instructor;
    }

}

/*
Course
Field	    Datatype	    Description	                Database attributes @Column()
id	        int	            Course unique identifier	Primary key , generation type IDENTITY,
name	    String	        Course name	                50 character limit, not null
instructor	String	        Instructor name	            50 character limit not null
students	Set<Student>	Course learners list	    fetch type EAGER, cascade type DETACH,REMOVE,MERGE,PERSIST, mappedBy courses
 */