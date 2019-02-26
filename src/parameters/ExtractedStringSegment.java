package parameters;


import functions.extractors.ExtractStringSegment;



public class ExtractedStringSegment implements ExtractStringSegment{
	
	private String extractedStringSegment;
	
	
	public ExtractedStringSegment() {}
	
	
	public ExtractedStringSegment( String[] htmlLineArray , StringSegmentLocation location ) {
		
		this.extractedStringSegment = getStringSegment( htmlLineArray , location ) ;
		
	}
	
	
	
	public String getExtractedStringSegment() {
		
		return extractedStringSegment;
		
	}
	
	
	
	
	
}
