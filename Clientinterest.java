package com.epam.Homeconstruct_Interest;
import java.util.Scanner;
import java.io.IOException;
public class Clientinterest {
	public static void main(String args[]) throws IOException {
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.write("Enter your choice\n1.Interest(Simple Interest/Compound Interest)\n2.Home Construction\n".getBytes());
	int choice1=sc.nextInt();
	if(choice1==1) {
	while(true){
	 System.out.write("Enter principal amount\n".getBytes());
	int pa=sc.nextInt();
	 System.out.write("Enter time period\n".getBytes());
	    int tp=sc.nextInt();
	 System.out.write("Enter rate of interest\n".getBytes());
    float ri=sc.nextFloat();
    System.out.write("Enter your choice\n1.Simple Interest\n2.Compound Interest\n".getBytes());
    int ch=sc.nextInt();
    Interest i=new Interest();
    float s=i.simpleinterest(pa,tp,ri);
    float c=i.compoundinterest(pa,tp,ri);
    String si=Float.toString(s);
    String ci=Float.toString(c);
    if(ch==1) {
    	System.out.write("Simple Interest:".getBytes());
    	System.out.write(si.getBytes());	
    }
    if(ch==2) {
    	System.out.write("Compound Interest:".getBytes());
    	System.out.write(ci.getBytes());	
    }
    System.out.write("\nIf you want to exit!Enter 0 Otherwise enter any number".getBytes());
	 int cho= sc.nextInt();	
	 if(cho==0) {
		    System.out.write("exit".getBytes());
			break;
		}
	}
	}
	if(choice1==2) {
	Home h=new Home();
	System.out.write("Enter area of a home".getBytes());
	int area=sc.nextInt();
	System.out.write("\nSelect a Material Standard:".getBytes());
	System.out.write("1.1200 INR--- Standard Materials\n2.1500 INR--- Above Standard Materials\n3.1800 INR--- High Standard Material\n4.2500 INR--- High Standard Material+Fully Automated Home".getBytes());
	int choice=sc.nextInt();
	int st=h.home_construct(1200,area);
	int abst=h.home_construct(1500,area);
	int hist=h.home_construct(1800,area);
    int	full=h.home_construct(2500,area);
    String standard=Float.toString(st);
    String above_standard=Float.toString(abst);
    String high_standard=Float.toString(hist);
    String full_automated=Float.toString(full);
	if(choice==1) {
		System.out.write("\nTotal Construction cost with Standard Materials is".getBytes());
	    System.out.write(standard.getBytes());
	}
	if(choice==2) {

		System.out.write("\nTotal Construction cost with above Standard Materials is".getBytes());
	    System.out.write(above_standard.getBytes());
	}
	if(choice==3) {

		System.out.write("\nTotal Construction cost with high Standard Materials is".getBytes());
	    System.out.write(high_standard.getBytes());
	}
	if(choice==4) {

		System.out.write("\nTotal Construction cost with fully automated home is".getBytes());
	    System.out.write(full_automated.getBytes());
	}
	
	
}
}
}
