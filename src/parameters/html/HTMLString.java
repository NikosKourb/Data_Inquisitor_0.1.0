package parameters.html;


import functions.transfigurers.html.HTMLToStringTransfigure;



public class HTMLString extends HTML implements HTMLToStringTransfigure {
	
	private String htmlString;
	
	
	public HTMLString() {}
	
	
	public HTMLString( String urlAddress ) {
		
		super( urlAddress );
		
		this.htmlString = HTMLToString( urlAddress );
		
	}
	
	
	
	public String getHtmlString() {
		
		return htmlString;
		
	}
	
	
	
	public void setHtmlString() {
		
		this.htmlString = HTMLToString( getUrlAddress() );
		
	}
	
	
	
	
	
}
