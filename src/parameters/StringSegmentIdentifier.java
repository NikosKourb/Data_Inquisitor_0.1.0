package parameters;


import java.util.ArrayList;
import java.util.Arrays;
import sorters.SortByCharacterRelevantPosition;
import sorters.SortByLineRelevantPosition;



public class StringSegmentIdentifier {
	
	
	private SearchParameter[] searchParameterArray;
	
	
	public StringSegmentIdentifier() {};
	
	
	public StringSegmentIdentifier( SearchParameter[] searchParameterArray ) {
		
		Arrays.sort( searchParameterArray , new SortByLineRelevantPosition() );
		
		this.searchParameterArray = searchParameterArray;
		
	}
	
	
	public StringSegmentIdentifier( ArrayList< SearchParameter > searchParameterList ) {
		
		SearchParameter[] newSearchParameterArray = searchParameterList.toArray( new SearchParameter[ searchParameterList.size() ] );
		
		Arrays.sort( newSearchParameterArray , new SortByLineRelevantPosition() );
		
		this.searchParameterArray = newSearchParameterArray;
		
	}
	
	
	
	public SearchParameter[] getSearchParameterArray() {
		
		return searchParameterArray;
		
	}
	
	
	
	public SearchParameter[] getSameLineSearchParameters() {
		
		ArrayList< SearchParameter > sameLineParametersList = new ArrayList< SearchParameter >();
		SearchParameter[] searchParameterArray = getSearchParameterArray();
		int counter = 0;
		
		for ( int i = 0; i < searchParameterArray.length; i++ ) {
			
			int relevantLinePosition = searchParameterArray[ i ].getRelevantPosition().getRelevantLinePositionIndex();
			
			if ( relevantLinePosition == 0 ) {
				
				sameLineParametersList.add( counter , searchParameterArray[ i ] );
				
				counter++;
				
			}
			
		}
		
		SearchParameter[] sameLineParametersArray = sameLineParametersList.toArray( new SearchParameter[ sameLineParametersList.size() ] );
		
		Arrays.sort( sameLineParametersArray , new SortByCharacterRelevantPosition() );
		
		return sameLineParametersArray;
		
	}
	
	
	
	@Override
	public String toString() {
		
		String arrayString = "";
		
		for( int i = 0; i < searchParameterArray.length; i++ ) {
			
			arrayString = arrayString + ( searchParameterArray[ i ].toString() + "\n" );
			
		}
		
		return "StringSegmentIdentifier=" + "\n" + arrayString;
		
	}
	
	
	
	
	
}
