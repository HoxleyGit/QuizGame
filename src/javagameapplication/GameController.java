/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagameapplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;



/**
 * Class that represents main controller of quiz, it contains GamePanel.java
 * and Reponse.java instances, boolean field itWasAnswer that contains information
 * about state of quiz,
 * it has also checkResponse() method that checks if user was right or not
 * @author Kamil Matecki
 */
public class GameController {
    
    //Represents response returned from a player
    private Response response;
    
    //Represents player
    private Player player;
    
    //Counter for progress in quiz
    private int progress;
    
    //Field that represents current scores
    private int currentScore;
    
    //CardRepository.java instance
    private final CardRepository cardRepository;
    
    //String list of all provinces
    private List<String> provinces;
    
    //fields that contains information about state of quiz
    private boolean itWasAnswer;
    private boolean itWasSecondAnswer;
    
    //Fields that could be generated by method prepareQuiz()
    private RegistryCard askForQuiz;
    private List<String> answersList;
    
    //List of provinces and answers for second stage of quiz
    private List<RegistryCard> provinceForSecondStage;
    private List<RegistryCard> answersForSecondStage;
    
    /**
     * Constructor of GameController.java
     */
    public GameController(){
        List<String> list = new ArrayList();
        list.add("DOLNOŚLĄSKIE");
        list.add("KUJAWSKO-POMORSKIE");
        list.add("LUBELSKIE");
        list.add("LUBUSKIE");
        list.add("ŁÓDZKIE");
        list.add("MAŁOPOLSKIE");
        list.add("MAZOWIECKIE");
        list.add("OPOLSKIE");
        list.add("PODKARPACKIE");
        list.add("PODLASKIE");
        list.add("POMORSKIE");
        list.add("ŚLĄSKIE");
        list.add("ŚWIĘTOKRZYSKIE");
        list.add("WARMIŃSKO-MAZURSKIE");
        list.add("WIELKOPOLSKIE");
        list.add("ZACHODNIOPOMORSKIE");
        
        this.response = new Response();
        this.player = new Player();
        this.cardRepository = new CardRepository();
        this.provinces = list;
        this.progress=0;
    }
    
    
    
    
    
    
    /**
     * Method that generates askForQuiz field (randomly from cardRepository object)
     * which is part of ask for quiz
     */
    private void randomizeAsk(){
        List<RegistryCard> registryCardList = cardRepository.getRegistryCardList();
        int randomNum = ThreadLocalRandom.current().nextInt(0, registryCardList.size());
        this.askForQuiz = registryCardList.get(randomNum);  
    }
    
    /**
     * Method that is used by getAnserws() method
     * it checks if good answer is already in a list
     * @param someList answers
     * @return true/false
     */
    private boolean ifDuplicateAnswer(List<String> someList){
        for(int i=0; i<3; i++){
            if(someList.get(i).equals(askForQuiz.getCardProvince())){
                return true;
            }
        }
        return false;
    }
    
    /**
     * Method that fills answersList field (randomly shuffle previous provinces list,
     * and adding to it province that is correct answer for quiz too)
     */
    private void getAnswers(){
        Collections.shuffle(provinces);
        List<String> list = new ArrayList();
        for(int i=0; i<3; i++){
            list.add(i, provinces.get(i));
        }
        if(!ifDuplicateAnswer(list)){
            list.add(askForQuiz.getCardProvince());
        } else {
            list.add(3, provinces.get(3));
        }
        Collections.shuffle(list);
        this.answersList=list;
    }
    
    
    /**
     * Method that checks if current registryCard is in the list
     * @param someList List that will be checked
     * @param someCard Current card
     * @return true - duplicate found / false - duplicate didn't find
     */
    private boolean checkForDuplicateCards(List<RegistryCard> someList, RegistryCard someCard){
        for(int i = 0; i<someList.size(); i++){
            if(someList.get(i).getCardName().equals(someCard.getCardCity())){
                return true;
            }
        }
        return false;
    }
    
    /**
     * Method that sets answersForSecondStage field (trying to choose answers that
     * are quite similar
     */
    private void getAnswersForSecondStageMethod(){
        List<RegistryCard> someList = new ArrayList();
        List<RegistryCard> registryCardListCopy = new ArrayList<>(cardRepository.getRegistryCardList());
        Collections.shuffle(registryCardListCopy);
        
        //Second letter of registryCardName often fits with first letter of a city
        //so we get this letter from correct city
        String letter = (askForQuiz.getCardName().split(""))[1];
        
        //Searching for two cities that are quite similar to the correct city
        int a = 0;
        for(int z=0; z<registryCardListCopy.size(); z++){
            if(registryCardListCopy.get(z).getCardCity().split("")[0].equals(letter) &&
                   !(registryCardListCopy.get(z).getCardCity()).equals(askForQuiz.getCardCity())){
                someList.add(registryCardListCopy.get(z));
                a++;
            }
            if(a==2){
                break;
            }
        }
        
        //Different behaviours depend on number of similar cities found
        int z = 0;
        switch(a){
            case 0: someList.add(askForQuiz);
                    while(someList.size()<3){
                        if(!checkForDuplicateCards(someList, registryCardListCopy.get(z))){
                            someList.add(registryCardListCopy.get(z));
                        }
                        z++;
                    }
                    break;
            case 1: someList.add(askForQuiz);
                    while(someList.size()<3){
                        if(!checkForDuplicateCards(someList, registryCardListCopy.get(z))){
                            someList.add(registryCardListCopy.get(z));
                        }
                        z++;
                    }
                    break;
            case 2: someList.add(askForQuiz);
                    break;
        }
        Collections.shuffle(someList);
        this.answersForSecondStage=someList;
    }
    
