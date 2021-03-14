package com.company;

import ecs100.UI;
import java.awt.*;
import java.util.Random;


public class Star {
    private static Random rng = new Random();
    private Double[] xPoints, yPoints;
    private double xMid, yMid;
    private Color colour;
    private int size, npts;
    public Star(){
        this.xMid = 800*rng.nextFloat();
        this.yMid = 600*rng.nextFloat();
        float rd = rng.nextFloat();
        float gr = rng.nextFloat();
        float bl = rng.nextFloat();
        this.colour = new Color(rd,gr,bl);
        this.size = 5 + rng.nextInt(10);
        this.npts = 5 + rng.nextInt(10);
        xPoints = new Double[this.npts];
        yPoints = new Double[this.npts];
        for (int i=0 ; i<this.npts; i++){
            xPoints[i] = this.xMid + this.size * Math.sin(i*2*3.14);
        }

    }
    public void draw(){
        UI.setColor(this.colour);
        UI.fillRect(this.xMid,this.yMid,this.size,this.size);
        UI.sleep(100);
    }
}
