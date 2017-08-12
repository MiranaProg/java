import java.util.Scanner;
class Elevator
{
public int floor_num;


public void fireALarm()
{
System.out.println("Danger!!!");
System.out.println("going to the 1st floor >>>");
}

public void selectFloor()
{

if(floor_num > 100 )
{
System.out.println("floor " + floor_num + "not exist");
//selectFloor(); 
}
else
System.out.println("going to " +floor_num + "floor >>>");
}


}

public class ElevatorDriver
{

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
Elevator el=new Elevator();

System.out.println("Select Floor");
el.floor_num=sc.nextInt();
el.selectFloor();

while(sc.next().charAt(0) != 'd')
{
el.fireAlarm();

}


}
}
