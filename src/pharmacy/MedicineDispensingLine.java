package pharmacy;

import data.ProductID;

public class MedicineDispensingLine {

    Boolean acquired;
    public MedicineDispensingLine(ProductID productID){
        this.acquired=false;
    }

    public void productAcquired(){
        this.acquired=true;
    }
}
