/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import gameoflife.GameOfLifeBoard;
import java.util.*;

public class PersonalBoard extends GameOfLifeBoard {

    public PersonalBoard(int length, int height) {
        super(length, height);
    }

    @Override
    public void turnToLiving(int x, int y) {
        try{
            getBoard()[x][y] = true;
        } catch (Exception e){
            
        }
        
    }

    @Override
    public void turnToDead(int x, int y) {
        if (x < this.getWidth() && y < this.getHeight() && x >= 0 && y >= 0) {
            this.getBoard()[x][y] = false;
        }
    }

    @Override
    public boolean isAlive(int x, int y) {

        try {
            if (x <= this.getWidth() && y <= this.getHeight() && x >= 0 && y >= 0) {
                return this.getBoard()[x][y];
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void initiateRandomCells(double probabilityForEachCell) {
        int refer = 100;
        Random random = new Random();
        for (int i = 0; i < this.getWidth(); i++) {
            for (int j = 0; j < this.getHeight(); j++) {

                //figure out the probability here
                int ran = random.nextInt(100);
                if ((double) ran / 100 < probabilityForEachCell) {
                    this.turnToLiving(i, j);
                } else {
                    this.turnToDead(i, j);
                }

            }
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {
        int count = 0;

        if (this.isAlive(x - 1, y - 1)) {
            count++;
        }
        if (this.isAlive(x, y - 1)) {
            count++;
        }
        if (this.isAlive(x + 1, y - 1)) {
            count++;
        }
        if (this.isAlive(x - 1, y)) {
            count++;
        }
        if (this.isAlive(x + 1, y)) {
            count++;
        }
        if (this.isAlive(x - 1, y + 1)) {
            count++;
        }
        if (this.isAlive(x, y + 1)) {
            count++;
        }
        if (this.isAlive(x + 1, y + 1)) {
            count++;
        }

        return count;
    }

    @Override
    public void manageCell(int x, int y, int livingNeighbours) {
        if(livingNeighbours < 2){
            turnToDead(x, y);
        } else if (livingNeighbours > 3){
            turnToDead(x, y);
        } else if (livingNeighbours == 3){
            turnToLiving(x, y);
        } else {
            
        }
    }

}
