/* Module 2. Task 2
 * Classname: Rectangle
 *
 * Version 1
 *
 * Zviertsev Herman, NTU KhPI
 *
 *1. Create a child  from the class Rectangle.
 *2. Create another class as a super class for your one.  Or create a daughterly class for your one.
 */
package com.company;

import java.util.Objects;

public class Rectangle {

    private int id;
    private int length;
    private int width;
    public final double PI = 3.14;

    public Rectangle(int id, int length, int width) {
        this.id = id;
        this.length = length;
        this.width = width;
    }


    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getArea(){
        return this.getLength() * this.getWidth();
    }

    public static int getArea(int length, int width) {
        return length * width;
    }

    public boolean isQuadrat() {
        return false;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return getId() == rectangle.getId();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "id = " + id +
                ", length = " + length +
                ", width = " + width +
                '}';
    }
}