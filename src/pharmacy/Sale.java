package pharmacy;

import data.PatientContr;
import data.ProductID;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Package for the classes involved in the use case Suply next dispensing
 */
public class Sale { // A class that represents the sale of medicines
    private int saleCode;
    private Date date;

    private BigDecimal amount;
    private boolean isClosed; // flag to know if the sale is closed
 //??? // Its components, among others
    public Sale (int saleCode, Date date, String amount, boolean isClosed) {
        this.saleCode=saleCode;
        this.date=date;
        this.amount=new BigDecimal(amount);
        this.isClosed=isClosed;
    } // Assigns the current date, a code to the sale, etc.
    public void addLine(ProductID prodID, BigDecimal price, PatientContr contr)
            throws SaleClosedException {
        new ProductSaleLine(subtotal);
    }
    private void calculateAmount() { . . . }
    private void addTaxes() throws SaleClosedException { . . . }
    public void calculateFinalAmount() throws SaleClosedException { . . . }
    public BigDecimal getAmount() { . . . }
    private void setClosed() { . . . }
    public boolean isClosed() { . . . }
//??? // the rest of getters, setters and methods
}
