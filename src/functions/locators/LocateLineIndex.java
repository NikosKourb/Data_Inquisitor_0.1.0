package functions.locators;


import java.util.ArrayList;

import parameters.SearchParameter;
import parameters.StringSegmentIdentifier;



public interface LocateLineIndex {
	
	
	
	public default ArrayList< Integer > getStringSegmentLineIndex( String[] htmlLineArray , StringSegmentIdentifier identifier , boolean checkIfIdentifierIsInHTML ) {

		SearchParameter[] sameLineSearchParameterArray = identifier.getSameLineSearchParameters();
		ArrayList< Integer > lineIndexList = new ArrayList < Integer >();
		int count = 0;
		
		if ( checkIfIdentifierIsInHTML == true ) {

			for( int currentLineIndex = 0; currentLineIndex < htmlLineArray.length; currentLineIndex++ ) {
				
				if ( htmlLineArray[ currentLineIndex ].contains( sameLineSearchParameterArray[ 0 ].getSearchTerm() ) ) {
					
					lineIndexList.add( count , currentLineIndex );
					
					count++;
					
				}
				
			}

		}
		
		lineIndexList.trimToSize();
		
		return lineIndexList;

	}
	
	
	
	
	
}
