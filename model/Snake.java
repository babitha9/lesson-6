package model;

import java.awt.Graphics2D;
import java.util.ArrayList;

import view.GameBoard;

public class Snake extends GameElement {
    
    public enum Direction {
        LEFT, RIGHT, UP, DOWN
    }

    public ArrayList<GameElement> composite = new ArrayList<>();
    private final int INIT_XLOC = GameBoard.CELL_SIZE * 7;
    private final int INIT_YLOC = GameBoard.CELL_SIZE * 3;
    private final int INIT_BODY_SIZE = 3;

    public Direction Direction = Direction.RIGHT;

    public void init() {
        direction = Direction.RIGHT;
        composite.clear();
        super.x = INIT_XLOC;
        super.y = INIT_YLOC;
        composite.add(new SnakeHead(super.x, super.y));
        for(int i=0; i<INIT_BODY_SIZE; i++) {
            int x
        }

    }

    @Override
    public void render(Graphics2D g2) {
        g2.setColor(super.color);
        if(super.filled)
            g2.fillOval(x, y, GameBoard.CELL_SIZE, GameBoard.CELL_SIZE);
        else
            g2.drawOval(x, y, GameBoard.CELL_SIZE, GameBoard.CELL_SIZE);
    }

    @Override
    public void move() {

    }
    
}
