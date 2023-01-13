package weekTwo;

public class Practice {
    

    public static void main(String[] args) {
        
        Car mazda6 = new Car();

        mazda6.setColor("red");
        mazda6.setMake("mazda");
        mazda6.setVin("123CANTSTEALME");


        System.out.println(mazda6.toString());

        Car bugatti = new Car("FAKEVIN", "blue", 4, 
        "2023", "Bugatti", "Veyron");

        System.out.println(bugatti.toString());

    }

}

