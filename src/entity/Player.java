package entity;

import java.awt.Graphics2D;

import main.GamePanel;
import main.KeyHandler;

public class Player  extends Entity{

    GamePanel gp;
    KeyHandler KeyH;

    public Player(GamePanel gp, KeyHandler KeyH){
        this.gp = gp;
        this.KeyH = KeyH;
        setDefaultValues();
    }
    public void setDefaultValues() {
        x = 100;
        y = 100;
        speed = 4;
    }
    public void update(){
        if (keyH.upPressed == true) {
            y -= speed;
        } 
        else if (keyH.downPressed == true) {
            y += speed;
        }
        else if (keyH.leftPressed == true) {
            x -= speed;
        } else if (keyH.rightPressed == true) {
            x += speed;
        }
    }
    public void draw(Graphics2D g2){
         g2.setColor(Color.white);

        g2.fillRect(x,y, gp.tileSize, gp.tileSize);
    }

}