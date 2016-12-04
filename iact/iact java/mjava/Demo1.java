import java.util.Scanner;
class Student
{
private int eno,fee;
private String sname,course;
public void getEnrol()
{
Scanner s1=new Scanner(System.in);
System.out.println("Enter enrollment no");
eno=s1.nextInt();
System.out.println("Enter studnet name");
sname=s1.next();

System.out.println("Enter course name");
course=s1.next();

System.out.println("Enter studnet  fee");
fee=s1.nextInt();
}
public void showData()
{
System.out.println("Enrollment no is\t\t"+eno);
System.out.println("Student Name is\t\t"+sname);
System.out.println("Course Name is\t\t"+course);
System.out.println("Student Fee is\t\t"+fee);
}}

class Demo1
{public static void main(String ar[])
{Student s1=new Student();
Student s2=new Student();
s1.getEnrol();
s2.getEnrol();
s1.showData();
s2.showData();
if(s1==s2)//will compare reference 
System.out.println("equals");
else
System.out.println("not equals");
new Student().showData();//is also possible
}}

