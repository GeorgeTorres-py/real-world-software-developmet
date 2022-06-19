//ex.3.3 Find bank transactions in a certain month and over a certain amount

public List<BankTransaction> findTransactionsInMonthAndGreater(final Month month) {
    final List<BankTransaction> result = new ArrayList()<String>();
    for(final BankTransaction bankTransaction: bankTransactions) {
        if(bankTransaction.getDate().getMonth() == month && bankTransaction.getA
mount() >= amount) {
            result.add(bankTransaction);
        }
    }
    return result;
}
