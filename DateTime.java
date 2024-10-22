import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {
    public static void main(String[] args) {
        Date da = new Date();

        SimpleDateFormat form = new SimpleDateFormat("dd/mm/yyyy hh-mm-ss");

        
        System.out.println(form.format(da));


    }
}
