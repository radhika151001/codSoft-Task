package studdent_Grade_Calculator;

import java.util.Scanner;

public class gradecalculator {
	float sci, maths, eng, his, geo;
	Scanner s=new Scanner(System.in);
	//to get marks form the user
	public void getmarks() {
		System.out.println("----------------------STUDENT GRADE CALCULATOR----------------------");
		System.out.println("Enter marks of Science:  ");
		this.sci=s.nextFloat();
		if(sci>100) {
			System.out.println("Marks should be less than 100");
		    System.exit(0);
		}
		System.out.println("Enter marks of Maths:  ");
		this.maths=s.nextFloat();
		if(maths>100) {
			System.out.println("Marks should be less than 100");
		    System.exit(0);
		}
		System.out.println("Enter marks of English:  ");
		this.eng=s.nextFloat();
		if(eng>100) {
			System.out.println("Marks should be less than 100");
		    System.exit(0);
		}
		System.out.println("Enter marks of History:  ");
		this.his=s.nextFloat();
		if(his>100) {
			System.out.println("Marks should be less than 100");
		    System.exit(0);
		}
		System.out.println("Enter marks of Geography:  ");
		this.geo=s.nextFloat();
		if(geo>100) {
			System.out.println("Marks should be less than 100");
		    System.exit(0);
		}
		System.out.println("------------------------------------------------------------------------");
	}
	
	public void gradeCalculation() {
		float totalMarks=sci+maths+eng+his+geo;
		System.out.println("Total marks out of 500:  "+totalMarks+"\n");
		float avg=totalMarks/5;
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Total percentage:  "+avg+"%\n");
		System.out.println("------------------------------------------------------------------------");
		if(avg>90 && avg<=100) {
			System.out.println("A grade");
		}else if(avg>75 && avg<=89) {
			System.out.println("B grade");
		}else if(avg>50 && avg<=74) {
			System.out.println("C grade");
		}else if(avg>35 && avg<=49) {
			System.out.println("D grade");
		}else {
			System.out.println("F grade");
		}
		
	}
	
	public static void main(String[] args) {
		gradecalculator g=new gradecalculator();
		g.getmarks();
		g.gradeCalculation();
	}

}