    /**
     * Method that generates ansersList field and askForQuiz filed by
     * using radnomizeAsk() and getAnswers() methods
     */
    public void prepareQuiz(){
        randomizeAsk();
        getAnswers();
        switch(askForQuiz.getProvinceNumber()){
            case 1: provinceForSecondStage=cardRepository.getDolnoslaskieCardList();
            break;
            case 2: provinceForSecondStage=cardRepository.getKujawskoPomorskieCardList();
            break;
            case 3: provinceForSecondStage=cardRepository.getLubelskieCardList();
            break;
            case 4: provinceForSecondStage=cardRepository.getLubuskieCardList();
            break;
            case 5: provinceForSecondStage=cardRepository.getLodzkieCardList();
            break;
            case 6: provinceForSecondStage=cardRepository.getMalopolskieCardList();
            break;
        }
        getAnswersForSecondStageMethod();
    }
    
    
    /**
     * Method that check answer from player
     * @return true/false
     */
    public boolean checkResponse(){
        return response.getCheckedProvince().equals(askForQuiz.getCardProvince());
    }

    public boolean checkResponseSecondStage(){
        return response.getCheckedProvince().equals(askForQuiz.getCardCity());
    }
    
    /**
     * Method that increments progress field
     */
    public void addProgress(){
        progress++;
    }

    
    
    
    
    
    
    
    
    //getters and setters

    /**
     * @return the response
     */
    public Response getResponse() {
        return response;
    }

    /**
     * @param response the response to set
     */
    public void setResponse(Response response) {
        this.response = response;
    }

    /**
     * @return the itWasAnswer
     */
    public boolean getItWasAnswer() {
        return itWasAnswer;
    }

    /**
     * @param itWasAnswer the itWasAnswer to set
     */
    public void setItWasAnswer(boolean itWasAnswer) {
        this.itWasAnswer = itWasAnswer;
    }

    /**
     * @return the player
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * @param player the player to set
     */
    public void setPlayer(Player player) {
        this.player = player;
    }

    /**
     * @return the progress
     */
    public int getProgress() {
        return progress;
    }

    /**
     * @param progress the Progress to set
     */
    public void setProgress(int progress) {
        this.progress = progress;
    }

        /**
     * @return the provinces
     */
    public List<String> getProvinces() {
        return provinces;
    }

    /**
     * @param provinces the provinces to set
     */
    public void setProvinces(List<String> provinces) {
        this.provinces = provinces;
    }

    /**
     * @return the askForQuiz
     */
    public RegistryCard getAskForQuiz() {
        return askForQuiz;
    }

    /**
     * @param askForQuiz the askForQuiz to set
     */
    public void setAskForQuiz(RegistryCard askForQuiz) {
        this.askForQuiz = askForQuiz;
    }

    /**
     * @return the answersList
     */
    public List<String> getAnswersList() {
        return answersList;
    }

    /**
     * @param answersList the answersList to set
     */
    public void setAnswersList(List<String> answersList) {
        this.answersList = answersList;
    }

    /**
     * @return the provinceForSecondStage
     */
    public List<RegistryCard> getProvinceForSecondStage() {
        return provinceForSecondStage;
    }

    /**
     * @param provinceForSecondStage the provinceForSecondStage to set
     */
    public void setProvinceForSecondStage(List<RegistryCard> provinceForSecondStage) {
        this.provinceForSecondStage = provinceForSecondStage;
    }

    /**
     * @param answersForSecondStage the answersForSecondStage to set
     */
    public void setAnswersForSecondStage(List<RegistryCard> answersForSecondStage) {
        this.answersForSecondStage = answersForSecondStage;
    }

    /**
     * @return the itWasSecondAnswer
     */
    public boolean isItWasSecondAnswer() {
        return itWasSecondAnswer;
    }

    /**
     * @param itWasSecondAnswer the itWasSecondAnswer to set
     */
    public void setItWasSecondAnswer(boolean itWasSecondAnswer) {
        this.itWasSecondAnswer = itWasSecondAnswer;
    }

    /**
     * @return the answersForSecondStage
     */
    public List<RegistryCard> getAnswersForSecondStage() {
        return answersForSecondStage;
    }

    /**
     * @return the currentScore
     */
    public int getCurrentScore() {
        return currentScore;
    }

    /**
     * @param currentScore the currentScore to set
     */
    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }
}
