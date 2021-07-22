package state.gate_state;

import state.gate.TurnstileGate;

public class PayingGateState extends GateState {
    public PayingGateState(TurnstileGate gate) {
        super(gate);
    }

    @Override
    public void open() {
        System.out.println("Pay in progress.");
    }

    @Override
    public void close() {
        System.out.println("Pay in progress.");
    }

    @Override
    public void pay() {
        System.out.println("Pay in progress.");
    }

    @Override
    public void payOk() {
        GateState newState = new OpenGateState(this.gate);
        this.gate.setGateState(newState);
        System.out.println("Gate open.");
    }

    @Override
    public void payFailed() {
        GateState newState = new ClosedGateState(this.gate);
        this.gate.setGateState(newState);
        System.out.println("Gate closed.");
    }
}
