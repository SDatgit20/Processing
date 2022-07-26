package OopApproach;

import processing.core.PApplet;

public class Balls {
        private PApplet frame;
        private int height,start,increasingFactor;
        private int radius=10;

        public Balls(PApplet frame, int height, int start, int increasingFactor){
            this.height=(height*increasingFactor)/5;
            this.start=start;
            this.increasingFactor=increasingFactor;
            this.frame = frame;
        }

        public void addBallsToFrame(){
            frame.ellipse(start,height,radius,radius);
        }

        public void moveBalls(){
            start+=increasingFactor;
        }

    }
