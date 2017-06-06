package esercizi;

/**
 * Created by Michele on 06/06/2017.
 */
public class Principale {
    public static void main(String[] args) {
        Bar bar = new Bar();
        Ospite osp;
        for (int i = 0; i < 4; i++) {
            osp = new Ospite(bar);
            osp.start();
            osp.setPriority(9);
        }
        Locale loc;
        for (int i = 0; i < 4; i++) {
            loc = new Locale(bar);
            loc.start();
        }
        Barista bari = new Barista(bar);
        bari.start();
    }
}
