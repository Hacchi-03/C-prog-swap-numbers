import java.util.scanner;
import java.io.*;
class time
{
public static void main(string args[])
{
Scanner Sc=new Scanner(system.in);
system.out.println("Enter No Of minutes:");
int minutes=int nextint();
int years=minutes/525600;
int days=mintues/1440;
system.out.println(minutes+"minutes is approximately"+years+"years"+days+"days");
}
}

