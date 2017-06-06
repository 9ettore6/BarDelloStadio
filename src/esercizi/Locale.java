package esercizi;

/**
 * Created by Michele on 06/06/2017.
 */
public class Locale extends Thread {
    private Bar bar;

    public Locale(Bar bar) {
        this.bar = bar;
    }

    @Override
    public void run() {
        int count = 0;
        while (count < 3) {
            try {
                bar.entraBarL();
                System.out.println(getName() + " locale è entrato");
                sleep(1000);
                count++;
                bar.esciBarL();
            } catch (InterruptedException e) {
            }
        }
    }
}
