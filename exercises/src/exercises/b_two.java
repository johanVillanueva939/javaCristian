/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises;

/**
 *
 * @author asusi
 */
public class b_two {
    
    public static void main(String[] args) {
        //IMPLICITO
        
            //Entero a decimal
            int entero = 11;
            double decimal = entero;

            System.out.println("El entero se convirtio a decimal: " + decimal);

            //byte a int
            byte a = 127;
            int b = a;
            System.out.println("De byte a int: " + b);
            
        //EXPLICITO
            
            String precio="120.4";
            String cantidad="10";
            
            double precioNum = Double.parseDouble(precio);
            int cantidadInt = Integer.parseInt(cantidad);
            
            System.out.println("De cadena de texto (String) a decimales (double): "+precioNum);
            System.out.println("De cadena de texto (String) a entero (int): "+cantidadInt);
    }
    
}