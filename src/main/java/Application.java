import model.Kotik;

public class Application {

    public static void main(String[] args) {
        Kotik barsik = new Kotik("Barsik", 7.0, 10);

        Kotik casper = new Kotik();
        
        System.out.println("Котика зовут " + barsik.getName());
        System.out.println("Котик весит - " + barsik.getWeight() + " кг");
        System.out.println("Сытость котика составляет " + barsik.getSatiety() + " единиц\n");

        Kotik.liveAnotherDay(barsik);
        System.out.println("Количество котиков -  " + Kotik.getCatCount());
    }
}

