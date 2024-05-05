package model;

public class Kotik {

    private int satiety;
    private String name;
    private double weight;
    private static int catCount;
    private String barsikMeow = "Meow";
    private String casperMeow = "MEEEOOOWWWW";

    public Kotik(String name, double weight, int satiety) {
        this.name = name;
        this.weight = weight;
        this.satiety = satiety;
        catCount++;
    }
    public Kotik() {
        catCount++;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static int getCatCount() {
        return catCount;
    }

    public void liveAnotherDay() {

        for (int i = 0; i < 24; i++) {
            switch (randomNumber()) {
                case 1:
                    play();
                    break;
                case 2:
                    sleep();
                    break;
                case 3:
                    chaseMouse();
                    break;
                case 4:
                    eat(5);
                    break;
                case 5:
                    sayMeow();
                    break;
            }
        }
    }

    public void sayMeow() {
        int saySatiety = 1;

        if (getSatiety() - saySatiety < 0) {
            System.out.print("Котик отказывается мяукать, он хочет есть. Котик покушал.");
            hungry();
        }

        setSatiety(getSatiety() - saySatiety);
        System.out.println("Котик мяукает");
    }

    public void play() {
        int playSatiety = 4;

        if (getSatiety() - playSatiety < 0) {
            System.out.print("Котик отказывается играть, он хочет есть. Котик покушал.");
            hungry();
        }

        setSatiety(getSatiety() - playSatiety);
        System.out.println("Котик играет");
    }

    public void sleep() {
        int sleepSatiety = 3;

        if (getSatiety() - sleepSatiety < 0) {
            System.out.print("Котик отказывается спать, он хочет есть. Котик покушал.");

            hungry();
        }

        setSatiety(getSatiety() - sleepSatiety);
        System.out.println("Котик спит");
    }

    public void chaseMouse() {
        int chaseSatiety = 5;

        if (getSatiety() - chaseSatiety < 0) {
            System.out.print("Котик отказывается ловить мышь, он хочет есть. Котик покушал.");
            hungry();
        }

        setSatiety(getSatiety() - chaseSatiety);
        System.out.println("Котик ловит мышку");
    }

    public void hungry() {
        eat();
    }

    public int randomNumber() {
        return (int) (Math.random() * 5) + 1;
    }

    public void eat(int foodSatiety) {
        setSatiety(getSatiety() + foodSatiety);
        System.out.println("Котик ест");
    }
    public void eat(int foodSatiety, String food) {
        setSatiety(getSatiety() + foodSatiety);
    }

    public   void eat() {
           int foodSatiety = 5;
           String food = "Whiskas";
        eat(foodSatiety, food);
    }

    public String getCasperMeow() {
        return casperMeow;
    }

    public String getBarsikMeow() {
        return barsikMeow;
    }
}
