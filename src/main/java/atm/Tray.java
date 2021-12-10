package atm;

public interface Tray {
    void process(int amount) throws NotFinishProcessException;
    void setNext(Tray next);
}
