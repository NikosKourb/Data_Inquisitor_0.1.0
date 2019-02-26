package testers;


import java.util.ArrayList;

import functions.transfigurers.html.HTMLToStringTransfigure;
import parameters.ExtractedStringSegment;
import parameters.SearchParameter;
import parameters.StringSegmentIdentifier;
import parameters.StringSegmentLocation;
import parameters.StringSegmentMap;
import parameters.html.HTMLStringLineArray;



public class Test01 implements HTMLToStringTransfigure {
	
	
	
	public static void main(String[] args) {
		
		
		
		
		//Parameters
		SearchParameter par01 = new SearchParameter( 0 , -1 , "class=\"ResultName\">" );
		SearchParameter par02 = new SearchParameter(0 , 1 , "</a>" );
		
		//System.out.println( par01 + " , " + par02 );
		
		
		// Parameter Array & SegmentIdentifier
		SearchParameter[] parArray01 = { par01 , par02 };
		
		//for ( int i = 0; i < parArray01.length; i++ ) {

			//System.out.println( parArray01[ i ] );

		//}
		
		StringSegmentIdentifier identifier01 = new StringSegmentIdentifier( parArray01 );
		
		
		// HTML
		HTMLStringLineArray site = new HTMLStringLineArray( "https://www.vrisko.gr/efimeries-farmakeion/agia-barbara/" );
		String[] htmlLineArray = site.getHtmlLineArray();
		
		//for ( int i = 0; i < htmlLineArray.length; i++ ) {
			
			//System.out.println( htmlLineArray[ i ] );
			
		//}
		
		
		//Location
		StringSegmentMap locationAll = new StringSegmentMap( /*htmlLineArray , identifier01*/ );
		
		ArrayList< Integer > lineIndexList = locationAll.getStringSegmentLineIndex( htmlLineArray , identifier01 , true);
		
		//System.out.println( lineIndexList.size() );
		
		//for( int i = 0; i < lineIndexList.size(); i++ ) {
			
			//System.out.println( lineIndexList.get( i ) );
			
		//}
		
		//Location List
		ArrayList< StringSegmentLocation > locationList = locationAll.getStringSegmentLocations( htmlLineArray , identifier01 , lineIndexList );
		
		ArrayList< ExtractedStringSegment > extractedSegmentList = new ArrayList< ExtractedStringSegment >();
		
		for( int i = 0; i < locationList.size(); i++ ) {
			
			StringSegmentLocation location = locationList.get( i );
			
			ExtractedStringSegment extractedSegment = new ExtractedStringSegment( htmlLineArray , location );
			
			extractedSegmentList.add( i , extractedSegment );
			
		}
		
		//Extracted Segment List
		for( int i = 0; i < extractedSegmentList.size(); i++ ) {
			
			System.out.println( extractedSegmentList.get( i ).getExtractedStringSegment() );
			
		}
		
	}
	
	
	
	
	
}
