package com.面试题1.spring;

/**
 * @学习小结
 */
public class book {
    private int id;
    private String name;

    public book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
