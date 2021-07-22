package strategy.example2;

public class PersonalCarTransportationStrategy implements TransportationToAirport {
    @Override
    public void transport() {
        System.out.println("Transporting with Personal Car");
    }
}
