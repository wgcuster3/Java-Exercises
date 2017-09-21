/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import javax.swing.JPanel;
import wormgame.domain.Piece;
import wormgame.game.WormGame;
import wormgame.domain.Apple;
/**
 *
 * @author Wesley
 */
public class DrawingBoard extends JPanel implements Updatable{
    private WormGame wormGame;
    private int side;
    
    public DrawingBoard(WormGame wormGame, int pieceLength){
        this.wormGame = wormGame;
        
        //length and height are equal
        this.side = pieceLength;
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        List<Piece> wormPieces = wormGame.getWorm().getPieces();
        
        g.setColor(Color.black);
        
        for(Piece piece : wormPieces){
            g.fill3DRect(piece.getX() * side, piece.getY() * side, side, side, true);
        }
        
        g.setColor(Color.red);
        Apple apple = wormGame.getApple();
        
        g.fillOval(apple.getX() * side, apple.getY() * side, side, side);
    }

    @Override
    public void update() {
        super.repaint();
    }
}
