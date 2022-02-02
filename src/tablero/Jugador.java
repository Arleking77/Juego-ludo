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
public class Jugador {
    public String nombre,estado;
    public int posicion;
   

    public Jugador(String nombreJugador, int posicion, String estado) {
        this.nombre = nombreJugador;
        this.posicion = posicion;
        this.estado = estado;
    }

    public void SetAposicion(int posicion) {
        this.posicion += posicion;
    }

    public void SetRestar(int restar) {
        this.posicion -= restar;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    public int getPosicion(){
        return this.posicion;
    }
    
    public String MostrarDatos(){
        return "Jugador: "+this.nombre + " Posicion: " + this.posicion + " Estado: "+ this.estado;
    }

    
}
