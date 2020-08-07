package com.testing;

public interface DataFile {
	Xls_Reader d=new Xls_Reader("F:\\DEV_IT_Training\\DIT_Selenium\\Dit Project\\Final_Project\\projectData\\testData.xlsx");
	public String URL=d.getCellData("URL", 1, 1);
	
	public String email1=d.getCellData("logincredentials", 0, 2);
	
	public String password1=d.getCellData("logincredentials", 1, 2);
	
	public String email2=d.getCellData("logincredentials", 0, 3);
	
	public String password2=d.getCellData("logincredentials", 1, 3);
	
	
	
	
	
	
	
	
	

}
