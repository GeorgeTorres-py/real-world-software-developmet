//ex 2.14 Run main application

public class Mainapplication {
    
    public static void main(String[] args) throws IOException {
        
        final BankStatementAnalyzer bankStatementAnalyzer = new BankStatementAnazlyzer();
        
        final BankStatementParser bankStatementParser = new BankStatementCSVParser();
        
        bankStatmentAnalyzer.analyze(arg[0], bankStatementParser);
    }
}
