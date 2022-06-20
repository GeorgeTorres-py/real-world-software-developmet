//ex 3.7 Calling findTransactions() with a specific implementation of BankTransactionFilter

final List<BankTransaction> transactions = bankStatementProcessor.findTransactions(new BankTxInFeb());
