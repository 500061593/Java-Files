package jvlabexp1;
class upper
{
void display()
{ System.out.println("upper class");
}
}
 
class middle extends upper
{
void display()
{ System.out.println("middle class");
}
}
 
class lower extends upper
{
void display()
{ System.out.println("lower class");
}
}
 
public class main
{ public static void main(String args[])
{ upper u;
u=new middle();
u.display();
u=new lower();
u.display();
}
}