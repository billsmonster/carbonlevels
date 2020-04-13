// Derek Lenz
//This project uses formulas to project the carbon footprint of a company


package carbon;

public class comInfo {

	    String conName;  // business name
	    String cityNam;  // business city a
	    int elecUse;     // Kills a year it uses
	    int nGsUse;      //natural gas used a year
	    int fOuse;     // fuel oil use a year
	    int waistUse;  //waist use per year
	    int watUse;    //watet use a day
	    
	
	    public comInfo(String conName, String cityNam, 
	    		int elecUse,int nGsUse,int fOuse, int waistUse, int watUse) { 
	        this.conName = conName; 
	        this.cityNam = cityNam; 
	        this.elecUse = elecUse;
	        this.nGsUse = nGsUse; 
	        this.fOuse = fOuse; 
	        this.waistUse =waistUse;
	        this.watUse=watUse;
	    } 
	  
	 
	    public String getconName() { 
	        return conName; 
	    } 
	  
	  
	    public String getcityNam() { 
	        return cityNam; 
	    } 
	  
       
	    public int getelecUse() {
        	return elecUse;
        }
	   
      
	    public int getnGsUse() {
        	return nGsUse;
        }
        
      
	    public int getfOuse()  { 
	        return fOuse; 
	    } 
	  
       
	    public int getwaistUse() {
        	return waistUse;
        }
	    
	    public int getwatUse()  { 
	        return watUse; 
	    } 
	  
	    @Override
	    public String toString() { 
	        return("company name is : "+ this.getconName()+ 
	               ".\nCompany city : " + 
	               this.getcityNam()+" \nElec use :" + this.getelecUse()+ 
	               "\nNatural gas use: "+ this.getnGsUse()+"\nFuel oil use : " +this.getnGsUse()
	               +"\n Waste used: " +this.getfOuse() +"\n Water used : "+ this.getwatUse()); 
	    } }
