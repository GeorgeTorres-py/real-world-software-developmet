
//ex 2.9 An example of informational cohesion

public class BankTransactionDAO {
    public BankTransaction create(final LocalDate date,final double amount, final String description) {
        throw new UnsupportedOperationExeption();

    }

    public BankTransaction read(final long id) {
        throw new UnsupportedOperationExeption();
    }

    public BankTransaction update(final long id) {
        throw new UnsupportedOperationExeption();
    }
    
    public void delete(final BankTransaction BankTransaction) {
        // ...
        throw new UnsupportedOperationException();
        }
}
