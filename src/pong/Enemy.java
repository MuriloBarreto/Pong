/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pong;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author barre
 */
public class Enemy {
    
    public double  x,y;
    public int widht,height;
    
    public Enemy(int x, int y){
        this.x = x;
        this.y = y;
        this.widht = 40;
        this.height = 5;
    }
    
    public void tick(){
        x+= (Game.ball.x - x - 6) * 0.07;
    }
    
    public void render(Graphics g){
        g.setColor(Color.red);
        g.fillRect((int)x,(int)y, widht, height);
    }
}
