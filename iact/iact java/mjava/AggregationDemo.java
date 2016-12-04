class Address
{
String city,state,pincode;
public Address(String city,String state,String pincode)
{
this.city=city;
this.state=state;
this.pincode=pincode;
}}

class Student
{private int eno,fee;
private String course,sname;
Address address;
public Student(int eno,String sname,String course,int fee,Address address)
{
this.eno=eno;
this.sname=sname;
this.course=course;
this.fee=fee;
this.address=address;
}
public void showData()
{
System.out.println("Enrollment no is\t"+eno);
System.out.println("Student Name  is\t"+sname);
System.out.println("Course Name is\t"+course);
System.out.println("Course fee is\t"+fee);
System.out.println("Student Address is");
System.out.println("City  is\t"+address.city);
System.out.println("State is\t"+address.state);
System.out.println("Pincode is\t"+address.pincode);
}}
class AggregationDemo
{public static void main(String ar[])
{
Address a1=new Address("mzn","u.p.","251001");
Student s1=new Student(1,"ABC","JAVA",4000,a1);
s1.showData();
}}