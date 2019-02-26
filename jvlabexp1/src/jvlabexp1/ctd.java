package jvlabexp1;

class mainthread extends Thread{
public void run(){
for(int i=0;i<10;i++){
System.out.println(Thread.currentThread().getId()+" value "+i);
}
}
}
public class ctd{
public static void main(String args[]){
mainthread ob=new mainthread();
ob.start();
mainthread obj=new mainthread();
obj.start();
mainthread ob1=new mainthread();
ob1.start();
}
}
