package functions.locators;


import parameters.SearchParameter;
import parameters.StringSegmentIdentifier;



public interface CheckHTMLIdentifier {
	
	
	
	public default boolean checkIfStringSegmentIdentifierIsInHTML( String[] htmlLineArray , StringSegmentIdentifier identifier , int lineNumber , int searchParameterArrayIndex ) {
			
		SearchParameter[] searchParameterArray = identifier.getSearchParameterArray();
		boolean flag = false;

		//while ( lineNumber < htmlLineArray.length || searchParameterArrayIndex < searchParameterArray.length ) {

			while ( lineNumber < htmlLineArray.length ) {

				if ( htmlLineArray[ lineNumber ].contains( searchParameterArray[ searchParameterArrayIndex ].getSearchTerm() ) ) {
					
					System.out.println(" I'm checking ");

					int currentLineRelevantNumber = searchParameterArray[ searchParameterArrayIndex ].getRelevantPosition().getRelevantLinePositionIndex();

					int nextLineRelevantNumber = searchParameterArray[ searchParameterArrayIndex + 1 ].getRelevantPosition().getRelevantLinePositionIndex();

					int lineDifference = nextLineRelevantNumber - currentLineRelevantNumber;

					lineNumber = lineNumber + lineDifference;

					searchParameterArrayIndex++;

					flag = true;
					
					break;

				}

				else {

					lineNumber++;

					flag = false;
					
					System.out.println( flag );

				}

			}
			
			System.out.println(" I'm out ");
			
			if( searchParameterArrayIndex < searchParameterArray.length && flag == true ) {
				
				System.out.println(" I'm recursing ");
				
				return ( checkIfStringSegmentIdentifierIsInHTML( htmlLineArray , identifier , lineNumber , searchParameterArrayIndex ) );
				
			}
			
			else {
				
				System.out.println(" I'm exiting ");
				
				flag=true;
				
				return flag;
				
			}
			
	}
	
	
	
	
	
}
