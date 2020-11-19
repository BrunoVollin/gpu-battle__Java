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
public class SetOfTests {
    private int fps = 0;
    ArrayList<Test> tests;
    Pc pc;

    public SetOfTests(ArrayList<Test> tests) {
        this.tests = tests;
        
        for(Test test : tests) {
            this.fps += test.getFps();
        }
        System.out.println("Fps:"  + fps);
    }

    public int getFps() {
        return fps;
    }

    public void setFps(int fps) {
        this.fps = fps;
    }
    
    
    
}
