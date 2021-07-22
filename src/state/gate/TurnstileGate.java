package state.gate;

import state.gate_state.GateState;

public abstract class TurnstileGate {
    protected GateState state;

    abstract public void open();
    abstract public void close();
    abstract public void pay();
    abstract public void payOk();
    abstract public void payFailed();

    final public void setGateState(GateState state) {
        this.state = state;
    }
}
