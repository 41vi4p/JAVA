import java.util.*;

class Time
{
    int hr,mi,sec;
    void gettime()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the time in hours, minutes and seconds:");
        hr=s.nextInt();
        mi=s.nextInt();
        sec=s.nextInt();
    }
    void display()
    {
        System.out.println("Time is: "+hr+":"+mi+":"+sec);
    }
    void addTime(Time t1,Time t2)
    {
        sec=t1.sec+t2.sec;
        mi=t1.mi+t2.mi+(sec/60);
        sec=sec%60;
        hr=t1.hr+t2.hr+(mi/60);
        mi=mi%60;
        if(hr>24)
        {
            hr=hr%24;
        }
        
    }
}

public class practice6 {
    public static void main(String[] args) {
        
    Time t1=new Time();
    Time t2=new Time();
    System.out.println("Enter the first time:");
    t1.gettime();
    System.out.println("Enter the second time:");
    t2.gettime();
    Time t3=new Time();
    t3.addTime(t1,t2);
    t3.display();
}
}