import java.util.ArrayList;
import java.util.Map;

class UberBlack extends Car {
    Map<string,ArrayList<String,Integer>> typeCarAccepted;
    ArrayList<String>seatsMaterial;
    public UberBlack(String license, Account driver,
    Map<string,ArrayList<String,Integer>> typeCarAccepted
    ,ArrayList<String>seatsMaterial){
        super(license,driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;



    }
    
}
