import java.util.*;

public class Main {
    private static final int ARRAY_SIZE = 10;
    private static int[] numbers = new int[ARRAY_SIZE];

    public static void main(String[] args) {
        try {
            zadanie4();
        }
        catch(Exception ex) {
            System.out.println("Wystapil niespodziewany blad");
        }
    }

    private static void zadanie1() {
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Toyota Camry", 2015));
        cars.add(new Car("Honda Accord", 2018));
        cars.add(new Car("Ford Mustang", 2012));
        cars.add(new Car("Chevrolet Malibu", 2020));
        cars.add(new Car("BMW 3 Series", 2019));
        cars.add(new Car("Audi A4", 2017));
        cars.add(new Car("Mercedes-Benz C-Class", 2016));
        cars.add(new Car("Volkswagen Passat", 2013));
        cars.add(new Car("Subaru Outback", 2021));
        cars.add(new Car("Mazda 6", 2014));
        
        Collections.sort(cars);

        for (Car car : cars) {
            System.out.println(car);
        }
    }
    private static void zadanie2_3() {
        ArrayList<Item> items = new ArrayList<>();


        items.add(new Item(1, "Laptop"));
        items.add(new Item(2, "Smartphone"));
        items.add(new Item(3, "Tablet"));
        items.add(new Item(4, "Headphones"));
        items.add(new Item(5, "Smartwatch"));
        items.add(new Item(6, "Laptop2"));
        items.add(new Item(7, "Smartphone2"));
        items.add(new Item(8, "Tablet2"));
        items.add(new Item(9, "Headphones2"));
        items.add(new Item(10, "Smartwatch2"));

        for (int i = 0; i < items.size(); i++) {
            items.get(i).show();
        }

        HashMap<Integer, String> itemMap = new HashMap<>();
        for (Item item : items) {
            itemMap.put(item.getId(), item.getName());
        }

        for (Map.Entry<Integer, String> entry : itemMap.entrySet()) {
            System.out.println("Item ID: " + entry.getKey() + ", Item Name: " + entry.getValue());
        }




        Set<Item> subItems = new HashSet<>(items.subList(0,5));
        for (Item i : subItems) {
            i.show();
        }
    }

    private static void zadanie4(){
        fillArray();
    }

    public static int readNumber() throws NegativeNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed");
        }
        return number;
    }

    public static void fillArray() {
        for (int i = 0; i < ARRAY_SIZE; i++) {
            try {
                numbers[i] = readNumber();
            } catch (NegativeNumberException e) {
                numbers[i] = 0;
                System.out.println(e.getMessage());
            }
        }
    }
}