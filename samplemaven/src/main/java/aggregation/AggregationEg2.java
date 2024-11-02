package aggregation;

public class AggregationEg2 {
int rollno;
String city;
AggregationEg1 ref;//aggregation
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AggregationEg1 obj= new AggregationEg1("Minu",29);//first class constructor invoke
		AggregationEg2 obj2=new AggregationEg2(12, "EKM",obj);//second class constructor invoke
		obj2.display();

	}
public AggregationEg2(int rollno, String city, AggregationEg1 ref) {
	this.rollno=rollno;
	this.city=city;
	this.ref=ref;
	
	
}
public void display() {
	System.out.println(ref.name+ ref.age);
	System.out.println(rollno +city );
}
}
