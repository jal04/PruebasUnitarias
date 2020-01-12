package pharmacy;

public class ProductSpecification {

    int UPCcode;
    String description;
    int price;
    public ProductSpecification(int UPCcode, String description, int price){
        this.description=description;
        this.UPCcode=UPCcode;
        this.price=price;
    }
}
