package state.gate_state;

import state.gate.TurnstileGate;

public abstract class GateState {
    protected final TurnstileGate gate;

    public GateState(TurnstileGate gate) {
        this.gate = gate;
    }

    abstract public void open();
    abstract public void close();
    abstract public void pay();
    abstract public void payOk();
    abstract public void payFailed();
}
