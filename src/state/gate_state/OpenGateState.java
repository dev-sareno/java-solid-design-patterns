package state.gate_state;

import state.gate.TurnstileGate;

public class OpenGateState extends GateState {
    public OpenGateState(TurnstileGate gate) {
        super(gate);
    }

    @Override
    public void open() {
        System.out.println("Gate already open.");
    }

    @Override
    public void close() {
        GateState newState = new ClosedGateState(this.gate);
        gate.setGateState(newState);
        System.out.println("Gate closed.");
    }

    @Override
    public void pay() {
        System.out.println("Wait for someone to get through the gate then try again.");
    }

    @Override
    public void payOk() {
        System.out.println("Invalid action.");
    }

    @Override
    public void payFailed() {
        System.out.println("Invalid action.");
    }
}
