package state.gate;

import state.gate_state.ClosedGateState;

public class MainGate extends TurnstileGate {
    public MainGate() {
        this.state = new ClosedGateState(this);
    }

    @Override
    public void open() {
        this.state.open();
    }

    @Override
    public void close() {
        this.state.close();
    }

    @Override
    public void pay() {
        this.state.pay();
    }

    @Override
    public void payOk() {
        this.state.payOk();
    }

    @Override
    public void payFailed() {
        this.state.payFailed();
    }
}
