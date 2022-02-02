/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablero;

/**
 *
 * @author pmaca
 */
import javax.swing.JOptionPane;




public class Tablero {

 
    public static void main(String[] args) {
        
        JOptionPane pane = new JOptionPane();

        Jugador play1 = new Jugador("Pablo", 0, "No Ganador");
        Jugador play2 = new Jugador("Daniela", 0, "No Ganador");
        Play play = new Play();
       
        String opcion = "0";
        boolean lanzaP1 = false;
        int dado = 0;
        while (!opcion.equals("4")) {
            opcion = JOptionPane.showInputDialog(
                    "1.- Turno Juagador 1"+"\n"
                    + "	2.-Turno Juagador 2"+"\n"
                    + "	3.- Posciciones"+"\n"
                    + "	4.- Salir");

            switch (opcion) {
                case "1":
                    if (!lanzaP1) {
                        dado = play.dado();
                        JOptionPane.showMessageDialog(null, "Resultado de la jugada es: " + dado);
                        play1.SetAposicion(dado);
                        if (play1.posicion == 6) {
                            JOptionPane.showMessageDialog(null, "OOO casilla 6, Retrocede 2 posiciones");
                            play1.SetRestar(2);
                        } else if (play1.posicion == 12) {
                            JOptionPane.showMessageDialog(null, "OOO casilla 12, retrocede 3 posiciones");
                            play1.SetRestar(3);
                        }
                        lanzaP1 = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Turno de Lanzador 2");
                    }
                    break;
                case "2":
                    if (!lanzaP1) {
                        JOptionPane.showMessageDialog(null, "Turno de Lanzador 1");
                    } else {
                        dado = play.dado();
                        JOptionPane.showMessageDialog(null, "Resultado de la jugada es: " + dado);
                        play2.SetAposicion(dado);

                        if (play2.posicion == 6) {
                            JOptionPane.showMessageDialog(null, "OOO casilla 6, Retrocede 2 posiciones");
                            play2.SetRestar(2);
                        } else if (play2.posicion == 12) {
                            JOptionPane.showMessageDialog(null, "OOO casilla 12, Retrocede 3 posiciones");
                            play2.SetRestar(3);
                        }
                    }
                    lanzaP1 = false;
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null,
                            "Datos Jugador 1 \n"
                            + "Nombre: " + play1.nombre + " - " + " Casilla Actual: " + play1.posicion + " - " + " Estado: " + play1.estado + "\n"
                            + "Datos Jugador 2" + "\n"
                            + "Nombre: " + play2.nombre + " - " + " Casilla Actual: " + play2.posicion + " - " + " Estado: " + play2.estado + "\n");

                    break;
                case "4":
                    break;
                default:
            }
            Jugador ganador = null;
            if (play1.posicion >= 21) {
                play1.setEstado("WIN");
                opcion = "4";
                ganador = play1;
            } else if (play2.posicion >= 21) {
                play2.setEstado("WIN");
                opcion = "4";
                ganador = play2;
            }
            if (ganador != null) {
                JOptionPane.showMessageDialog(null, "GANADOR DEL LUDOD ES: " + ganador.nombre + " FELIZITACIONES");
                opcion = "4";
            }
        }

    }

}
