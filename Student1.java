//Assign and print the roll number, phone number and address of two students having names "Sam" and "John" respectively by creating two objects of class 'Student'.

public class Student1 { 
int roll_no;
String name;
String address;
int phone_no;
 public static void main(String[] args) {   Student1 s1=new Student1 ();
    s1.name ="john ";
    s1.roll_no =12;
    s1.phone_no=90875645;
    s1.address="Ram nagar,pune";
    Student1 s2 =new Student1 ();
    s2.name ="Sam";
    s2.roll_no =13;
    s2.phone_no=90498946;
    s2.address="Balaji nagar,latur";
 System .out. println ("name of 1st student is: "+s1.name +", and roll no is: "+s1.roll_no +" ,phone_no is:"+s1.phone_no +", address  is" +s1.address );
   System .out.println ("\nname of second student is: "+s2.name + " and roll no is: "+s2.roll_no +" phone_no is:" +s2.phone_no +", address is:" + s2.address );
     }
}