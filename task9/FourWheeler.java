package task9;

public class FourWheeler extends Vehicle{
    private boolean powerSteer; // Variable to store steering information

    public FourWheeler(String vId, String vName, int numWheels, boolean pSteer){
// Attributes inherited from parent class
        vehicleNo = vId;
        vehicleName = vName;
        wheels = numWheels;
// Child class’ own attribute
        powerSteer = pSteer;
    }

    public void showDetails() {
        System.out.println("Vehicle no:"+ vehicleNo);
        System.out.println("Vehicle Name:"+ vehicleName);
        System.out.println("Number of Wheels:"+ wheels);

        if(powerSteer == true)
            System.out.println("Power Steering:Yes");
else
        System.out.println("Power Steering:No");
    }
}
/**
 * Define the TestVehicle.java class
 */
public class TestVehicle {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Create an object of child class and specify the values
        FourWheeler objFour = new FourWheeler("LA-09 CS-1406", "Volkswagen", 4, true);
        objFour.showDetails(); // Invoke the child class method
        objFour.accelerate(200); // Invoke the inherited method
    }
}

