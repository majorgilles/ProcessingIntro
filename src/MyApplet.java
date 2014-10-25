import processing.core.PApplet;

/**
 * Created by meandmyself on 10/25/2014.
 */

public class MyApplet extends PApplet {
    private DownRightWalker walker;
    public void setup() {
        size(640, 780);
        walker = new DownRightWalker();
        background(255);
    }

    public void draw() {
        walker.step();
        walker.display();
    }

    public abstract class BaseWalker {
        float x, y;
        BaseWalker() {
            x = width/2;
            y = height/2;
        }

        public void display() {
            stroke(0);
            point(x, y);
        }


    }

    public class FloatWalker extends BaseWalker {
        public void step() {

            float stepx = random(-1, 1);
            float stepy = random(-1, 1);

            x += stepx;
            y += stepy;
        }
    }
    public class DownRightWalker extends BaseWalker {
        public void step() {
            float stepx = random(-1, 2);
            float stepy = random(-1, 2);

            x += stepx;
            y += stepy;
        }
    }
}


