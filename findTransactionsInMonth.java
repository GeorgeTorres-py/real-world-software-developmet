// ex3.2 Find bank transactions in a certain month

public List<BankTransaction> findTransactionsIn Month(final Month month) {
    final List<BankTransaction> result = new ArrayList()<String>();
    for(final BankTransaction bankTransaction: bankTransactions) {
        if(bankTransaction.getDate().getMonth() == month) {
            result.add(bankTransaction);
        }
    }
    return result;
}
