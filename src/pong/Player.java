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
public class Player {
    
    public  boolean right,left;
    
    public int x,y;
    
    public int width, height;
    
    public Player(int x, int y){
        this.x = x;
        this.y = y;
        this.width = 40;
        this.height = 5;
    }
    
    public void tick(){
        if(right){
            x++;
        }else if(left){
            x--;
        }
        
        if(x+ width > Game.WIDTH){
            x = Game.WIDTH - width;
        }else if(x<0){
            x = 0;
        }
    }
    
    public void render(Graphics g){
        g.setColor(Color.blue);
        g.fillRect(x, y, width, height);
    }
}
