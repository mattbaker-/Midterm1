package MainPackage;

public enum eClassRank {
	FRESHMAN (0),
	SOPHOMORE (1),
	JUNIOR (2),
	SENIOR (3);
	
	private int rank;
	
	private eClassRank(int r) {
		this.rank = r;
	}
	
	public int getRank() {
		return rank;
	}
}
