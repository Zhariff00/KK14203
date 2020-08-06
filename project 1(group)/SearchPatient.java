package clinicappointmentsystem;

public class SearchPatient extends mainInformation{
	

	 static void getData(String S) {
		boolean flag=false;
		for(int counter=0;counter<=no-1;counter++) {
			if(fnames[counter].equalsIgnoreCase(S)) {
				System.out.println("Exist in database!");
				
				flag=true;
				break;
				
			}
		}
		if(flag==false)
			System.out.println("Element Not Found");
	}

}
