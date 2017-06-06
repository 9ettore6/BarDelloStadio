package esercizi;

/**
 * Created by Michele on 06/06/2017.
 */
public class Barista extends Thread {
    private Bar bar;

    public Barista(Bar bar) {
        this.bar = bar;
    }

    @Override
    public void run() {
        int count = 0;
        while (count < 3) {
            try {
                sleep(2000);
                bar.pulisci();
                count++;
            } catch (InterruptedException e) {
            }
        }
    }
}
