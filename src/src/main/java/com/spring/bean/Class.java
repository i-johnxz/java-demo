package com.spring.bean;

import javax.persistence.*;

@Table(name = "t_class")
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "class_name")
    private String className;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return class_name
     */
    public String getClassName() {
        return className;
    }

    /**
     * @param className
     */
    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }
}