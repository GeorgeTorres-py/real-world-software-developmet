//ex 3.5 Flexible findTransactions() method using Open/Closed Principle

public List<BankTransaction> findTransaction(final BankTransactionFilter bankTransactionFilter) {
	final List<BankTransaction> result = new ArrayList<>();
	for(final BankTransaction bankTransaction: BankTransactions) {
		if(bankTransactionFilter.test(bankTransaction)) {
			result.add(bankTransaction);
		}
	}
	return result;
}
