//ex 2.8 Processing lists of bank transactions using the BankStatementProcessor class

public class BankStatementAnalyzer {
    private static final String RESOURCES = "";
    private static final BankStatementCSVParser bankStatementParser = new BankStatementCSVParser();

    public static void main(final String... args) throws IOException {
        final String fileName = args[0];
        final Path path = Paths.get(RESOURCES + fileName);
        final List<String> lines = Files.readAllLines(path);

        final List<BankTransaction> bankTransactions = bankStatementParser.parseLinesFrom(lines);
        final BankStatementProcessor bankStatementParser = new BankStatementProcessor(bankTransactions);

            collectSummary(bankStatementProcessor);
    }
    
    private static void collectSummary(final BankStatementProcessor bankStatementProcessor) {
        System.out.println("The total amount is " + bankStatementProcessor.calculateTotalAmount());

        System.out.println("The total for January is " + bankStatementProcessor.calculateTotalInMonth(Month.JANUARY));

        System.out.println("The total for ferbuary is " + bankStatementProcessor.calculateTotalInMonth(Month.FEBRUARY));

        System.out.println("the total salary received is " + bankStatementProcessor.calculateTotalForCategory("salary"));
    }
}
