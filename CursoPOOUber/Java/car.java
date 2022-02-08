package CursoPOOUber.Java;

import java.sql.Driver;

import javax.lang.model.element.Name;

class Car {
    Integer id;
    String license;
    Account driver;
    Integer passengers;

    public Car(String license,Account driver){
        this.license = license;
        this.driver=driver;
    }
    void printDataCar(){
        System.out.println("Car License:"+license+"Driver name" +driver);
        
    }
    

}
