package pharmacy;

import data.PatientContr;
import data.ProductID;
import pharmacy.exceptions.NotProductSaleLineException;
import pharmacy.exceptions.SaleClosedException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

/**
 * Package for the classes involved in the use case Suply next dispensing
 */
public class Sale { // A class that represents the sale of medicines
    private String saleCode;
    private Date date;
    private BigDecimal amount;
    private boolean isClosed; // flag to know if the sale is closed
    // Its components, among others
    private ArrayList<ProductSaleLine> productSaleLines;

    public Sale (String saleCode) {
        this.saleCode=saleCode;
        this.date=new Date();
        this.amount=new BigDecimal("0");
        this.isClosed=false;
        productSaleLines = new ArrayList<ProductSaleLine>();
    } // Assigns the current date, a code to the sale, etc.
    public void addLine(ProductID prodID, BigDecimal price, PatientContr contr)
            throws SaleClosedException {
        if(isClosed) {
            throw new SaleClosedException("The sale is closed");
        }
        productSaleLines.add( new ProductSaleLine( prodID, price.multiply(contr.getAmountPaid()), contr) );
    }
    private void calculateAmount() {
        for (int i=0; i < productSaleLines.size(); i++){
            amount.add(productSaleLines.get(i).subtotal);
        }
    }
    private void addTaxes() throws SaleClosedException {
        if(isClosed) {
            throw new SaleClosedException("The sale is closed");
        }
        amount=amount.add(amount.multiply(new BigDecimal("0.21")));
    }
    public void calculateFinalAmount() throws SaleClosedException {
        this.calculateAmount();
        this.addTaxes();
        this.isClosed=true;
    }
    public BigDecimal getAmount() {
        return amount;
    }
    private void setClosed() {
        this.isClosed=true;
    }
    public boolean isClosed() {
        return this.isClosed;
    }

    // the rest of getters, setters and methods
    public ProductSaleLine getProductSaleLine(ProductID productID) throws NotProductSaleLineException {
        for (int i=0; i < productSaleLines.size(); i++){
            if (productSaleLines.get(i).productID == productID){
                return productSaleLines.get(i);
            }
        } throw new NotProductSaleLineException("ProductSaleLine not exist.");
    }

    public ProductID getProductID(int i) {
        return this.productSaleLines.get(i).productID;
    }
}
