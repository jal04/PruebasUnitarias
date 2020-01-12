package pharmacy;

import data.ProductID;

import java.math.BigDecimal;

public class ProductSpecification {

    ProductID UPCcode;
    String description;
    BigDecimal price;
    public ProductSpecification(ProductID UPCcode, String description, BigDecimal price){
        this.description=description;
        this.UPCcode=UPCcode;
        this.price=price;
    }
    public  ProductSpecification(){

    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setUPCcode(ProductID UPCcode) {
        this.UPCcode = UPCcode;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public ProductID getUPCcode() {
        return UPCcode;
    }

    public String getDescription() {
        return description;
    }
}
