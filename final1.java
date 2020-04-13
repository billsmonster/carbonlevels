// Derek Lenz
// final class project
//This project uses formulas to project the carbon footprint of a company
// This is not the most efficient way to this 
//it does make it easir to acces the individual parts


package carbon;

import java.util.Scanner;

public class carbon {
    public static void main(String[] args)  { 
 int elecFT , ngFt, fFt, wuF, waFt, ultFT, TEl=5;
    	Scanner myObj = new Scanner(System.in);
    	
    	System.out.println("Please enter the company name");
    	String comps= myObj.nextLine();
    	System.out.println("Please enter the company city");
    	String cityNam= myObj.nextLine();
    	System.out.println("Please enter the company electric use a year");
    	int elec =myObj.nextInt();
    	System.out.println("Please enter the company natural gas use a year");
    	int ng= myObj.nextInt();
    	System.out.println("Please enter the company fuel oil use a year");
    	int fo= myObj.nextInt();
    	System.out.println("Please enter the waist used a week");
    	int wa= myObj.nextInt();
    	System.out.println("Please enter the water use a year");
    	int wat= myObj.nextInt();
    	
    	comInfo company=new comInfo(comps,cityNam, elec, ng,fo,wa,wat);
    	System.out.println(company.toString());
        // these are mostly basic numbers
    	elecFT= (int) (elec *0.6); // (kWh/yr) * EF (kg CO2e/kWh) = emissions (kg CO2e/yr)
    	//he average carbon intensity of electricity use is about 0.6 kg CO2e/kWh
    	
    	ngFt=(int) (ng*6.6); //(therms/yr) * EF (kg CO2e/therms) = emissions (kg CO2e/yr)
    	//Natural gas is roughly 6.6 kg CO2e/therm or 0.22 kg
    	
    	fFt= (int) (fo*11.6); // (litres/yr) * EF (kg CO2e/litre) = emissions (kg CO2e/yr)
    	//oil is around 11.6 kg CO2e/US gallon
    
    	wuF=(int) ((wa*1.0)* 52); // (kg/week) * 52 * EF (kg CO2e/kg) = emissions (kg CO2e/yr)
    	//made up number as it's unclear to me this moment    	
    	waFt= (int)((wat*8.0)* 365); //(litres/day) * 365 * EF (kg CO2e/kWh) = emissions (kg CO2e/yr)
    	//made up number as it's unclear to me this moment
    	
    	ultFT=ngFt+fFt+wuF+waFt; // formula for array
    	
    	int[][] twoDeArr = new int[2][6]; //first spot is the use secone is the
    	System.out.println("Your carbon foot print is : " +ultFT);
    	
    	twoDeArr [0][0]=elec;
    	twoDeArr [0][1]=ng;
    	twoDeArr [0][2]=fo; // filling multidemednsial array
    	twoDeArr [0][3]=wa;
    	twoDeArr [0][4]=wat;
    	twoDeArr [0][5]=TEl;// total number of elelmens used is 5
    	
    	
    	twoDeArr [1][0]=elecFT;
    	twoDeArr [1][1]=ngFt;
    	twoDeArr [1][2]=fFt;
    	twoDeArr [1][3]=wuF;
    	twoDeArr [1][4]=waFt;
    	twoDeArr [1][5]=ultFT; // total number of carbon footprint
    
    	System.out.print("The first row is the input"
				+ " the second row is the total , "
				+ "\nthe raw numbers are :\n");
    	
    	for (int i = 0; i < twoDeArr .length; i++) {
			for (int j = 0; j < twoDeArr [i].length; j++) { //makes for easie access
				System.out.print(twoDeArr [i][j] + " ");
			}
			System.out.println("");
		}
    	System.out.println("Please enter a for the company electric use a year");
    	System.out.println("Please enter b for the company natural gas use a year");
    	System.out.println("Please enter c for the company fuel oil  use a year");
    	System.out.println("Please enter d for the company waist used a week");
    	System.out.println("Please enter e for the company water use a yearr"); 
    	System.out.println("Please enter k for the company total factors");
     	System.out.println("Please enter f for the company electric footprint");
    	System.out.println("Please enter g for the company natural gas footprint");
    	System.out.println("Please enter h for the company fuel oil  footprint");
    	System.out.println("Please enter i for the company waist footprint");
    	System.out.println("Please enter j for the company water footprint");
    	System.out.println("Please enter l for the company total footprint");
    	
    	Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		
		switch(c) {
		case'a':
			System.out.println(twoDeArr[0][0]);
			break;
		case'b':
			System.out.println(twoDeArr[0][1]);
			break;
		case'c':
			System.out.println(twoDeArr[0][2]);
			break;
		case'd':
			System.out.println(twoDeArr[0][3]);
			break;
		case'e':
			System.out.println(twoDeArr[0][4]);
			break;
		case'f':
			System.out.println(twoDeArr[1][0]);
			break;
		case'g':
			System.out.println(twoDeArr[1][1]);
			break;
		case'h':
			System.out.println(twoDeArr[1][2]);
			break;
		case'i':
			System.out.println(twoDeArr[1][3]);
			break;
		case'j':
			System.out.println(twoDeArr[1][4]);
			break;
		case'k':
			System.out.println(twoDeArr[0][5]);
			break;
		case'l':
			System.out.println(twoDeArr[1][5]);
			break;
		
		
		}
    
    
    }
    
}
    	
    	
    	
    	
    	
    

