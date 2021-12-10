package atm;

public class ATM {
    Tray trayHead;

    public ATM() {
        Tray tray5 = new Tray5();
        Tray tray10 = new Tray10();
        Tray tray20 = new Tray20();
        tray10.setNext(tray5);
        tray20.setNext(tray10);

        trayHead = tray20;
    }

    public void process(int amount) throws NotFinishProcessException {
        trayHead.process(amount);
    }
}
