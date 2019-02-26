package sorters;


import java.util.Comparator;
import parameters.SearchParameter;



public class SortByCharacterRelevantPosition implements Comparator< SearchParameter > {
	
	
	public SortByCharacterRelevantPosition() {}
	
	
	
	@Override
	public int compare( SearchParameter searchParameter1 , SearchParameter searchParameter2 ) {
		
		return searchParameter1.getRelevantPosition().getRelevantCharacterPositionIndex()
		       - searchParameter2.getRelevantPosition().getRelevantCharacterPositionIndex() ;
		
	}
	
	
	
	
	
}
