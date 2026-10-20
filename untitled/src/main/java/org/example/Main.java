package org.example;
import processing.core.PApplet;

class BouncyBall {
    PApplet p;
    float x,y;
    float xspeed, yspeed;

    //Constructor
    BouncyBall(PApplet p, float x, float y) {
        this.p = p;
        this.x = x;
        this.y = y;
    }

    void display() {
        xspeed = 2.5f;
        yspeed = 2.0f;
        x += xspeed;
        y += yspeed;
        if (x > p.width || x < 0) {
            xspeed *= -1;
        }
        if (y > p.height || y < 0 ) {
            yspeed *= -1;
        }
        p.stroke(0);
        p.fill(127);
        p.circle(x, y, 48);
    }

}

public class Main extends PApplet{
    int x = 100;
    int y = 100;
    BouncyBall localBouncyBall;

   public void settings() {
       size(700, 600);
   }

    public void setup() {
        localBouncyBall = new BouncyBall(this, width / 2f, height / 2f);
    }

    public void draw() {
       background(30);
       localBouncyBall.display();

    }

    static void main() {
        PApplet.main("Main");
        }
}
