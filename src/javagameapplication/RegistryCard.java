/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagameapplication;

/**
 * Class that represent single registy card
 * @author Kamil Matecki
 */
public class RegistryCard {
    
    //all properties of registy card
    private int provinceNumber;
    private String cardName;
    private String cardCity;
    private String cardProvince;

    /**
     * Contructor of RegistryCard.java
     * @param provinceNumber
     * @param cardName
     * @param cardCity
     * @param cardProvince 
     */
    public RegistryCard(int provinceNumber,
                        String cardName,
                        String cardCity,
                        String cardProvince){
        this.provinceNumber=provinceNumber;
        this.cardName=cardName;
        this.cardCity=cardCity;
        this.cardProvince=cardProvince;
    }
    
    
    
    
    
    
    //getters and setters
    
    /**
     * @return the cardName
     */
    public String getCardName() {
        return cardName;
    }

    /**
     * @param cardName the cardName to set
     */
    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    /**
     * @return the cardCity
     */
    public String getCardCity() {
        return cardCity;
    }

    /**
     * @param cardCity the cardCity to set
     */
    public void setCardCity(String cardCity) {
        this.cardCity = cardCity;
    }

    /**
     * @return the cardProvince
     */
    public String getCardProvince() {
        return cardProvince;
    }

    /**
     * @param cardProvince the cardProvince to set
     */
    public void setCardProvince(String cardProvince) {
        this.cardProvince = cardProvince;
    }

    /**
     * @return the provinceNumber
     */
    public int getProvinceNumber() {
        return provinceNumber;
    }

    /**
     * @param provinceNumber the provinceNumber to set
     */
    public void setProvinceNumber(int provinceNumber) {
        this.provinceNumber = provinceNumber;
    }
}
