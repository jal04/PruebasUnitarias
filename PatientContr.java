package data;
/**
* Represents the percentage the patient pays.
*/
final public class PatientContr {
    private final BigDecimal amount_paid;  //porcentaje que paga el paciente

    public ProductID(String cantidad) {
        this.amount_paid = cantidad; 
    }
    public String getAmountPaid() {
        return amount_paid;
        }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductID percentAmountPaid = (PatientContr) o;
        return amount_paid.equals(percentAmountPaid.amount_paid);
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