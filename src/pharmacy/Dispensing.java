package pharmacy;

import data.ProductID;
import pharmacy.exceptions.DispensingNotAvailableException;
import pharmacy.exceptions.DispensingNotCompletedException;
import pharmacy.exceptions.NotProductSaleLineException;

import java.util.ArrayList;
import java.util.Date;

public class Dispensing {
    /**
     * A class that represents the period for dispensing a certain set of
     * medicines, its state and the set of medicines
     */
    private byte nOrder; // n. of order for this dispensing inside the treatment
    private Date initDate, finalDate; // The period
    private boolean isCompleted;
    public ArrayList<MedicineDispensingLine> medicines;
    // The set of medicines to dispense and its control, among others
    public Dispensing(byte nOrder, ArrayList<ProductSpecification> medicines) {
        this.isCompleted=false;
        this.nOrder=nOrder;
        this.initDate=new Date();
        for(ProductSpecification product : medicines){
            this.medicines.add(new MedicineDispensingLine(product));
        }
    } // Makes some inicialization

    public boolean dispensingEnabled() throws DispensingNotAvailableException {
        if(new Date().after(initDate)){
            return true;
        }else{
            throw new DispensingNotAvailableException();
        }
    }
    public void setProductAsDispensed(ProductID prodID) throws DispensingNotAvailableException {
        if(dispensingEnabled()) {
            for (MedicineDispensingLine medicine : medicines) {
                if (medicine.productSpecification.UPCcode == prodID.getProductID()) {
                    medicine.acquired = true;
                }
            }
        }
    }
    public void setCompleted() throws DispensingNotCompletedException, DispensingNotAvailableException{
        if(dispensingEnabled()) {
            for (MedicineDispensingLine medicine : medicines){
                if (!medicine.acquired) {
                    throw new DispensingNotCompletedException("More to dispense.\n");
                }
            }
            this.finalDate=new Date();
            this.isCompleted = true;
        }
    }
    // the rest of getters and setters
}
