/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpubattle;

import java.util.ArrayList;

/**
 *
 * @author bruno
 */
public class Test {
    
    private int fps;
    
    Pc pc = new Pc();
    //Game[]game = new Game[5];
    ArrayList<Game> game;
    
    public String costPerFrame() {
        for (int i = 0; i < game.size(); i++) {
            
        }
        return "cost per frame is: " +  fps / pc.getCost();
    }

    public int getFps() {
        return fps;
    }

    public void setFps(int fps) {
        this.fps = fps;
    }
    
    
    
}
