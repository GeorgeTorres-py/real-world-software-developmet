//ex.3.4 bank tx filterinterface
@FunctionalInterface
public interface BankTransactionFilter {
    boolean test(BankTransaction bankTransaction);
   
}
