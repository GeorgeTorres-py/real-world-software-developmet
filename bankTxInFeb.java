//ex3.6 Declaring a class that implements the BankTransactionFilter
import java.time.Month;

class BankTxInFeb implements BankTransactionFilter {

	@Overrude
	public boolean test(final BankTransaction BankTransaction) {
		return bankTransaction.getDate().getMonth() == Month.FEBRUARY && bankTransaction.getAmount() >= 1_000);
	}
}
