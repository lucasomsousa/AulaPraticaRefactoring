import java.util.Enumeration;

public class HtmlStatement extends Statement {
   
   protected String getRentalsTitle(Customer aCustomer){
     return "<H1>Rentals for <EM>" + aCustomer.getName() +
      "</EM></H1><P>\n";
   }

   protected String getRentalFigures(Rental each){
     return each.getMovie().getTitle() + ": " +
         String.valueOf(each.getCharge()) + "<BR>\n";
   }

   protected String getFooterLines(Customer aCustomer){
     return "<P>You owe <EM>" +
      String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n" + 
      "On this rental you earned <EM>" + 
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      "</EM> frequent renter points<P>";
   }
}