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
