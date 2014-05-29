/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s05.lists.model;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class Classes {

    private String className;
    private String location;

    public Classes() {
    }

    public Classes(String className, String location) {
        this.className = className;
        this.location = location;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return className;
    }
}
