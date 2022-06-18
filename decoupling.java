//ex2.12 Decoupling the Bank Statements Analyzer from the parser

public class BankStatementAnalyzer {
    private static final String RESOURCES = "";

    public void analyze(final String fileName, final BankStatementParser BankStatementParser) throws IOException {

        final Path path = Paths.get(RESOURCES + fileName);
        final List<String> lines - Files.readAllLines(path);

        final List<BankTransaction> bankTransactions = BankStatementParser.parseLinesFrom(lines);

        final BankStatementProcessor bankStatementProcessor = new BankStatementProcessor(bankTransactions);

            collectSummary(bankStatementProcessor);
    }
    
}
