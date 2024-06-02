/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que16;

/**
 *
 * @author isharaLakshitha
 */
import java.util.Vector;

public class que16 {
    public static void main(String[] args) {
        // Create a Vector
        Vector<Object> vector = new Vector<>();
        
        // Add elements to the Vector
        vector.add("String"); // Adding a String
        vector.add(10);       // Adding an integer (autoboxed to Integer)
        vector.add(3.14);     // Adding a double (autoboxed to Double)
        vector.add(new MyClass()); // Adding an object of a custom class
        
        // Print the Vector
        System.out.println("Vector: " + vector);
    }
    
    static class MyClass {
        // Define your custom class here
    }
}
