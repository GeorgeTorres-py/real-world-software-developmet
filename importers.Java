//ex 4.1

public class DocumentManagementSystem {

	void importFiles(String path);
	List<Document> contents();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	switch(extension) {
	case "letter":
		//code to import letters
		break;
	
	case "report":
		//code for importing reports
		break;
		
	case ".jpg":
		//code for importing jpg
		break;
		
	default:
		throw new UnknownFilwTypeException("for file: " + path);
	}

}
//ex4.2
interface Importer {
	Document importFile(File file) throws IOException;
}
//ex4.3
public class Document {
	private final Map<String, String> attributes;
	
	Document(final Map<String, String>attributes) {
		this.attributes = attributes;
	}
	
	public String getAttribute(final String attributeName) {
		return attributes.get(attributeName);
	}
	
}
