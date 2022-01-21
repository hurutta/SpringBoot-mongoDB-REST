package com.example.mongoDbProject.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student")
public class Student 
{
    @Id
    private long id;
    private String name;
    private double age;
    private int grade;

    public Student()
    {
        super();
    }

    public Student(long id,String name,double age,int grade)
    {
        super();
        this.id=id;
        this.name=name;
        this.age=age;
        this.grade=grade;
    }
    

    /**
     * @return long return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return double return the age
     */
    public double getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(double age) {
        this.age = age;
    }

    /**
     * @return int return the grade
     */
    public int getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

}
