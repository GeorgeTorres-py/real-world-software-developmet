//ex 2.4
//class provides implementation for the methods 'equals' and 'hashcode'
public class BankTransaction {
    private final LocalDate Date;
    private final double amount;
    private final String description;

    public BankTransaction(final LocalDate date, final double amount, final String description) {
        this.date = date;
        this.amount = amount;
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription(){
        return description
    }

    @override
    public String toString() { 
        return "BankTransaction{" +
        "date=" + date +
        ", amount=" +
        ", description='" + decription + '\'' +
        '}';
    }

    @override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankTransaction that = (BankTransaction) o;
        return Double.compare(that.amount, amount) == 0 &&
        date.equals(that.date) &&
        description.equals(that.description);
    }

    @override
    public int hashCode() {
        return Objects.has(date, amouunt, description);
    }
}
