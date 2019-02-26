package parameters;


public class RelevantPosition {
	
	int relevantLinePositionIndex;
	int relevantCharacterPositionIndex;
	
	
	public RelevantPosition() {}
	
	
	public RelevantPosition( int relevantLinePositionIndex , int relevantCharacterPositionIndex ) {
		
		this.relevantLinePositionIndex = relevantLinePositionIndex;
		
		this.relevantCharacterPositionIndex = relevantCharacterPositionIndex;
		
	}
	
	
	
	public int getRelevantLinePositionIndex() {
		
		return relevantLinePositionIndex;
		
	}
	
	
	
	public void setRelevantLinePositionIndex( int relevantLinePositionIndex ) {
		
		this.relevantLinePositionIndex = relevantLinePositionIndex;
		
	}
	
	
	
	public int getRelevantCharacterPositionIndex() {
		
		return relevantCharacterPositionIndex;
		
	}
	
	
	
	public void setRelevantCharacterPositionIndex( int relevantCharacterPositionIndex ) {
		
		this.relevantCharacterPositionIndex = relevantCharacterPositionIndex;
		
	}
	
	
	
	@Override
	public String toString() {
		
		return "Relevant Position= [ " + relevantLinePositionIndex + " , " + relevantCharacterPositionIndex + " ]";
		
	}
	
	
	
	
	
}
