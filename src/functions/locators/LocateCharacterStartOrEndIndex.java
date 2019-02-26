package functions.locators;


import parameters.SearchParameter;
import parameters.StringSegmentIdentifier;



public interface LocateCharacterStartOrEndIndex {
	
	
	
	public default int getStringSegmentCharacterStartOrEndIndex( String[] htmlLineArray , int stringSegmentLineIndex , StringSegmentIdentifier identifier , boolean isBefore ) {
		
		SearchParameter[] sameLineSearchParameterArray = identifier.getSameLineSearchParameters();
		String line = htmlLineArray[ stringSegmentLineIndex ];
		int sameLineSearchParameterArrayIndex = -11;
		int characterStartOrEndNumber = -13;
		
		for( int i = 0; i < ( sameLineSearchParameterArray.length ); i++ ) {
			
			int RelevantCharacterPositionNumber = sameLineSearchParameterArray[ i ].getRelevantPosition().getRelevantCharacterPositionIndex();
			
			if( RelevantCharacterPositionNumber > 0 ) {
				
				if( isBefore == true ) {
					
					sameLineSearchParameterArrayIndex = i - 1;
					
				}
				
				else {
					
					sameLineSearchParameterArrayIndex = i;
					
				}
				
				break;
				
			}
			
		}
		
		String closerSearchTerm = sameLineSearchParameterArray[ sameLineSearchParameterArrayIndex ].getSearchTerm();
		
		if( isBefore == true ){
			
			int closerSearchTermDistance = ( sameLineSearchParameterArray[ sameLineSearchParameterArrayIndex ].getRelevantPosition().getRelevantCharacterPositionIndex() ) + 1;
			
			characterStartOrEndNumber = ( line.indexOf( closerSearchTerm ) + closerSearchTerm.length() ) + closerSearchTermDistance;
			
		}
		
		else {
			
			int closerSearchTermDistance = ( sameLineSearchParameterArray[ sameLineSearchParameterArrayIndex ].getRelevantPosition().getRelevantCharacterPositionIndex() ) - 1;
			
			characterStartOrEndNumber = line.indexOf( closerSearchTerm ) - closerSearchTermDistance;
			
		}
		
		return characterStartOrEndNumber;
		
	}
	
	
	
	
	
}
