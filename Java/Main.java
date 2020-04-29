class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Car car = new Car("TDE334", new Account("Mario Moreno", "1234567890"));
        car.passenger = 4;
        car.printDataCar();
        
        Car car2 = new Car("TRE234", new Account("Mateo Moreno", "0987654321"));
        car2.passenger =3;
        car2.printDataCar();
    }
}