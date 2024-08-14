/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurant;

import javax.swing.JOptionPane;

/**
 *
 * @author asusi
 */
public class Restaurant {

    public static void main(String[] args) {
        String nombreCliente = JOptionPane.showInputDialog("Ingrese su nombre:");
        int codMenuPpal = 0;
        int platosPrincipales = 0;
        int platosTipicos = 0;
        int platosCarta = 0;
        int platosInternacionales = 0;
        boolean especialidadCasa = false;
        int precioTotal = 0;

        do {
            String menu = "MENU RESTAURANTE\n\n";
            menu += "1. Plato Principal\n";
            menu += "2. Plato Tipico\n";
            menu += "3. Plato a la Carta\n";
            menu += "4. Plato Internacional\n";
            menu += "5. Especialidad de la Casa\n";
            menu += "6. Salir\n\n";
            menu += "Por favor seleccione una opción\n";
            codMenuPpal = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (codMenuPpal) {
                case 1:
                    String menuPrincipal = "MENU PRINCIPAL\n\n";
                    menuPrincipal += "1. Filete de Res (COP 40.000)\n";
                    menuPrincipal += "2. Pollo al Ajillo (COP 32.000)\n";
                    menuPrincipal += "3. Pescado Frito (COP 38.000)\n";
                    menuPrincipal += "4. Regresar\n\n";
                    int codMenuPrincipal = Integer.parseInt(JOptionPane.showInputDialog(menuPrincipal));
                    switch (codMenuPrincipal) {
                        case 1:
                            platosPrincipales++;
                            precioTotal += 40000.0;
                            break;
                        case 2:
                            platosPrincipales++;
                            precioTotal += 32000.0;
                            break;
                        case 3:
                            platosPrincipales++;
                            precioTotal += 38000.0;
                            break;
                        case 4:
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "No corresponde a un código válido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                            break;
                    }
                    break;
                case 2:
                    String menuTipico = "MENU TIPICO\n\n";
                    menuTipico += "1. Ajiaco Colombiano (COP 25.000)\n";
                    menuTipico += "2. Empanadas Argentinas (COP 18.000)\n";
                    menuTipico += "3. Ceviche Peruano (COP 22.000)\n";
                    menuTipico += "4. Regresar\n\n";
                    int codMenuTipico = Integer.parseInt(JOptionPane.showInputDialog(menuTipico));
                    switch (codMenuTipico) {
                        case 1:
                            platosTipicos++;
                            precioTotal += 25000.0;
                            break;
                        case 2:
                            platosTipicos++;
                            precioTotal += 18000.0;
                            break;
                        case 3:
                            platosTipicos++;
                            precioTotal += 22000.0;
                            break;
                        case 4:
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "No corresponde a un código válido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                            break;
                    }
                    break;
                case 3:
                    String menuCarta = "MENU A LA CARTA\n\n";
                    menuCarta += "1. Hamburguesa Clásica (COP 15.000)\n";
                    menuCarta += "2. Ensalada de Pollo (COP 12.000)\n";
                    menuCarta += "3. Sándwich de Pernil (COP 18.000)\n";
                    menuCarta += "4. Regresar\n\n";
                    int codMenuCarta = Integer.parseInt(JOptionPane.showInputDialog(menuCarta));
                    switch (codMenuCarta) {
                        case 1:
                            platosCarta++;
                            precioTotal += 15000.0;
                            break;
                        case 2:
                            platosCarta++;
                            precioTotal += 12000.0;
                            break;
                        case 3:
                            platosCarta++;
                            precioTotal += 18000.0;
                            break;
                        case 4:
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "No corresponde a un código válido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                            break;
                    }
                    break;
                case 4:
                    String menuInternacional = "MENU INTERNACIONAL\n\n";
                    menuInternacional += "1. Pizza Italiana (COP 30.000)\n";
                    menuInternacional += "2. Sushi Japonés (COP 35.000)\n";
                    menuInternacional += "3. Curry Indio (COP 28.000)\n";
                    menuInternacional += "4. Regresar\n\n";
                    int codMenuInternacional = Integer.parseInt(JOptionPane.showInputDialog(menuInternacional));
                    switch (codMenuInternacional) {
                        case 1:
                            platosInternacionales++;
                            precioTotal += 30000.0;
                            break;
                        case 2:
                            platosInternacionales++;
                            precioTotal += 35000.0;
                            break;
                        case 3:
                            platosInternacionales++;
                            precioTotal += 28000.0;
                            break;
                        case 4:
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "No corresponde a un código válido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                            break;
                    }
                    break;
                case 5:
                    especialidadCasa = true;
                    precioTotal += 40000.0;
                    JOptionPane.showMessageDialog(null, "Ha seleccionado la Especialidad de la Casa: Bandeja Paisa");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Gracias por su visita. A continuación, le presentamos su factura:");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No corresponde a un código válido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        } while (codMenuPpal != 6);

        String factura = "FACTURA\n\n";
        factura += "Nombre del cliente: " + nombreCliente + "\n";
        factura += "Platos Principales: " + platosPrincipales + "\n";
        factura += "Platos Tipicos: " + platosTipicos + "\n";
        factura += "Platos a la Carta: " + platosCarta + "\n";
        factura += "Platos Internacionales: " + platosInternacionales + "\n";
        factura += "Especialidad de la Casa: " + (especialidadCasa ? "Si" : "No") + "\n";
        factura += "Precio Total: COP " + precioTotal + "\n";
        JOptionPane.showMessageDialog(null, factura);
        
        System.out.println(factura);
    }
}
