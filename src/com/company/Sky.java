package com.company;
import ecs100.UI;

import java.awt.*;

public class Sky {

    public void draw() {
	// write your code here
        Star s;
        while (true) {
            s = new Star();
            s.draw();
        }
    }
    public void setupGUI(){
        UI.addButton("Draw",this::draw);
        UI.addButton("Quit", UI::quit);
        UI.setColor(Color.BLACK);
        UI.fillRect(0,0,800,600);
    }

    public static void main(String[] args){
        Sky mysky = new Sky();
        mysky.setupGUI();
    }




}
