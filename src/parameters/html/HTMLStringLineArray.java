package parameters.html;


import functions.transfigurers.html.HTMLToStringLineArrayTransfigure;



public class HTMLStringLineArray extends HTML implements HTMLToStringLineArrayTransfigure {
	
	private String[] htmlLineArray;
	
	
	public HTMLStringLineArray() {}
	
	
	public HTMLStringLineArray( String urlAddress ) {
		
		super( urlAddress );
		
		this.htmlLineArray = HTMLToStringLineArray( urlAddress );
		
	}
	
	
	public HTMLStringLineArray( String urlAddress , String[] htmlLineArray ) {

		super( urlAddress );

		this.htmlLineArray = htmlLineArray;

	}
	
	
	
	public String[] getHtmlLineArray() {
		
		return htmlLineArray;
		
	}
	
	
	
	public void setHtmlLineArray() {
		
		this.htmlLineArray = HTMLToStringLineArray( getUrlAddress() );
		
	}
	
	
	
	
	
}
