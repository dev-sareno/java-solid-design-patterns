package state;

import state.gate.MainGate;
import state.gate.TurnstileGate;

public class Main {
    public static void main(String[] args) {
        TurnstileGate gate = new MainGate();

        // Payment ok
        gate.pay();
        gate.payOk();
        gate.close();

        // Payment failed
        gate.pay();
        gate.payFailed();

        // Pay while pay in progress then pay ok then close
        gate.pay();
        gate.pay();
        gate.payOk();
        gate.close();
    }
}
