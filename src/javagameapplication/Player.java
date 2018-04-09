/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagameapplication;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 * Class represent a player
 * @author Kamil Matecki
 */
public class Player implements Serializable {
    
    //Field that represents current scores
    private int score;
    
    //Field that represents nick of the player
    private String nick;
    
    //Name of file
    public static final String USER_FILE_NAME = "user.bin";
    
    /**
     * Contructor of Player.java (set a score field to 0)
     */
    public Player(){
        this.score=0;
        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream(USER_FILE_NAME));
            Player somePlayer = (Player) is.readObject();
            String currentPlayerNick = somePlayer.getNick();
            if(!currentPlayerNick.equals("")){
                this.nick= somePlayer.getNick();
                this.score = somePlayer.getScore();
            }
        } catch (IOException | ClassNotFoundException | NullPointerException ex) {
            this.score = 0;
            this.nick = "";
        }
    }

    
    
    
    /**
     * Method that incremets a score field
     */
    public void addScore(){
        score++;
    }
    
    
    
    
    
    
    
    //getters and setters
    
    /**
     * @return the score
     */
    public int getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * @return the nick
     */
    public String getNick() {
        return nick;
    }

    /**
     * @param nick the nick to set
     */
    public void setNick(String nick) {
        this.nick = nick;
    }

    
}
