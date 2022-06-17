//ex 2.7

public class BankStatementProcessor {
    private final List<BankTransaction> bankTransactions;

    public BankStatementProcessor(final List<BankTransaction> bankTransactions) {
        this.bankTransactions = bankTransaction;
    }
    public double calculateTotalAmount() {
        double total = 0;
        for(final BankTransaction bankTransaction: bankTransaction) {
            total += bankTransaction.getAmount();
        }
        return total;
    }
    public double calculateTotalInMonth(final Month month) {
        double total = 0;
        for(final BankTransaction bankTransaction: bankTransactions) {
            if(bankTransaction.getDate().getMonth() == month) {
                total += bankTransaction.getAmount();
            }
        }
        return total;
    }
}
