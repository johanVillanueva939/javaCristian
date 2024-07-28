/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises;


import java.util.HashMap;
import java.util.Scanner;


/**
 *
 * @author asusi
 */
public class l_a_thirteen_one {
    public static void main(String[] args) {
        HashMap<String, Float> listaProductos = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int opcionElegida = 0;
        float precio;
        String codigo;

        while (opcionElegida != 5) {
            System.out.println("Introduce el numero de la opción que quieras:");
            System.out.println("1.- Introducir producto");
            System.out.println("2.- Modificar precio");
            System.out.println("3.- Mostrar todos los productos");
            System.out.println("4.- Eliminar producto");
            System.out.println("5.- Salir");
            opcionElegida = sc.nextInt();

            switch(opcionElegida) {
                case 1:
                    System.out.println("Introduce el codigo del producto:");
                    codigo = sc.next();
                    System.out.println("Introduce el precio del producto:");
                    precio = sc.nextFloat();
                    guardarProducto(codigo, precio, listaProductos);
                    break;
                case 2:
                    System.out.println("Introduce el codigo del producto del que quieres cambiar el precio:");
                    codigo = sc.next();
                    modificaPrecio(codigo, listaProductos);
                    break;
                case 3:
                    mostrarProductos(listaProductos);
                    break;
                case 4:
                    System.out.println("Introduce el codigo del producto que quieres eliminar:");
                    codigo = sc.next();
                    eliminaProducto(codigo, listaProductos);
                    break;
                case 5:
                    break;   // Si la opcion es 5 no se hace nada 
                default:
                    System.out.println("Tienes que introducir una opción valida");
            }
        }
    }

    public static void guardarProducto(String codigo, float precio, HashMap<String, Float> listaProductos) {
        listaProductos.put(codigo, precio);
        System.out.println("Producto guardado.");
    }

    public static void modificaPrecio(String codigo, HashMap<String, Float> listaProductos) {
        Scanner sc = new Scanner(System.in);
        if (listaProductos.containsKey(codigo)) {
            System.out.println("Introduce el nuevo precio:");
            float nuevoPrecio = sc.nextFloat();
            listaProductos.put(codigo, nuevoPrecio);
            System.out.println("Precio modificado.");
        } else {
            System.out.println("El producto no existe.");
        }
    }

    public static void mostrarProductos(HashMap<String, Float> listaProductos) {
        if (listaProductos.isEmpty()) {
            System.out.println("No hay productos en la lista.");
        } else {
            for (String codigo : listaProductos.keySet()) {
                System.out.println("Codigo: " + codigo + ", Precio: " + listaProductos.get(codigo));
            }
        }
    }

    public static void eliminaProducto(String codigo, HashMap<String, Float> listaProductos) {
        if (listaProductos.containsKey(codigo)) {
            listaProductos.remove(codigo);
            System.out.println("Producto eliminado.");
        } else {
            System.out.println("El producto no existe.");
        }
    }
}
