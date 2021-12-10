package atm;

public abstract class TrayATM implements Tray {
    private Tray next;
    protected int bill;

    TrayATM(int bill) {
        this.bill = bill;
    }

    @Override
    public void process(int amount) throws NotFinishProcessException {
        if (next != null) {
            next.process(amount%bill);
        } else if (amount%bill != 0) {
            throw new NotFinishProcessException("Can't finish process with given amount!");
        }
        System.out.println("Took " + amount/bill + " " + bill + "-bills.");
    }

    @Override
    public void setNext(Tray next) {
        this.next = next;
    }
}
