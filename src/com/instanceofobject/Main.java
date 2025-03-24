// Java program to demonstrate that instanceof returns false for null
package com.instanceofobject;

// Test class
class Test {

}

// Main class
public class Main {

    // Method main to run java program
    public static void main(String[] args) {
        // Object of class Test with null value
        Test test = null;

        if (test instanceof Test) {
            System.out.println("test is instanceof Test");
        } else {
            System.out.println("test is NOT instanceof Test");
        }
    }
}