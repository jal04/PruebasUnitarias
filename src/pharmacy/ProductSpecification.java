package pharmacy;

public class ProductSpecification {

    String UPCcode;
    String description;
    int price;
    public ProductSpecification(String UPCcode, String description, int price){
        this.description=description;
        this.UPCcode=UPCcode;
        this.price=price;
    }
    public  ProductSpecification(){

    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setUPCcode(String UPCcode) {
        this.UPCcode = UPCcode;
    }

    public int getPrice() {
        return price;
    }

    public String getUPCcode() {
        return UPCcode;
    }

    public String getDescription() {
        return description;
    }
}
