package data;
/**
 * Represents the percentage the patient pays.
 */
final public class PatientContr {
    private final String amount_paid;  //porcentaje que paga el paciente

    public PatientContr(String amount_paid) {
        if(amount_paid==null) throw new NullPointerException("amount is null");
        this.amount_paid = amount_paid;
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