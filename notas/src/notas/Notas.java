/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author asusi
 */
public class Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Map<String, Object>> aprendices = new ArrayList<>();
            
         int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes"));

        for (int i = 0; i < n; i++) {
            
            Map<String, Object> aprendiz = new HashMap<>();
            aprendiz.put("nombre", JOptionPane.showInputDialog("Ingrese el nombre del estudiante " + (i + 1)));

            double[] notase = new double[3];
            for (int j = 0; j < 3; j++) {
                while (true) {
                    try {
                        notase[j] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota " + (j + 1) + " del estudiante " + (i + 1)));
                        if (notase[j] < 0 || notase[j] > 5) {
                            JOptionPane.showMessageDialog(null, "Nota inválida. Ingrese una nota entre 0 y 5");
                        } else {
                            break;
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Ingrese un valor numérico");
                    }
                }
            }
            aprendiz.put("notase", notase);
            aprendices.add(aprendiz);
        }
        int cantidadAprendices = aprendices.size();
        int cantidadNotas = cantidadAprendices * 3;
        int pasaron = 0;
        int perdieron =0;
        int recuperan =0;
        int perdieronDefinitivamente = 0;
        double promedioNotaFinal = 0;
        
            for (Map<String, Object> aprendiz : aprendices) {
                
                double[] notase = (double[]) aprendiz.get("notase");
                double notaFinal = (notase[0] + notase[1] + notase[2]) / 3;
                aprendiz.put("Nota Final", notaFinal);
                promedioNotaFinal += notaFinal;
                
                    if (notaFinal >= 3.5) {
                        
                        pasaron++;
                }else{
                        
                        perdieron++;
                            
                        if (notaFinal >= 2) {
                            
                            recuperan++;
                        }else{
                            
                            perdieronDefinitivamente++;
                        }
                    }
            }
            
            double promedioNotasFinales = promedioNotaFinal / cantidadAprendices;
            
            String datosFinales = "Resultados: \n\n"
                    + "Cantidad total de aprendices SENA: "+cantidadAprendices+"\n"
                    + "Cantidad total de notas: "+cantidadNotas+"\n"
                    + "Cantidad de aprendices que aprobaron: "+pasaron+"\n"
                    + "Cantidad de aprendices que perdieron: "+perdieron+"\n"
                    + "Cantidad de aprendices que pueden recuperar: "+recuperan+"\n"
                    + "Cantidad de aprendices que perdieron definitavemente: "+perdieronDefinitivamente+"\n\n"
                    + "Promedio de las notas finales de los aprendices: "+promedioNotasFinales+"\n\n"
                    + "Total de aprendices y sus notas finales: \n";
                    for (Map<String, Object> aprendiz : aprendices) {
            
                        datosFinales += aprendiz.get("nombre")+ " Final: "+ aprendiz.get("Nota Final")+"\n";
                    }
                    JOptionPane.showMessageDialog(null, datosFinales);
    }
    
}
