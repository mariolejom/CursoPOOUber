import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    //Al sobreescribir pasamos passenger como atributo nuevo
    private Integer passenger;

    public UberVan(String license, Account driver, 
    Map<String, Map<String, Integer>> typeCarAccepted,
    ArrayList<String> seatsMaterial){
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

    //Sobreescribiendo método de la clase car (Polimorfismo)
    @Override
    public void setPassenger(Integer passenger) {
        if (passenger == 6) {
            this.passenger = passenger;
        }else{
            System.out.println("Necesitas asgnar 4 pasajeros");
        }
    }


}