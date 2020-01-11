package data;
/**
* Represents the percentage the patient pays.
*/
final public class PatientContr {
    private final BigDecimal amount_paid;  //porcentaje que paga el paciente

    public ProductID(String cantidad) {
        if(cantidad==null) throw NullPointerException("amount is null");
        this.amount_paid = cantidad; 
    }
    public String getAmountPaid() {
        return amount_paid;
        }
    @Override
    public int hashCode() {
        return amount_paid.hashCode();
    }
    @Override
    public String toString() {
        return "PatientContr{" + "amount paid='" + amount_paid + '\'' + '}';
    }
}