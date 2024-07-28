/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises;

/**
 *
 * @author asusi
 */
public class i_b_ten_two {
    public static void main(String[] args) {
             int[] arreglo1 = {5, 8, 9, 2, 3};
        int[] arreglo2 = {7, 9, 2, 6, 4};

        if (arreglo1.length != arreglo2.length) {
            
            throw new IllegalStateException("ERROR");
        }

        int[] suma = new int[arreglo1.length];

        for (int i = 0; i < arreglo1.length; i++) {
            
            suma[i] = arreglo1[i] + arreglo2[i];
        }

        System.out.print("Suma de los arreglos: ");
        for (int i = 0; i < suma.length; i++) {
            
            System.out.print(suma[i] + " ");
        }
    }
}
