package sorters;


import java.util.Comparator;
import parameters.SearchParameter;



public class SortByLineRelevantPosition implements Comparator< SearchParameter > {
	
	
	public SortByLineRelevantPosition() {}
	
	
	
	@Override
	public int compare( SearchParameter searchParameter1 , SearchParameter searchParameter2 ) {
		
		return searchParameter1.getRelevantPosition().getRelevantLinePositionIndex()
		       - searchParameter2.getRelevantPosition().getRelevantLinePositionIndex();
		
	}
	
	
	
	
	
}
