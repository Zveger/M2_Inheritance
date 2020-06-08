/* Module 2. Task 2
 * Classname: Square
 *
 * Version 1
 *
 * Zviertsev Herman, NTU KhPI
 *
 *1. Create a child  from the class Rectangle.
 *2. Create another class as a super class for your one.  Or create a daughterly class for your one.
 */
package com.company;
// Child Class Square
public class Square extends Cube{
    int sideA;
//Constructor
    public Square(int sideA) {
        super(sideA);
        this.sideA = sideA;
    }
//Getter
    public int getSideA() {
        return sideA;
    }
//Setter
    public void setSideA(int sideA) {
        this.sideA = sideA;
    }
//Method Area
    @Override
    public double getArea() {
        return super.getAreaBase();
    }
//Method Length Square
    public double getLengthSquare(){
        return sideA * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideA=" + sideA +
                "Area = " + this.getArea() +
                "Perimeter " + this.getLength() +
                '}';
    }
}
