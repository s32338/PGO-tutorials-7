public class Car implements Comparable<Car>{

    private String model;
    private int productionYear;


    public Car(String model, int productionYear) {
        this.model = model;
        this.productionYear = productionYear;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    @Override
    public int compareTo(Car o) {
        return Integer.compare(this.productionYear, o.productionYear);
    }

    @Override
    public String toString() {
        return "modelName='" + model + "', productionYear=" + productionYear;
    }
}
