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
public class Play {
        int dado;
    
    
    public int dado() {
        return (int)(Math.random() * ((6 - 1) + 1)) + 1;
    }

    
}
