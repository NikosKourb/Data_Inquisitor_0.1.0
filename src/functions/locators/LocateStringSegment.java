package functions.locators;


import java.util.ArrayList;

import parameters.StringSegmentIdentifier;
import parameters.StringSegmentLocation;



public interface LocateStringSegment extends CheckHTMLIdentifier , LocateLineIndex , LocateCharacterStartOrEndIndex {
	
	
	
	public default ArrayList< StringSegmentLocation > getStringSegmentLocations( String[] htmlLineArray , StringSegmentIdentifier identifier , ArrayList< Integer > lineIndexList ) {
		
		ArrayList< StringSegmentLocation > locationList = new ArrayList< StringSegmentLocation >();
		
		for ( int i = 0; i < lineIndexList.size(); i++ ) {

			int characterStartPositionIndex = getStringSegmentCharacterStartOrEndIndex( htmlLineArray, lineIndexList.get( i ) , identifier , true );

			int characterEndPositionIndex = getStringSegmentCharacterStartOrEndIndex( htmlLineArray, lineIndexList.get( i ) , identifier , false );

			StringSegmentLocation location = new StringSegmentLocation( lineIndexList.get( i ), characterStartPositionIndex , characterEndPositionIndex );
			
			locationList.add( i , location );
			
		}
		
		locationList.trimToSize();
		
		return locationList;
		
	}
	
	
	
	
	
}
