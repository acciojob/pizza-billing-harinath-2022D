package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    public static int baseprice;
    public static int vegBasePrice = 300;
    public  static int nonVegBasePrice = 400;
    public static int addExtraCheesePrice = 80;
    public static  int vegToppingsPrice = 70;
    public static int nonVegToppingsPrice = 120;
    public static int myToppingsPrice = 0;
    public static int addTakeawayPrice = 20;
    private boolean isaddExtraCheese;
    private  boolean isaddExtraToppings;
    private boolean isTakeaway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        baseprice = isVeg ? vegBasePrice : nonVegBasePrice;
        // your code goes here
        this.price = baseprice;
        this.isaddExtraCheese = false;
        this.isaddExtraToppings = false;
        this.isTakeaway = false;
    }

    public int getPrice(){
//        this.price = baseprice;
//        if(isaddExtraCheese){
//            this.price += addExtraCheesePrice;
//        }
//        if(isaddExtraToppings){
//            this.price += myToppingsPrice;
//        }
//        if(isTakeaway){
//            this.price += addTakeawayPrice;
//        }
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isaddExtraCheese){
            isaddExtraCheese = true;
            this.price += addExtraCheesePrice;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isaddExtraToppings){
            isaddExtraToppings = true;
            myToppingsPrice = isVeg ? vegToppingsPrice : nonVegToppingsPrice;
            this.price += myToppingsPrice;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeaway){
            isTakeaway = true;
            this.price += addTakeawayPrice;
        }
    }

    public String getBill(){
        //Base Price Of The Pizza: 300
        //Extra Cheese Added: 80
        //Extra Toppings Added: 70
        //Paperbag Added: 20
        //Total Price: 470
        // your code goes here
         bill = "Base Price Of The Pizza: "+baseprice+"\n";
        if(isaddExtraCheese){
            bill += "Extra Cheese Added: "+addExtraCheesePrice+"\n";
        }
        if(isaddExtraToppings){
            bill += "Extra Toppings Added: "+myToppingsPrice+"\n";
        }
        if(isTakeaway){
            bill += "Paperbag Added: "+addTakeawayPrice+"\n";
        }
        bill += "Total Price: "+this.price+"\n";
        return this.bill;
    }
}
