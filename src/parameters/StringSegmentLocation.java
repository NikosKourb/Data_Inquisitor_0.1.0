package parameters;


//import java.util.ArrayList;
import functions.locators.LocateStringSegment;



public class StringSegmentLocation implements LocateStringSegment {
	
	private int lineIndex;
	private int characterStartPositionIndex;
	private int characterEndPositionIndex;
	
	
	public StringSegmentLocation() {}
	
	
	public StringSegmentLocation( int lineIndex , int characterStartPositionIndex , int characterEndPositionIndex ) {
		
		this.lineIndex = lineIndex;
		
		this.characterStartPositionIndex = characterStartPositionIndex;
		
		this.characterEndPositionIndex = characterEndPositionIndex;
		
	}
	
	
	/*public StringSegmentLocation( String[] htmlLineArray , StringSegmentIdentifier identifier ) {
		
		ArrayList< StringSegmentLocation > locations = getStringSegmentLocations( htmlLineArray , identifier, characterEndPositionIndex );
		
		this.lineIndex = location.getLineIndex();
		
		this.characterStartPositionIndex = location.getCharacterStartPositionIndex();
		
		this.characterEndPositionIndex = location.getCharacterEndPositionIndex();
		
	}*/
	
	
	
	public int getLineIndex() {
		
		return lineIndex;
		
	}
	
	
	
	public void setLineIndex( int lineIndex ) {
		
		this.lineIndex = lineIndex;
		
	}
	
	
	
	public int getCharacterStartPositionIndex() {
		
		return characterStartPositionIndex;
		
	}
	
	
	
	public void setCharacterStartPositionIndex( int characterStartPositionIndex ) {
		
		this.characterStartPositionIndex = characterStartPositionIndex;
		
	}
	
	
	
	public int getCharacterEndPositionIndex() {
		
		return characterEndPositionIndex;
		
	}
	
	
	
	public void setCharacterEndPositionIndex( int characterEndPositionIndex ) {
		
		this.characterEndPositionIndex = characterEndPositionIndex;
		
	}
	
	
	
	@Override
	public String toString() {
		
		return "StringSegmentLocation= [ lineNumber= " + lineIndex + " , characterStartPositionNumber= "
				+ characterStartPositionIndex + " , characterEndPositionNumber= " + characterEndPositionIndex + " ]";
		
	}
	
	
	
	
	
}
