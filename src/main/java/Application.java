import model.Kotik;

public class Application {

    public static void main(String[] args) {
        Kotik barsik = new Kotik("Barsik", 7.0, 10);

        Kotik casper = new Kotik();

        casper.setName("Casper");
        casper.setWeight(8.5);
        casper.setSatiety(8);

        casper.liveAnotherDay();

        System.out.println("\nКотика зовут " + casper.getName());
        System.out.println(casper.getCasperMeow().equals(barsik.getBarsikMeow()));
        System.out.println("Количество котиков -  " + Kotik.getCatCount());
    }
}

