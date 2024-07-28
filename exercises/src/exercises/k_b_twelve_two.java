/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises;

import java.util.Hashtable;
import java.util.Enumeration;

/**
 *
 * @author asusi
 */
public class k_b_twelve_two {
    public static void main(String[] args) {
        
        
        
        Hashtable<String,String> mc = new Hashtable<>();
        
        mc.put("Hallo", "Jefe maestro");
        mc.put("God of War", "Kratos");
        mc.put("Baki", "Baki");
        mc.put("Doom", "Doom Guy");
        mc.put("Hallo", "Jefe maestro");
        
          Enumeration<String> enumeration = mc.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println("Protas: " + enumeration.nextElement());
        }
        
    }
}
