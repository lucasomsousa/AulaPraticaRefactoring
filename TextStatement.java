import java.util.Enumeration;

public class TextStatement extends Statement {
  
   protected String getRentalsTitle(Customer aCustomer){
     return "Rental Record for " + aCustomer.getName() +
      "\n";
   }

   protected String getRentalFigures(Rental each){
     return "\t" + each.getMovie().getTitle()+ "\t" +
         String.valueOf(each.getCharge()) + "\n";
   }

   protected String getFooterLines(Customer aCustomer){
     return "Amount owed is " +
      String.valueOf(aCustomer.getTotalCharge()) + "\n" + 
      "You earned " +
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      " frequent renter points";
   }
}