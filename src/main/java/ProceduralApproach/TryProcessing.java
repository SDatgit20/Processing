package ProceduralApproach;

import processing.core.PApplet;

public class TryProcessing extends PApplet {
    public static void main(String[] args){
       PApplet.main("ProceduralApproach.TryProcessing",args);
    }
    public final int height=480;
    public final int weight=640;

    public final int radius=10;
    int s1=0;
    int s2=0;
    int s3=0;
    int s4=0;

    @Override
    public void settings() {
        super.settings();
        size(weight,height);
    }

    @Override
    public void draw() {
        ellipse(s1, height / 5, 10, 10);
        s1 += 1;
        ellipse(s2, (2 * height) / 5, 10, 10);
        s2 += 2;
        ellipse(s3, (3 * height) / 5, 10, 10);
        s3 += 3;
        ellipse(s4, (4 * height) / 5, 10, 10);
        s4 += 4;
    }
}
