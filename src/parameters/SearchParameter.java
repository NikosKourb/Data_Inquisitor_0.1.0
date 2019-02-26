package parameters;


public class SearchParameter {
	
	private RelevantPosition relevantPosition;
	private String searchTerm;
	
	
	public SearchParameter() {}
	
	
	public SearchParameter( RelevantPosition relevantPosition , String searchTerm ) {
		
		this.relevantPosition = relevantPosition;
		
		this.searchTerm = searchTerm;
		
	}
	
	
	public SearchParameter( int relevantLinePositionNumber , int relevantCharacterPositionNumber , String searchTerm ) {
		
		this.relevantPosition = new RelevantPosition( relevantLinePositionNumber , relevantCharacterPositionNumber );
		
		this.searchTerm = searchTerm;
		
	}
	
	
	
	public RelevantPosition getRelevantPosition() {
		
		return relevantPosition;
		
	}
	
	
	
	public void setRelevantPosition( RelevantPosition relevantPosition ) {
		
		this.relevantPosition = relevantPosition;
		
	}
	
	
	
	public String getSearchTerm() {
		
		return searchTerm;
		
	}
	
	
	
	public void setSearchTerm( String searchTerm ) {
		
		this.searchTerm = searchTerm;
		
	}
	
	
	
	@Override
	public String toString() {
		
		return "Search Parameter= { " + relevantPosition.toString() + " , Search Term= [ " + searchTerm + " ] }";
		
	}
	
	
	
	
	
}
