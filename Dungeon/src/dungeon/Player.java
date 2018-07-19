package dungeon;

import java.util.*;

public class Player implements Character {

    private int x;
    private int y;
    private int fullX;
    private int fullY;
    private boolean alive;

    public Player(int fullX, int fullY) {
        this.x = 0;
        this.y = 0;
        this.fullX = fullX;
        this.fullY = fullY;
        this.alive = true;
    }

    @Override
    public String getName() {
        return "@";
    }

    @Override
    public int locationX() {
        return this.x;
    }

    @Override
    public int locationY() {
        return this.y;
    }

    public void changeLoc(String s) {

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'w') {

                if (!(this.x - 1 < 0)) {
                    this.x -= 1;
                }

            } else if (chars[i] == 's') {
                if (!(this.x + 1 >= fullX)) {
                    this.x += 1;
                }

            } else if (chars[i] == 'a') {
                
                if (!(this.y - 1 < 0)) {
                    this.y -= 1;
                }                

            } else if (chars[i] == 'd') {
                
                if (!(this.y + 1 >= fullY)) {
                    this.y += 1;
                }                

            } else {

            }
        }

    }

    @Override
    public boolean isAlive() {
        return this.alive;
    }

    @Override
    public void kill() {
        this.alive = false;
    }

    @Override
    public String toString() {
        return getName() + " " + this.x + " " + this.y;
    }

}
