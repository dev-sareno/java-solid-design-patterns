package strategy.example2;

public class TaxiTransportationStrategy implements TransportationToAirport {
    @Override
    public void transport() {
        System.out.println("Transporting with Taxi");
    }
}
