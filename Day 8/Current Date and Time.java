mport java.text.SimpleDateFormat;//specific date pattern
import java.util.Date;//specific point in time
public class Main
 
{
    public static void main(String[] args)  {
        
        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");// Format Date and Time
        Date date = new Date(); //current Date & Time
        System.out.println(sd.format(date));
    }
}
