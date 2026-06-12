import java.util.*;
class Student
{
	private int studentId;
	private String studentName;
	private int englishMarks;
	private int marathiMarks;
	private int mathsMarks;
	private int scienceMarks;
	private int socialMarks;
	
	Student(int studentId,String studentName,int englishMarks,int marathiMarks,int mathsMarks,int scienceMarks,int socialMarks)
	{
		this.studentId = studentId;
		this.studentName = studentName;
		this.englishMarks = englishMarks;
		this.marathiMarks = marathiMarks;
		this.mathsMarks = mathsMarks;
		this.scienceMarks = scienceMarks;
		this.socialMarks = socialMarks;
	}
	
	public void setstudentId(int studentId)
	{
		this.studentId=studentId;
	}
	public int getstudentId()
	{
		return studentId;
	}
	
	public void setstudentName(String studentName)
	{
		this.studentName=studentName;
	}
	public String getstudentName()
	{
		return studentName;
	}
	
	public void setenglishMarks(int englishMarks)
	{
		this.englishMarks=englishMarks;
	}
	public int getenglishMarks()
	{
		return englishMarks;
	}
	
	public void setmarathiMarks(int marathiMarks)
	{
		this.marathiMarks=marathiMarks;
	}
	public int getmarathiMarks()
	{
		return marathiMarks;
	}
	
	public void setmathsMarks(int mathsMarks)
	{
		this.mathsMarks=mathsMarks;
	}
	public int getmathsMarks()
	{
		return mathsMarks;
	}
	
	public void setscienceMarks(int scienceMarks)
	{
		this.scienceMarks=scienceMarks;
	}
	public int getscienceMarks()
	{
		return scienceMarks;
	}
	
	public void setsocialMarks(int socialMarks)
	{
		this.socialMarks=socialMarks;
	}
	public int getsocialMarks()
	{
		return socialMarks;
	}
	
	public String toString()
	{
		return " { NAME:"+ studentName + 
		", ID:" + studentId +
		", English:" + englishMarks +
		", Marathi:" + marathiMarks +
		", Maths:" + mathsMarks +
		", Science:" + scienceMarks +
		", Social:" +socialMarks + "}";
	}
	
	public int calculateTotal()
	{
		return englishMarks+mathsMarks+mathsMarks+scienceMarks+socialMarks;
	}
	
	public float calculatePercentage()
	{
		int total = calculateTotal();
		return (total/500)*100;
	}
}

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		ArrayList<Student> students = new ArrayList<>();
		
		while(true)
		{
			System.out.println("Student Result Processor");
			System.out.println("1.Add Student with Marks:");
			System.out.println("2.Display All Students:");
			System.out.println("3.Total Marks:");
			System.out.println("4.Percentage:");
			System.out.println("0. Exit from Application");
			
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.println("Enter Student Id:");
					int studentId = sc.nextInt();
					sc.nextLine();
					if(studentId < 0)
					{
						System.out.println("Invalid Id");
						break;
					}
						
					
					System.out.println("Enter Student Name:");
					String studentName = sc.nextLine();
					
					System.out.println("Enter English Marks:");
					int englishMarks = sc.nextInt();
					
					System.out.println("Enter Marathi Marks:");
					int marathiMarks = sc.nextInt();
					
					System.out.println("Enter Maths Marks:");
					int mathsMarks = sc.nextInt();
					
					System.out.println("Enter Science Marks:");
					int scienceMarks = sc.nextInt();
					
					System.out.println("Enter Social Marks:");
					int socialMarks = sc.nextInt();
					
					Student s1 = new Student(studentId, studentName, englishMarks, marathiMarks, mathsMarks, scienceMarks, socialMarks);
					
					students.add(s1);
					break;
				
				case 2:
					if(students.isEmpty())
					{
						System.out.println("No Students");
					}
					else
					{
						for(Student s2 : students)
						{
							System.out.println(s2);
						}
					}
					break;
					
				case 3:
					System.out.println("Enter Id to get Total marks of a Student:");
					studentId = sc.nextInt();
					if(studentId > 0 )
					{
						for(Student s3: students)
						{
							if( studentId == s3.getstudentId())
							{
								System.out.println("Total Marks:"+s3.calculateTotal());
								break;
							}
							else{
								System.out.println("Student not Found");
							}
						}
					}
					else
					{
						System.out.println("Enter Valid Id");
					}
					break;
					
				case 4:
					System.out.println("Enter Id to get Percentage of student:");
					studentId = sc.nextInt();
					if(studentId>0)
					{
						for(Student s4: students)
						{
							if(studentId == s4.getstudentId())
							{
								System.out.println("Percentage:" +s4.calculatePercentage());
								break;
							}
							else
							{
								System.out.println("Student not Found");
							}
						}
					}
					else 
					{
						System.out.println("Enter Valid ID");
					}
					break;
					
				case 0:
					System.out.println("Exited");
					return;
			}
		}
	}
}
	