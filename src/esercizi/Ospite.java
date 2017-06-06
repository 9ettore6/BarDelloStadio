package esercizi;

/**
 * Created by Michele on 06/06/2017.
 */
public class Ospite extends Thread {
    private Bar bar;

    public Ospite(Bar bar) {
        this.bar = bar;
    }

    @Override
    public void run() {
        int count = 0;
        while (count < 3) {
            try {
                bar.entraBarO();
                System.out.println(getName() + " ospite è entrato");
                sleep(1000);
                count++;
                bar.esciBarO();
            } catch (InterruptedException e) {
            }
        }
    }
}
