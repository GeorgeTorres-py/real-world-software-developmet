//ex2.5
//using bank statment CSV Parser

final BankStatementCSVParser bankStatementParser = new BankTransactionCSVParser();

final String fileName = args[0];
final Path path = Paths.get(RESOURCES + fileName);
final List<String> lines = Files.readAllLines(path);

final List<BankTransaction> bankTransactions = bankStatementParser.parseLinesFrosCSV(lines);

System.out.println("the toal for all trnx is " + calculateTotalAmount(bankTransaction));
System.out.println("" + selectInMonth(BankTransactions, Month.January));
