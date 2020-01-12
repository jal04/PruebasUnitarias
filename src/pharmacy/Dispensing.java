package pharmacy;

import data.ProductID;

import java.util.Date;

public class Dispensing {
    /**
     * A class that represents the period for dispensing a certain set of
     * medicines, its state and the set of medicines
     */
    private byte nOrder; // n. of order for this dispensing inside the treatment
    private Date initDate, finalDate; // The period
    private boolean isCompleted;
    // The set of medicines to dispense and its control, among others
    public Dispensing() {
        this.isCompleted=false;
        this.initDate=new Date();
    } // Makes some inicialization
    public boolean dispensingEnabled() throws DispensingNotAvailableException{
        if(new Date().after(initDate)){
            return true;
        }else{
            throw new DispensingNotAvailableException();
        }
    }
    public void setProductAsDispensed(ProductID prodID) {

    }
    public void setCompleted() {
        this.isCompleted=true;
    }
    // the rest of getters and setters
}
