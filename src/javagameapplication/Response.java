/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagameapplication;

/**
 * Class with response from the game (user response), it contains user's checked province
 * @author Kamil Matecki
 */
public class Response {
    
    //user's checked province
    private String checkedProvince;

    
    
    
    //getters and setters
    
    /**
     * @return the checkedProvince
     */
    public String getCheckedProvince() {
        return checkedProvince;
    }

    /**
     * @param checkedProvince the checkedProvince to set
     */
    public void setCheckedProvince(String checkedProvince) {
        this.checkedProvince = checkedProvince;
    }


}
