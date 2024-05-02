package model;

public class Kotik {

    private int satiety;
    private String name;
    private double weight;
    private static int catCount;

    public Kotik(String name, double weight, int satiety) {
        this();
        this.name = name;
        this.weight = weight;
        this.satiety = satiety;
    }
    public Kotik() {
        this.name = "Casper";
        this.weight = 8.5;
        this.satiety = 9;
        catCount++;
    }

    public static void liveAnotherDay(Kotik cat) {

        for (int i = 0; i < 24; i++) {
            switch (randomNumber()) {
                case 1:
                    play(cat);
                    System.out.println("День " + (i+1) + " закончился");
                    break;
                case 2:
                    sleep(cat);
                    System.out.println("День " + (i+1) + " закончился");
                    break;
                case 3:
                    chaseMouse(cat);
                    System.out.println("День " + (i+1) + " закончился");
                    break;
                case 4:
                    eat(cat, 5);
                    System.out.println("День " + (i+1) + " закончился");
                    break;
                case 5:
                    sayMeow(cat);
                    System.out.println("День " + (i+1) + " закончился");
                    break;
            }
        }
    }

    public static void sayMeow(Kotik cat) {
        int saySatiety = 1;

        if (cat.getSatiety() - saySatiety <= 0) {
            System.out.println("Котик отказывается мяукать, он хочет есть");
            hungry(cat);
            return;
        }

        cat.setSatiety(cat.getSatiety() - saySatiety);

        System.out.println("Котик промяукал и у него отнялась сытость в размере " + saySatiety +
                ", осталось " + cat.getSatiety());
    }

    public static void play(Kotik cat) {
        int playSatiety = 4;

        if (cat.getSatiety() - playSatiety <= 0) {
            System.out.println("Котик отказывается играть, он хочет есть");
            hungry(cat);
            return;
        }

        cat.setSatiety(cat.getSatiety() - playSatiety);

        System.out.println("Котик играет, у него отнимается сытость в размере " + playSatiety);
        System.out.println("Сытость котика после игры составляет " + cat.getSatiety());

    }

    public static void sleep(Kotik cat) {
        int sleepSatiety = 3;

        if (cat.getSatiety() - sleepSatiety <= 0) {
            System.out.println("Котик отказывается спать, он хочет есть");
            hungry(cat);
            return;
        }

        cat.setSatiety(cat.getSatiety() - sleepSatiety);

        System.out.println("Котик спит, у него отнимается сытость в размере " + sleepSatiety);
        System.out.println("Сытость котика после сна составляет " + cat.getSatiety());
    }

    public static void chaseMouse(Kotik cat) {
        int chaseSatiety = 5;

        if (cat.getSatiety() - chaseSatiety <= 0) {
            System.out.println("Котик отказывается ловить мышку, он хочет есть");
            hungry(cat);
            return;
        }

        cat.setSatiety(cat.getSatiety() - chaseSatiety);

        System.out.println("Котик ловит мышку, у него отнимается сытость в размере " + chaseSatiety);
        System.out.println("Сытость котика после ловли составляет " + cat.getSatiety());

    }

    public static void hungry(Kotik cat) {
        eat(cat);

        System.out.println("Котик больше не голоден, его сытость составляет " + cat.getSatiety() + " единиц");
    }

    public static int randomNumber() {
        return (int) (Math.random() * 5) + 1;
    }

    public static void eat(Kotik cat, int foodSatiety) {
        cat.setSatiety(cat.getSatiety() + foodSatiety); // Console.WriteLine("");

        System.out.println("Котик чего-то поел и накопил " + foodSatiety + " сытости");
        System.out.println("Его сытость составляет " + cat.getSatiety());
    }
    public static void eat(Kotik cat, int foodSatiety, String food) {
        cat.setSatiety(cat.getSatiety() + foodSatiety);

        System.out.println("Котик поел " + food + " и накопил " + foodSatiety + " сытости");
    }

    public static void eat(Kotik cat) {
           int foodSatiety = 5;
           String food = "Whiskas";
        eat(cat, foodSatiety, food);
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

    public double getWeight() {
        return weight;
    }

    public static int getCatCount() {
        return catCount;
    }
}
