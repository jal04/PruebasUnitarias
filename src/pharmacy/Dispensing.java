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
    public Sale sale;
    public List<MedicineDispensingLine> medicines;
    // The set of medicines to dispense and its control, among others
    public Dispensing(Sale sale, byte nOrder, List<ProductSpecification> medicines) {
        this.isCompleted=false;
        this.nOrder=nOrder
        this.initDate=new Date();
        this.sale = sale;
        for(ProductSpecification product : medicines){
            this.medicines.add(new MedicineDispensingLine(product));
        }
    } // Makes some inicialization
    public boolean dispensingEnabled() throws DispensingNotAvailableException{
        if(new Date().after(initDate)){
            return true;
        }else{
            throw new DispensingNotAvailableException();
        }
    }
    public void setProductAsDispensed(ProductID prodID) throws NotProductSaleLineException {
        ProductSaleLine productSaleLine=sale.getProductSaleLine(prodID);
        MedicineDispensingLine medicineDispensingLine = productSaleLine.getMedicineDispensingLine();
        medicineDispensingLine.productAcquired();
    }
    public void setCompleted() {
        this.isCompleted=true;
    }
    // the rest of getters and setters
}
