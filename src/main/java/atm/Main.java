package atm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NotFinishProcessException {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        ATM atm = new ATM();
        atm.process(amount);
    }
}
