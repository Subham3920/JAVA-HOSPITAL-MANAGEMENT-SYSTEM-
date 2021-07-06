import java.util.Scanner;
import java.util.Random;

class Patient 
{  
	public String p_name;
	public int p_age; 
	public int p_id;
        Patient(String p_name,int p_age,int p_id) 
       { 
        	this.p_name=p_name; 
        	this.p_age=p_age; 
		this.p_id=p_id;
       } 
}

enum Docinfo
{
	Vasisth("Rs.500","Ortho"),
	Kabir("Rs.600","Surgeon"),
	Bedi("Rs.700","Vertinary"),
	Agrawal("Rs.800","Eyes"),
	Bansal("Rs.1000","Ear");

	private final String fee;
	private final String specs;
	
	private Docinfo(String fee,String specs) 
	{
		this.fee=fee;
		this.specs=specs;
	}
	
	public String getfee()
	{
		return this.fee;
	}
	public String getspecs()
	{
		return this.specs;
	}
}

public class Doctor
{
	public static void main(String args[])
	{
		int n=0;
		Doctor obj=new Doctor();
		Patient[] arr;
		arr=new Patient[20];
		Random rand =new Random();
		Scanner sc=new Scanner(System.in);
		String p_name;
		int p_age;
		int rand_int=rand.nextInt(1000);
		System.out.println("\n-----------------------Welcome to Health Care Application------------------------------\n\n");
		System.out.println("\nEnter the Patient Name: ");
		p_name=sc.nextLine();
   		System.out.println("\nEnter the Patient Age: ");
		p_age=sc.nextInt();
		System.out.println("\nThe Patient ID is: "+rand_int);
		n++;
		for(int i=0;i<n;i++)
		{
			 arr[i]=new Patient(p_name,p_age,rand_int);
		}
		System.out.println("\n\nAvailable Doctors are: \n");	
		Docinfo[] doctors= Docinfo.values();
		for(Docinfo doctor: doctors)
		{
			System.out.println("\t\t"+doctor.name()+"\t\t"+doctor.getfee()+"\t\t"+doctor.getspecs()+"\n");
		}
		System.out.println("\n\nSelect the Doctor from the above(1-5): ");
		int ch;
		ch=sc.nextInt();
		System.out.println("\n\n*****************Appointment Slip*********************\n");
		switch(ch)
		{
			case 1:
				System.out.println("\nPatient Name: "+p_name);
				System.out.println("\nPatient Age: "+p_age);
				System.out.println("\nPatient ID: "+rand_int);
				System.out.println("\nDoctor Name: Dr.Vasisth ");
				System.out.println("\nDoctor Fees: Rs.500 ");
				System.out.println("\nDoctor Speciality: Ortho ");
				System.out.println("\n\n----------------Thank You for Visiting!!!!!!!----------------");
				break;
			case 2:
				System.out.println("\nPatient Name: "+p_name);
				System.out.println("\nPatient Age: "+p_age);
				System.out.println("\nPatient ID: "+rand_int);
				System.out.println("\nDoctor Name: Dr.Kabir ");
				System.out.println("\nDoctor Fees: Rs.600 ");
				System.out.println("\nDoctor Speciality: Surgeon ");
				System.out.println("\n\n----------------Thank You for Visiting!!!!!!!----------------");
				break;
			case 3:
				System.out.println("\nPatient Name: "+p_name);
				System.out.println("\nPatient Age: "+p_age);
				System.out.println("\nPatient ID: "+rand_int);
				System.out.println("\nDoctor Name: Dr.Bedi ");
				System.out.println("\nDoctor Fees: Rs.700");
				System.out.println("\nDoctor Speciality: Vertinary ");	
				System.out.println("\n\n----------------Thank You for Visiting!!!!!!!----------------");
				break;
			case 4:
				System.out.println("\nPatient Name: "+p_name);
				System.out.println("\nPatient Age: "+p_age);
				System.out.println("\nPatient ID: "+rand_int);
				System.out.println("\nDoctor Name: Dr.Agrawal ");
				System.out.println("\nDoctor Fees: Rs.800 ");
				System.out.println("\nDoctor Speciality: Eyes ");
				System.out.println("\n\n----------------Thank You for Visiting!!!!!!!----------------");
				break;
			case 5:
				System.out.println("\nPatient Name: "+p_name);
				System.out.println("\nPatient Age: "+p_age);
				System.out.println("\nPatient ID: "+rand_int);
				System.out.println("\nDoctor Name: Dr.Bansal ");
				System.out.println("\nDoctor Fees: Rs.1000 ");
				System.out.println("\nDoctor Speciality: Ear ");
				System.out.println("\n\n**********************************************************");
				break;
			default:
				System.out.println("\n\nPlease Choose from (1-5) only");		
		}
		System.out.println("\n\nThe Patient Details are: ");
		obj.Function(n,p_name,p_age,rand_int);
		System.out.println("\n\n----------------Thank You for Visiting!!!!!!!----------------");
	}
	void Function(int n,String name,int age,int id)
	{
		for (int i=0;i<n;i++)
		{
			System.out.println("\nPatient No.: "+(i+1)+"\nPatient Name: "+name+"\nPatient Age: "+age+"\nPatient ID: "+id);
                 } 
	}
}