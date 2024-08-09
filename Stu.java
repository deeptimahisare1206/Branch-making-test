import java.util.*;
class Student 
{
   private String name;
   private int age;
   private int rollno;
	
	public Student(String name , int age,int rollno){
	 this.name = name;
	 this.age = age;
	 this.rollno=rollno;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public int getRollno()
	{
		return rollno;
	}
}
class Stu{
    public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		int age=sc.nextInt();
	        int rollno=sc.nextInt();
		
	Student st=new Student(name ,age);
	
	System.out.println(st.getName());
	System.out.println(st.getAge());
	System.out.println(st.getAge());
	}
}
