/* Module 2. Task 2
 * Classname: Main
 *
 * Version 1
 *
 * Zviertsev Herman, NTU KhPI
 *
 *1. Create a child  from the class Rectangle.
 *2. Create another class as a super class for your one.  Or create a daughterly class for your one.
 */
package com.company;

public class Main {

    public static void main(String[] args) {
        Cube cube1 = new Cube(5);
        System.out.println(cube1);
        System.out.println(cube1.hashCode());
        Cube cube2 = new Cube(2+3);
        boolean equals = cube1.equals(cube2);
        System.out.println(equals);

    }
}
