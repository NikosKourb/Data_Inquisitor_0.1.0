package functions.extractors;


import functions.locators.LocateStringSegment;
import parameters.StringSegmentLocation;



public interface ExtractStringSegment extends LocateStringSegment {
	
	
	
	public default String getStringSegment( String[] htmlLineArray , StringSegmentLocation location ) {
		
		String htmlLine = htmlLineArray[ location.getLineIndex() ];
		
		String wantedSegment =  htmlLine.substring( location.getCharacterStartPositionIndex() , location.getCharacterEndPositionIndex() );
		
		wantedSegment = wantedSegment.trim().replaceAll( "&amp;" , "&" );
		
		return wantedSegment;
		
	}
	
	
	
	
	
}
