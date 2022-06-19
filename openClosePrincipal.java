//ex 3.5 Flexible findTransactions() method using Open/Closed Principle

public List<BankTransaction> findTransactions(finalBankTransactionFilter bankTransactionFilter) {
    final List<BankTransaction> result = new ArrayList()<String>();
    for(final BankTransaction bankTransaction: bankTransactions) {
        if(bankTransactionFilter.test(bankTransaction)) {
            result.add(bankTransaction);
        }
    }
    return result;
}
