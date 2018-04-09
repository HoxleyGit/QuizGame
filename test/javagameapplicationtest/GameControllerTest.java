/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagameapplicationtest;

import javagameapplication.GameController;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kamil Matecki
 */
public class GameControllerTest {
    
    public GameControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void contructorOfGameControllerTest(){
        GameController gameController = new GameController();
        assertNotNull(gameController.getProvinces());
        assertEquals(0, gameController.getProgress());
        assertEquals(16, gameController.getProvinces().size());
    }

    @Test
    public void prepareQuizTest() {
        GameController gameController = new GameController();
        gameController.prepareQuiz();
        assertNotNull(gameController.getAskForQuiz());
        assertNotNull(gameController.getAnswersList());
        assertEquals(4, gameController.getAnswersList().size());
    }
    
    @Test
    public void addProgress(){
        GameController gameController = new GameController();
        gameController.addProgress();
        assertEquals(1, gameController.getProgress());
    }
}
