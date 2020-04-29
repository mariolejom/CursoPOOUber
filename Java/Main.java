class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        UberX uberx = new UberX("TDE334", new Account("Mario Moreno", "1234567890"),"chev","spark");
        //enviar a los setters y getters
        uberx.setPassenger(4);
        uberx.printDataCar();
        
        /* Car car2 = new Car("TRE234", new Account("Mateo Moreno", "0987654321"));
        car2.passenger =3;
        car2.printDataCar(); */
    }
}