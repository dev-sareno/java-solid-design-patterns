package strategy.example2;

public class CityBusTransportationStrategy implements TransportationToAirport {
    @Override
    public void transport() {
        System.out.println("Transporting with City Bus");
    }
}
