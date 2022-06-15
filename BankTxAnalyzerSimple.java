public class BankTransactionAnalyzerSimple {
    private static final String RESOURCES = "src/main/resources/";
    
    public static void main(final String... args) throws IOException {
    	
    	final Path path = Paths.get(RESOURCES + args[0]);
    	final List<String> lines = Files.readAllLines(path);
    	double total =0d;
      //uncomment to calculate sums in certain month
    	//final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("dd-MM-yyyy")
    	for(final String line: lines) {
    		final String[] columns = lines.split(",");
    		final double amount = Double.parseDouble(columbs[1]);
    		total += amount;
    	}
    	
      //system.out.println("The total for January is " + total);
    	system.out.println("The total for all tx is " + total);
    }
}
