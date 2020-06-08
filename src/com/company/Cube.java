/* Module 2. Task 2
 * Classname: Cube
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

//Create new class
public class Cube {
    private int sideCube;
    //Generate Constructor without parameter
    public Cube() {
    }
    //Generate Constructor with parameter
    public Cube(int sideCube) {
        this.sideCube = sideCube;
    }
    //Generate Getter
    public int getSideCube() {
        return sideCube;
    }
    //Generate Setter
    public void setSideCube(int sideCube) {
        this.sideCube = sideCube;
    }
    //Volume Method1
    public double getVolume(){
        return Math.pow(this.getSideCube(),3);
    }
    //Area Method2
    public double getArea(){
        return 6 * Math.pow(this.getSideCube(),2);
    }
    //Length Method3
    public double getLength(){
        return 12 * this.getSideCube();
    }
    //Diagonal Method4
    public double getDiagonalCube(){
        return this.getSideCube() * Math.sqrt(3);
    }
    //Radius Method5
    public double getRadiusSphereInCube(){
        return this.getSideCube()/2;
    }
    //Area Base Method6
    public double getAreaBase(){
        return this.sideCube * this.sideCube;
    }

    //To Strtig() Method
    @Override
    public String toString() {
        return "Cube{" +
                " sideCube=" + this.getSideCube() +
                " volume=" + this.getVolume() +
                " area=" + this.getArea() +
                " length=" + this.getLength()+
                " diagonal=" + this.getDiagonalCube() +
                " radius=" + this.getRadiusSphereInCube()+
                '}';
    }
//Equals Method

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cube)) return false;
        Cube cube = (Cube) o;
        return getSideCube() == cube.getSideCube();
    }
    //HashCode Method
    @Override
    public int hashCode() {
        return Objects.hash(getSideCube());
    }
}