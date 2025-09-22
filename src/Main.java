public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car. setBrand("Audi");
        car.setModel("R8 eTRON");
        System.out.println("brand = " + car.getBrand());
        System.out.println("model = " + car.getModel());
        car.setYear("2020");
        car.setDoors(2);
        car.describeCar();

        BankAccount bankAccount = new BankAccount(
                500,"Tijani Teslim","username@teslim.com",07011223344);
        bankAccount.setAcctbal(500);
        bankAccount.depoFunds(800);
        bankAccount.withdrawFunds(900);
    }

}