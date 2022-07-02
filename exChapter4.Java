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

//ex4.4 image importer
class ImageImporter implements Importer {
			@Override
			public Document importFile(final File file) throws IOException {
				final Map<String, String> attributes = new HashMap<>();
				attributes.put(PATH, file.getPath());
				
				final BufferedImage image = ImageIO.read(file);
				
				attributes.put(WIDTH, String.valueOf(image.getWidth()));
				attributes.put(HEIGHT, String.valueOf(image.getHeight()));
				attributes.put(TYPE, "IMAGE");
				
				return new Document(attributes);
	}
	
}

//ex4.5 define a constant
public static final String PATH = "name/to/path"
	
	
//ex4.6 registering imports
	
	private final Map<String, Importer> extensionToImporter = new HasMap<>();

	public DocumentManagementSytem() {
	    extensionToImporter.put("letter", new LetterImporter());	
	    extensionToImporter.put("report", new ReportImporter());	
	    extensionToImporter.put("jpg", new ImageImporter());	
}
