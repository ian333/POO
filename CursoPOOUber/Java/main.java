class Main{
    public static void main(String[] args) {

        System.out.println("Hola mundo");

        Car car = new Car("AMD1234",new Account("Andres Herrera", "AND123"));

        car.passengers =4 ;
        car.printDataCar(); 
        
    }
}