package esercizi;

/**
 * Created by Michele on 06/06/2017.
 */
public class Bar {
    private int Nmax;
    private int ospiti;
    private int locale;
    private boolean pulizia;

    public Bar() {
        Nmax = 50;
        pulizia = false;
    }

    public synchronized void entraBarL() throws InterruptedException {
        while (ospiti != 0 || locale >= Nmax || pulizia)
            wait();
        locale++;
    }

    public synchronized void entraBarO() throws InterruptedException {
        while (locale != 0 || ospiti >= Nmax || pulizia)
            wait();
        ospiti++;
    }

    public synchronized void esciBarL() {
        locale--;
        System.out.println("locale esce dal bar");
        notifyAll();
    }

    public synchronized void esciBarO() {
        ospiti--;
        System.out.println("ospite esce dal bar");
        notifyAll();
    }

    public synchronized void pulisci() throws InterruptedException {
        pulizia = true;
        while (ospiti > 0 || locale > 0)
            wait();
        System.out.println("Sto pulendo ospiti: " + ospiti + " locali: " + locale);
        Thread.sleep(4000);
        pulizia = false;
        notifyAll();
    }


}
