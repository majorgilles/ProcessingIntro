import processing.core.PApplet;

/**
 * Created by meandmyself on 10/25/2014.
 */
public class AppletArrayHistog extends PApplet {
    int[] randomCounts;

    public void setup() {
        size(640, 240);
        randomCounts = new int[20];
    }

    public void draw() {
        background(255);

        int index = (int)random(randomCounts.length);
        randomCounts[index]++;
        stroke(0);
        fill(175);
        int width = this.width / randomCounts.length;

        for (int x = 0; x < randomCounts.length; ++x) {
            rect(x * width, height-randomCounts[x], width-1, randomCounts[x]);
        }
    }
}
