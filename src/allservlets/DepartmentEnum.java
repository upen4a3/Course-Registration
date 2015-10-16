package allservlets;

public enum DepartmentEnum {
	
	ACC("Accounting"),
	AST("Astronomy"),
	ATH("Athletics"),
	BIOL("Biology"),
	CIV("Civil Eng."),
	CS("Comp. Sci."),
	ENG("English"),
	EE("Elec. Eng."),
	FIN("Finance"),
	HIST("History"),
	MATH("Math"),
	PHY("Physics");
	
	DepartmentEnum(String deptName){
		this.setDeptName(deptName);
	}
	
	private String deptName;
	
	public String getName(){
		return name();
	}
	
	/**
	 * @return the deptName
	 */
	public String getDeptName() {
		return deptName;
	}

	/**
	 * @param deptName the deptName to set
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
}
