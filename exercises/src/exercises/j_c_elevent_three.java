/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author asusi
 */
public class j_c_elevent_three {
    public static void main(String[] args) {
        
        ArrayList<String> Nombre = new ArrayList<String>();
        
        String Usuario = JOptionPane.showInputDialog(null,"Ingrese su nombre");
        
        Nombre.add(Usuario);
        
        JOptionPane.showMessageDialog(null, "Nombres: "+Nombre);
        System.out.println(Nombre);
        
    }
}
