package data;
/**
* The product identifying code in the National Health Service.
*/
final public class ProductID {
    private final String productID;

    public ProductID(String code) {
        if(code==null) throw NullPointerException("code is null");
        if(code!=correct_format) throw IncorrectFormatException("Incorrect format code.");
        this. productID = code; 
    }
    public String getProductID() {
        return productID;
        }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductID universalpID = (ProductID) o;
        return productID.equals(universalpID.productID);
    }
    @Override
    public int hashCode() {
        return productID.hashCode();
    }
    @Override
    public String toString() {
        return "UniversalProductID{" + "product code='" + productID + '\'' + '}';
    }
}