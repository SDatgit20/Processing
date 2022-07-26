package OopApproach;

import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class Frame extends PApplet {
    private List<Balls> balls=new ArrayList<>();
    private int width=640;
    private int height=480;
    private int start=0;

    @Override
    public void settings() {
        size(width,height);
        for(int i=1;i<=4;i++)
        balls.add(new Balls(this,height,start,i));
    }

    @Override
    public void draw() {
             for (Balls ball : balls) {
                 ball.addBallsToFrame();
                 ball.moveBalls();
             }
        }
}
