package data;

import data.exceptions.FormatException;

/**
 * The product identifying code in the National Health Service.
 */
final public class ProductID {
    private final String productID;

    public ProductID(String code) throws FormatException {
        if(code==null) throw new NullPointerException("code is null");
        if(code.length()!=12) throw new FormatException("Incorrect format code.");   //En el caso en que un mal formato sea que tenga menos de 16 digitos.
        this.productID = code;
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