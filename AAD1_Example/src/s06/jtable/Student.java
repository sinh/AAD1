/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package s06.jtable;

/**
 *
 * @author macbookpro
 */
public class Student {

    private String rollNo;
    private String name;
    private int age;
    private boolean gender;

    public Student() {
        rollNo = "";
        name = "";
    }

    public Student(String rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public Student(String rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    public Student(String rollNo, String name, int age, boolean gender) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return this.rollNo + ", " + this.name;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (this.rollNo != null ? this.rollNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Student) {
            return this.rollNo.equals(((Student) other).rollNo);
        }
        return false;
    }
}
