package parameters.html;


import java.io.File;
import functions.transfigurers.html.HTMLToTextFileTransfigure;



public class HTMLTextFile extends HTML implements HTMLToTextFileTransfigure {
	
	private File htmlFile;
	private String fileName;
	
	public HTMLTextFile() {}
	
	
	public HTMLTextFile( String urlAddress , String fileName ) {
		
		super( urlAddress );
		
		this.htmlFile = HTMLToTextFile( urlAddress , fileName );
		
	}
	
	
	
	public String getFileName() {
		
		return fileName;
		
	}
	
	
	
	public void setFileName( String fileName ) {
		
		this.fileName = fileName;
		
	}
	
	
	
	public File getHtmlFile() {
		
		return htmlFile;
		
	}
	
	
	
	public void setHtmlFile() {
		
		this.htmlFile = HTMLToTextFile( getUrlAddress() , getFileName() );
		
	}
	
	
	
	
	
}
