/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises;

import javax.swing.JOptionPane;

/**
 *
 * @author asusi
 */
public class h_c_nine_three {
    public static void main(String[] args) {
        
            int fugamos = JOptionPane.showConfirmDialog(null, "Jugamos? \n \n Encuentra el tesoro!!", "El Misterio del Bosque Encantado",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
            if (fugamos == JOptionPane.YES_OPTION) {
                
            String[] seccion1 = {" 1 ", " 2 ", " 3 "};
            
            int seccion1Opcion = JOptionPane.showOptionDialog(null, "Sección 1: La Entrada del Bosque \n \n "
                    + "Te encuentras en la entrada del bosque. El aire es fresco y puedes escuchar el canto de los pájaros. Hay tres caminos frente a ti: \n \n "
                    + "1.Tomar el camino de la izquierda, que parece estar menos transitado. \n "
                    + "2.Seguir el camino del medio, que está bien marcado y parece seguro. \n "
                    + "3.Elegir el camino de la derecha, que está cubierto de enredaderas y parece misterioso. "
                    + "\n \n QUE HACES?", "Juguemos..." , 0, JOptionPane.PLAIN_MESSAGE, null, seccion1, null);
            
                    
                    if (seccion1Opcion == 0) {
                    
                         int seccion2Opcion = JOptionPane.showOptionDialog(null, "Opción 1: El Camino de la izquierda \n \n "
                                 + "Has elegido el camino de la izquierda. El sendero es estrecho y lleno de vegetación. De repente, escuchas un ruido extraño detrás de unos arbustos. \n \n "
                                 + "1.Investigar el ruido, acercándote con cautela. \n "
                                 + "2.Ignorar el ruido y seguir caminando. \n "
                                 + "3.Regresar a la entrada del bosque para tomar otro camino. "
                                 + "\n \n ¿Qué decides hacer?", "Juguemos..." , 0, JOptionPane.PLAIN_MESSAGE, null, seccion1, null);
                         
                        if (seccion2Opcion == 0) {
                            
                             JOptionPane.showMessageDialog(null, "Opción 1: Investigar el ruido \n \n "
                                     + "Al investigar el ruido, descubres que proviene de una trampa oculta. Sin darte cuenta, activas un mecanismo que hace caer una red sobre ti, atrapándote. \n A pesar de tus esfuerzos, no logras liberarte y el bosque se convierte en tu última morada.","MUERTE!!💀",JOptionPane.PLAIN_MESSAGE);
                        }else if (seccion2Opcion == 1) {
                            
                             JOptionPane.showMessageDialog(null, "Opción 2: Ignorar el ruido \n \n "
                                     + "Sigues caminando y encuentras un grupo de animales protegiendo un cofre lleno de tesoros. Al abrirlo, encuentras joyas y monedas de oro. ¡Has encontrado el tesoro oculto del bosque encantado!","Final 1:",JOptionPane.PLAIN_MESSAGE);
                        }else if (seccion2Opcion == 2) {
                            
                             JOptionPane.showMessageDialog(null, "Opción 3: Regresar a la entrada del bosque \n \n "
                                     + "Al regresar a la entrada del bosque, sientes una presencia extraña siguiéndote. De repente, te das cuenta de que el bosque no te dejará ir tan fácilmente. \n Las sombras a tu alrededor comienzan a moverse y te rodean. Sientes un dolor agudo y caes al suelo, incapaz de moverte. El bosque ha reclamado otra víctima, y tu historia termina en la oscuridad eterna.","MUERTE!!💀",JOptionPane.PLAIN_MESSAGE);
                        }
                        
                        }else if (seccion1Opcion == 1) {

                            int seccion3Opcion = JOptionPane.showOptionDialog(null, "Opción 2: El Camino del medio \n \n "
                                         + "Has elegido el camino del medio. El sendero es amplio y fácil de seguir. Después de caminar un rato, encuentras una cabaña abandonada. \n \n "
                                         + "1.Entrar en la cabaña para investigar. \n "
                                         + "2.Rodear la cabaña y seguir adelante. \n "
                                         + "3.Descansar un momento frente a la cabaña antes de continuar. "
                                         + "\n \n ¿Qué decides hacer?", "Juguemos..." , 0, JOptionPane.PLAIN_MESSAGE, null, seccion1, null);

                                if (seccion3Opcion == 0) {

                                    JOptionPane.showMessageDialog(null, "Opción 1: Entrar en la cabaña \n \n "
                                             + "Dentro de la cabaña, encuentras un diario antiguo que cuenta la historia de un mago y revela secretos mágicos del bosque. Este conocimiento te guiará en futuras aventuras.","Final 2:",JOptionPane.PLAIN_MESSAGE);
                                }else if (seccion3Opcion == 1) {

                                    JOptionPane.showMessageDialog(null, "Opción 2: Rodear la cabaña \n \n "
                                             + "Al rodear la cabaña, encuentras un jardín oculto lleno de plantas mágicas. Decides recoger algunas para estudiar sus propiedades. Aunque no encontraste un \n tesoro, has descubierto algo valioso para futuras investigaciones.","Final 3:",JOptionPane.PLAIN_MESSAGE);

                                }else if (seccion3Opcion == 2) {

                                    JOptionPane.showMessageDialog(null, "Opción 3: Descansar frente a la cabaña \n \n "
                                             + " Mientras descansas, un anciano aparece y te cuenta historias sobre el bosque encantado. Sin embargo, el anciano resulta ser un espíritu vengativo que \n te atrapa en un sueño eterno del que nunca despertarás.","MUERTO!!💀",JOptionPane.PLAIN_MESSAGE);

                                }


                        }else if (seccion1Opcion == 2) {
                    
                             int seccion4Opcion = JOptionPane.showOptionDialog(null, "Opción 3: El Camino de la derecha \n \n "
                                         + "Has elegido el camino de la derecha. El sendero está cubierto de enredaderas y es difícil de seguir. De repente, encuentras una bifurcación en el camino. \n \n "
                                         + "1.Tomar el camino de la izquierda en la bifurcación. \n "
                                         + "2.Tomar el camino de la derecha en la bifurcación. \n "
                                         + "3.Regresar a la entrada del bosque para tomar otro camino. "
                                         + "\n \n ¿Qué decides hacer?", "Juguemos..." , 0, JOptionPane.PLAIN_MESSAGE, null, seccion1, null);
                             if (seccion4Opcion == 0) {
                                 
                                JOptionPane.showMessageDialog(null, "Opción 1: Tomar el camino de la izquierda en la bifurcación \n \n "
                                                 + " Al tomar el camino de la izquierda en la bifurcación, te encuentras con una antigua trampa de cazadores. Sin darte cuenta, activas un mecanismo \n que hace que una serie de lanzas afiladas se disparen desde el suelo. Las lanzas te atraviesan, y el dolor es insoportable. El bosque ha reclamado \n otra víctima de manera brutal y sangrienta, dejando tu cuerpo como una advertencia para futuros aventureros."," MUERTE!!💀",JOptionPane.PLAIN_MESSAGE);
                             }else if (seccion4Opcion == 1) {
                                 
                                 JOptionPane.showMessageDialog(null, "Opción 2: Tomar el camino de la derecha en la bifurcación \n \n "
                                                 + " Encuentras una cueva oculta con cristales mágicos que emiten una luz brillante. Decides llevar algunos cristales contigo. Aunque no encontraste \n un tesoro, has descubierto algo valioso para futuras aventuras."," Final 4:",JOptionPane.PLAIN_MESSAGE);
                             }else if (seccion4Opcion == 2) {
                            
                                 JOptionPane.showMessageDialog(null, "Opción 3: Regresar a la entrada del bosque \n \n "
                                                 + "Al regresar a la entrada del bosque, sientes una presencia extraña siguiéndote. De repente, las sombras a tu alrededor cobran vida y te atacan con \n una furia indescriptible. Eres arrastrado hacia la oscuridad, donde criaturas grotescas te desgarran sin piedad. El bosque se asegura de que tu \n final sea tan espantoso que nadie más se atreva a desafiar sus secretos. "," MUERTE!!💀",JOptionPane.PLAIN_MESSAGE);
                        }
                              
                        }
            
        }else{
                
                JOptionPane.showMessageDialog(null, "TU TE LO PIERDES");
        }
                
        
    }
}
