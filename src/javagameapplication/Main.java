/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagameapplication;


/**
 *
 * @author Kamil Matecki
 */
public class Main {

    public static final GameWindow GAME_WINDOW = new GameWindow();
    public static final OpenWindow OPEN_WINDOW = new OpenWindow();
    public static final PlayerPanel PLAYER_PANEL = new PlayerPanel();
    public static final WelcomeWindow WELCOME_WINDOW = new WelcomeWindow();
    
    
    /**
     * Connects all screens
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OPEN_WINDOW.setGameWindow(GAME_WINDOW);
        OPEN_WINDOW.setPlayerPanel(PLAYER_PANEL);
        OPEN_WINDOW.setWelcomeWindow(WELCOME_WINDOW);
        GAME_WINDOW.setOpenWindow(OPEN_WINDOW);
        GAME_WINDOW.setPlayerPanel(PLAYER_PANEL);
        PLAYER_PANEL.setGameWindow(GAME_WINDOW);
        PLAYER_PANEL.setOpenWindow(OPEN_WINDOW);
        WELCOME_WINDOW.setOpenWindow(OPEN_WINDOW);
        if(GAME_WINDOW.getGameController().getPlayer().getNick().equals("")){
            PLAYER_PANEL.refresh();
            WELCOME_WINDOW.setVisible(true);
        } else {
            PLAYER_PANEL.refresh();
            OPEN_WINDOW.setVisible(true);
        }
    }
    
}
