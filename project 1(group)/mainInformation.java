package clinicappointmentsystem;

import java.util.Scanner;

public class mainInformation {
	 public static int no;
	 public static int number=0;
	 public static String[] fnames =new String[no+10];
	 public static String[] lnames =new String[no+10];
	 public static int[] ages = new int[no+10];
	 public static long[] hpnums = new long[no+10];
	 public static String[] citys =new String[no+10];
	 public static String[] districts =new String[no+10];
	 public static int[] day =new int[no+10];
	 public static int[] month =new int[no+10];
	 public static int[] year =new int[no+10];
	 
	 static Scanner scan=new Scanner(System.in);
		public static void main(String[] args) {
			mainInformation q=new mainInformation();
			q.printMessage();
			
			int location=0;
			System.out.println("How many patient you have to enter =");
			no=scan.nextInt();
			
			String fname=" ";
			String lname=" ";
			int age1=0;
			long hpnum1=0;
			String city1=" ";
			String district1=" ";
			int day1=0;
			int month1=0;
			int year1=0;
			
			for(int counter =0;counter <=no-1;counter++) {
				
				System.out.println("Enter the first name of patient " + (counter+1));
				fnames[counter]=scan.next();
				
				System.out.println("Enter the last name of patient " + (counter+1));
				lnames[counter]=scan.next();
				
				System.out.println("Enter the age of patient " + (counter+1));
				ages[counter]=scan.nextInt();
				
				System.out.println("Enter the hp num of patient " + (counter+1));
				hpnums[counter]=scan.nextInt();
				
				System.out.println("Enter the city of patient " + (counter+1));
				citys[counter]=scan.next();
				
				System.out.println("Enter the  district of patient " + (counter+1));
				districts[counter]=scan.next();
				
				System.out.println("Enter the  date(E.g 1-31): ");
				day[counter]=scan.nextInt();
				
				System.out.println("Enter the  month(E.g 1-12) :" );
				month[counter]=scan.nextInt();
				
				System.out.println("Enter the  year :");
				year[counter]=scan.nextInt();
			
			}
			Addpatient ap=new Addpatient();
			Deletepatient dp=new Deletepatient();
			SearchPatient sp =new SearchPatient();
			displayArray(fnames,ages,hpnums,citys,districts);
			q.printMessage1();
			number=scan.nextInt();
			
			if(number==1) {
			System.out.println("\nEnter the location from where you want to delete the value (index begin with 0) :");
			location=scan.nextInt();
		
			 dp.displayArray2(location,fnames,lnames,ages,hpnums,citys,districts,day,month,year);
			}
			else if(number==2) {
				
			System.out.println("\nEnter the location where you want to insert a new value (index begin with 0) :)");
			location=scan.nextInt();
			System.out.println("\n[Enter the new values u want to insert in array ] ");
			System.out.println("\nEnter the new first name to insert in array : ");
			fname=scan.next();
			System.out.println("\nEnter the new second name to insert in array : ");
			lname=scan.next();
			System.out.println("\nEnter the new age to insert in array : ");
			age1=scan.nextInt();
			System.out.println("\nEnter the new hpnum to insert in array : ");
			hpnum1=scan.nextLong();
			System.out.println("\nEnter the new city to insert in array : ");
			city1=scan.next();
			System.out.println("\nEnter the new district to insert in array : ");
			district1=scan.next();
			System.out.println("\nEnter the new date to insert in array : ");
			day1=scan.nextInt();
			System.out.println("\nEnter the new month to insert in array : ");
			month1=scan.nextInt();
			System.out.println("\nEnter the new year to insert in array : ");
			year1=scan.nextInt();
			
			
			
			ap.setArray(location,fnames,fname,lnames,lname,ages,age1,hpnums,hpnum1,citys,city1,districts,district1,day,day1,month,month1,year,year1);
			ap.getArray(fnames,lnames,ages,hpnums,citys,districts);
			}
			else if(number==3){
			
				System.out.println("Enter the name to be search:");
				String S=scan.next();
				sp.getData(S);
				
				Checkdate cd =new Checkdate();
				System.out.println("Check Whether the Appointment date is valid");
				System.out.println("Enter date");
				int d=scan.nextInt();
				
				System.out.println("Enter month");
				int m=scan.nextInt();
				
				System.out.println("Enter year");
				int y=scan.nextInt();
				
				
				cd.checkdate(d,m,y);
					
			}
			else if (number ==-1) {
				System.out.println("Exit Successfully!");
			}
			else
			{
				System.out.println("Error");
			}
			
			
			
	}
	 void printMessage() {
		System.out.println("**************************");
		System.out.println("*\tClinic\t\t *");
		System.out.println("*\tAppointment\t *");
		System.out.println("*\tSystem\t\t *");
		System.out.println("**************************");
	}
	 
	 void printMessage1() {
			System.out.println("Do you wish to continue?");
			System.out.println("Press 1 to delete data");
			System.out.println("Press 2 to insert new data");
			System.out.println("Press 3 to search data: ");
			System.out.println("Press -1 to exit");
		}
		
	
	public static void displayArray(String[] name,int[] age,long[] hpnum,String[] city,String[] district) {
		System.out.println("Your Patient record ");
		System.out.printf("%-16s %12s %20s %20s %20s %20s%n","Name","Age ","Hpnum ","City ","District ","Appointment Date");
		for(int counter=0;counter<=no-1;counter++) {
			
		System.out.printf("%-16s %11s %20s %20s %20s %20s%n",(counter+1)+"."+" "+name[counter].toUpperCase()+ " " +lnames[counter].toUpperCase(),age[counter],"0"+hpnum[counter],city[counter].toUpperCase(),district[counter].toUpperCase(),day[counter]+"/"+month[counter]+"/"+year[counter]);
			
		}	
	}
	
	
			
			
			
		}


