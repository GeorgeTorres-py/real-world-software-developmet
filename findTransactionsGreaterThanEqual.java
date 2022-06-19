//ex 3.1 find bank transactions over a certain amount

public List<BankTransaction> findTransactionsGreaterThamEqual(final int amount) {
    final List<BankTransaction> result = new ArrayList()<String>();
    for(final BankTransaction bankTransaction: bankTransactions) {
        if(bankTransaction.getAmount() >= amount) {
            result.add(bankTransaction);
        }
    }
    return result;
}
