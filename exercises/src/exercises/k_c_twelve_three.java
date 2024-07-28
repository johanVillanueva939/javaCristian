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
public class k_c_twelve_three {
    public static void main(String[] args) {
        
        Hashtable<String, Integer> inventario = new Hashtable<>();
        
        inventario.put("Manzanas", 50);
        inventario.put("Naranjas", 30);
        inventario.put("Platanos", 20);

        System.out.println("Cantidad de Naranjas: " + inventario.get("Naranjas"));

        Enumeration<String> claves = inventario.keys();
        while (claves.hasMoreElements()) {
            String key = claves.nextElement();
            System.out.println("Fruta: " + key + ", Cantidad: " + inventario.get(key));
        }

        inventario.remove("Platanos");
        System.out.println("Despues de eliminar Platanos: " + inventario);
        
    }
}
