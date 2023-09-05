import java.util.*; 
class Engine
{
int speed;
String model_name;
public void eng_Details(int e_speed,String m_name)
{
speed=e_speed; model_name=m_name;
System.out.println("Model name "+model_name+" Speed "+speed);
}
}
class Tyre extends Engine
{
int warranty;
String company_name;
public void tyre_Details(int t_warranty,String c_name)
{
warranty=t_warranty; 
company_name=c_name;
System.out.println("Company name " +company_name+ " warranty of tyre (in years)"+ warranty);
}
}
class Door extends Tyre
{
int door_no;
public void door_Details(int n_door)
{
door_no=n_door;
System.out.println("\n No of Doors "+door_no);
}
}
class Car1
{
public static void main(String[] args)
{
Engine e=new Engine();
Tyre t=new Tyre();
Door d=new Door();
e.eng_Details(220,"CLA 45 AMG");
t.tyre_Details(5,"MRF");
d.door_Details(2);
}
}
