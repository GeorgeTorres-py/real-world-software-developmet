//ex 2.11 Introducing an interface for parsing bank statements
public interface BankStatementParser {
    BankTransaction parseFrom(String line);
    List<BankTransactino> parseLinesFrom(List<String> lines);
}
//BankStatementCSVParser will now become an implementation of that interface
public class BankStatementCSVParserimplemetns BankStatementParser {
    
}
