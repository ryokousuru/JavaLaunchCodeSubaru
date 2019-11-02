package com.launchcode.java;
import java.util.Scanner;
public class Subaru {
    /*not reference, but primitive variables since
     * they're independent of other variables*/
    int topSpeed = 140;
    int bottomSpeed = 0;
    double weight = 4080;
    boolean turnedOn = false;
    char state = 'A';
    String nameOfSubaru = "Zoomer";
    double fullTank = 18;
    double tankLevel = 9;
    double mpg = 28.4;
    int passengerQuantity = 1;
    int maxPassengerQuantity = 8;


    public Subaru(){
    }

    public Subaru(int customTopSpeed, double customWeight, boolean customTurnedOn){        //constructor; overwrites method below for creating car
        topSpeed = customTopSpeed;         //customize
        weight = customWeight;
        turnedOn = customTurnedOn;
    }
    //getter and setter methods

    public int getTopSpeed() {
        return this.topSpeed;
    }
    public void setTopSpeed(int newTopSpeed){
        this.topSpeed = newTopSpeed;
    }
    public int getBottomSpeed(){
        return  this.bottomSpeed;
    }
    public double getWeight(){
        return  this.weight;
    }
    public boolean TurnedOn(){
        return this.turnedOn;
    }
    public char getState(){
        return this.state;
    }
    public String getNameOfSubaru(){
        return nameOfSubaru;
    }
    public double getFullTank(){
        return this.fullTank;
    }
    public double getTankLevel(){
        return this.tankLevel;
    }
    public double getMpg(){
        return this.mpg;
    }
    public int getPassengerQuantity(){
        return this.passengerQuantity;
    }
    public int getMaxPassengerQuantity(){
        return this.maxPassengerQuantity;
    }

    // method to print variables
    public void showVariables() {
        System.out.println("The fastest it will go is: " + topSpeed);
        System.out.println(bottomSpeed);
        System.out.println(weight);
        System.out.println(turnedOn);
        System.out.println(state);
        System.out.println(nameOfSubaru);
        System.out.println(passengerQuantity);
    }
    public void crashAuto() {       //method alters status of
        state = 'C';                //an above mentioned variable
    }
    /*method to adjust first the minimum
     * and then the maximum speed
     * */
    public void alterTopSpeed(){
        setTopSpeed(getTopSpeed() + 10);
    }
    public void enter() {
        if (passengerQuantity < maxPassengerQuantity) {
            passengerQuantity = passengerQuantity + 1; //equals passengerQuantity++
            System.out.println("A person got in the car!");
        }   else {
            System.out.println("No room for anyone else! " + passengerQuantity + " = " + maxPassengerQuantity);
        }
    }
    public void exit() {
        if (passengerQuantity > 0){
            passengerQuantity--;        //equals passengerQuantity = passengerQuantity - 1;
        }else {
            System.out.println("The Subaru is empty. " + passengerQuantity);
        }
    }
    public double remainingGas(){
        return tankLevel * mpg;
    }
    public double milesPerTank() {
        return fullTank * mpg;
    }
    public void startAuto(){
        //if the Subaru is turned off....
        if (!turnedOn) {
            //turn it on
            turnedOn = true;
            //otherwise, notify that it's already on
        }else {
            System.out.println("The car is already turned on. " + turnedOn);
        }
    }
    /*
     * "companyCar" is the reference variable since
     * it's used three times in this program
     * (a reference variable is one that is not
     * independent, but is shared.  so it's used by
     * other methods and the like)
     * */
    public static void main(String[] args) {
        //Subaru companyCar = new Subaru();   //new company car object; commented out due to constructor
        //System.out.println("Company Auto");
        /*
         * in the following line, the dot
         * means "use companyCar to get me
         * into theshowVariables method"
         * */
        //companyCar.showVariables();     //here is where companyCar is reference variable
        //Subaru sueCar = companyCar;     //since it's shared by 3 different methods
        //companyCar.crashAuto();
        //System.out.println("Sue\'s subaru");
        //sueCar.showVariables();
        //companyCar.raiseBottomSpeed();
        //System.out.println("Sue\'s subaru after a speed upgrade");
        //sueCar.showVariables();
        //Subaru forChristmas = new Subaru(220, 5050, true);
        //System.out.println("First Subaru from Santa");
        //forChristmas.showVariables();
        //forChristmas.enter();
        //forChristmas.enter();
        //forChristmas.enter();
        //forChristmas.enter();
        //System.out.println("Remaining miles: " + forChristmas.remainingGas());
        //System.out.println("Miles per full tank: " + forChristmas.milesPerTank());
        //System.out.println("Second Subaru from Santa");
        //forChristmas.showVariables();
        //forChristmas.exit();
        //System.out.println("Next Subaru from Santa");
        //forChristmas.showVariables();
        //System.out.println("Subaru because you\'ve been a nice person");
        //Subaru specialOccasion = new Subaru(400, 2800, false);
        //specialOccasion.showVariables();

        Subaru hisAuto = new Subaru();
        hisAuto.exit();
        hisAuto.exit();
        hisAuto.enter();
        hisAuto.enter();
        hisAuto.enter();
        hisAuto.enter();
        hisAuto.enter();
        hisAuto.enter();
        hisAuto.enter();
        hisAuto.enter();
        hisAuto.enter();
        hisAuto.startAuto();
        hisAuto.startAuto();
        Subaru restaurant = new Subaru(15);
        restaurant.restaurantBill();
    }
    public Subaru(float paymentAmount){
        mealPrice = paymentAmount;
    }
    //day 2 challenge: finding total cost of meal after including tip & tax
    float mealPrice;
    float tipPercent;
    float taxPercent;
    float totalPrice;
    public void restaurantBill(){
        tipPercent = mealPrice * 2 / 10;
        taxPercent = mealPrice * 8 / 100;
        totalPrice = mealPrice + tipPercent + taxPercent;
        System.out.println("The price of the meal will be " + totalPrice);
    }
}