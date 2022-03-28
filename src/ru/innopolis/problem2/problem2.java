package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class Burger {

    private String cheese;
    private String letucci;
    private String tomato;
    private String peperone;
    private String size;

   

    public static class Builder {
        private Burger newBurger;

        public Builder() {
            newBurger = new Burger();
        }

        public Builder withCheese(){
            newBurger.cheese = "Added";
            return this;
        }

        public Builder withTomato(){
            newBurger.tomato = "Added";
            return this;
        }

        public Builder withLetucci(){
            newBurger.letucci = "Added";
            return this;
        }

        public Builder withPeperone(){
            newBurger.peperone = "Added";
            return this;
        }

        public Builder withSize(String size){
            newBurger.size = size;
            return this;
        }

    }
}
