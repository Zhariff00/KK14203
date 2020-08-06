package clinicappointmentsystem;

public class Deletepatient extends mainInformation {
	
public static void displayArray2(int location,String[] name,String[] name1,int[] age,long[] hpnum,String[] city,String[] district,int[] days,int[]months,int[]years) {
		
		for(int counter =location;counter <no-1; counter++) {
			fnames[counter]=fnames[counter + 1];
			lnames[counter]=lnames[counter + 1];
			ages[counter]=ages[counter + 1];
			hpnums[counter]=hpnums[counter + 1];
			citys[counter]=citys[counter + 1];
			districts[counter]=districts[counter + 1];
			day[counter]=day[counter + 1];
			month[counter]=month[counter + 1];
			year[counter]=year[counter + 1];
		}
		System.out.println("\nValues in array after deleting the value from the location " + location +" are following");
		System.out.printf("%-16s %12s %20s %20s %20s %20s%n","Name","Age ","Hpnum ","City ","District ","Appointment Date");
		for(int counter=0;counter<no-1;counter++) {
			System.out.printf("%-16s %11s %20s %20s %20s %20s%n",(counter+1)+"."+" "+name[counter].toUpperCase()+ " " +lnames[counter].toUpperCase(),age[counter],"0"+hpnum[counter],city[counter].toUpperCase(),district[counter].toUpperCase(),day[counter]+"/"+month[counter]+"/"+year[counter]);
		}
}
	
}



