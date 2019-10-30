package kata4.main;

import java.util.List;
import kata4.view.HistogramDisplay;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

public class Main {
    
    public static void main(String[] args) {
        
        String fileName = new String("email.txt");
        List<Mail> mailList = MailListReader.read(fileName);            /* I */
                
        Histogram histogram = MailHistogramBuilder.build(mailList);     /* P */
               
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);/* O */
        histoDisplay.execute();                                         /* O */
        
    }
    
}