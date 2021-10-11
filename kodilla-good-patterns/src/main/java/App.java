import com.kodilla.good.patterns.SmallAirlines.City;
import com.kodilla.good.patterns.SmallAirlines.FindFlight;

public class App {
    public static void main(String[] args) {
        /*MovieStore store = new MovieStore();
        store.getMovies().entrySet().stream()
                .flatMap(stringListEntry -> stringListEntry.getValue().stream())
                .forEach(title -> System.out.print(title + " ! "));*/

        /*OrderProcessor processor = new OrderProcessor();
        Order order1 = new Order("Pieczywo", 3);
        Order order2 = new Order("Serca palmy", 11);
        processor.processOrder(new GlutenFreeShop(), order1);
        processor.processOrder(new ExtraFoodShop(), order2);*/

        FindFlight findFlight = new FindFlight();

        System.out.println("Możliwe połączenia z Warszawy: ");
        findFlight.findFrom(new City("Warszawa")).stream()
                .map(City::getCity)
                .forEach(System.out::println);

        System.out.println("Możliwe połączenia do Warszawy: ");
        findFlight.findTo(new City("Warszawa")).stream()
                .map(City::getCity)
                .forEach(System.out::println);

        System.out.println("Możliwe połączenia z przesiadką z Warszawy do Wrocławia: ");
        findFlight.findThrough(new City("Warszawa"), new City("Wrocław")).stream()
                .map(City::getCity)
                .forEach(System.out::println);
    }
}
