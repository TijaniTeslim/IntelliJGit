public class Car {
    private String brand = "tesla";
    private String model ;
    private String year ;
    private int doors ;
    private boolean convertible = true;

    public void describeCar() {
        System.out.println(brand+ " " + model + " "  + doors + "-doors");
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setBrand(String brand) {
        if (brand == null) brand = "unknown";
        String lowercasemodel = brand.toLowerCase();
        switch (lowercasemodel) {
            case "tesla","audi","maclaren" -> this.brand = brand;
            default -> {
                this.brand = "unsupported";
            }
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }
}
