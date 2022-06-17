//example 2.6
//declaring methods claculateTotalAmount and SelectInMonth which are responsible 
//for processing the list of transactions and returning results 

public static double calculateTotalAmount(finalList<BankTransaction> bankTransaction){
    double total = 0d;
    for(final BankTransaction bankTransaction: bankTransactions) {
        total += bankTransaction.getAmount();
    }
    return total;
}

public static List<BankTransaction> selectInMonth(final List<BankTransacrion> bankTransactions, final Month month) {

    final List<BankTransaction> bankTransactionInMonth = new ArrayList<>();
    for(final BankTransacrion bankTransaction: bankTransactions) {
        if(bankTransaction.getDate().getMotn() == month) {
            bankTransactionInMonth.add(bankTransaction);
        }
    }
    return bankTransactionInMonth
}
