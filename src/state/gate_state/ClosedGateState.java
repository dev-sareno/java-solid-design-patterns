package state.gate_state;

import state.gate.TurnstileGate;

public class ClosedGateState extends GateState {
    public ClosedGateState(TurnstileGate gate) {
        super(gate);
    }

    @Override
    public void open() {
        System.out.println("Pay first.");
    }

    @Override
    public void close() {
        System.out.println("Gate already closed.");
    }

    @Override
    public void pay() {
        GateState newState = new PayingGateState(this.gate);
        gate.setGateState(newState);
        System.out.println("Paying...");
    }

    @Override
    public void payOk() {
        System.out.println("Invalid action");
    }

    @Override
    public void payFailed() {
        System.out.println("Invalid action");
    }
}
