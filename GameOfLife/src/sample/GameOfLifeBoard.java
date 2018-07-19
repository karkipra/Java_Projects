package sample;


public abstract class GameOfLifeBoard {

    private final int length;
    private final int height;

    public GameOfLifeBoard(int length, int height) {
        //creates a game board of the defined dimensions

        this.length = length;
        this.height = height;
    }

    public boolean[][] getBoard() {
        //provides access to the game board, which is a bidimensional table 
        //containing boolean values – as you may guess from the method 
        //return value! We come back to bidimensional boards later on when needed.

        boolean[][] b = new boolean[length][height];
        return b;
    }

    public int getWidth() {
        //returns the board width

        return this.length;

    }

    public int getHeight() {
        //returns the board height
        return this.height;

    }

    public void playTurn() {
        //simulates a turn of the game
        
        
    }

    public abstract void turnToLiving(int x, int y);
            // animates the cell whose coordinates are (x, y), 
            //that is to say it assigns the value true to it. 
            //If the coordinates are outside the board, nothing happens.

    public abstract void turnToDead(int x, int y);
            // kills the cell whose coordinates are (x, y), 
            //that is to say it assigns the value false to it. 
            //If the coordinates are outside the board, nothing happens.

    public abstract boolean isAlive(int x, int y);
            // tells whether the cell at (x, y) is alive. 
            //If the coordinates are outside the board, the method returns false.

    public abstract void initiateRandomCells(double probabilityForEachCell);
            // initiates all the cells of the board: 
            //every cell is alive with a probability of probabilityForEachCell. 
            //The probability is a double value between [0, 1]. 
            //If a method is called with value 1, all the cells have to be alive. 
            //Accordingly, if the probability is 0, all the cells have to be dead.

    public abstract int getNumberOfLivingNeighbours(int x, int y);
            // tells the number of living neighbours for the cell at (x, y).

    public abstract void manageCell(int x, int y, int livingNeighbours);
            // managese the cell (x, y) according to the rules of the Game of Life.

}
