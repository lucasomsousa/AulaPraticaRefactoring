import java.util.Enumeration;

public class TextStatement extends Statement {
  public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = getRentalsTitle(aCustomer);

      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for this rental
         result += getRentalFigures(each);
      }
      //add footer lines
      result += getFooterLines(aCustomer);
      return result;
   }

   private String getRentalsTitle(Customer aCustomer){
     return "Rental Record for " + aCustomer.getName() +
      "\n";
   }

   private String getRentalFigures(Rental each){
     return "\t" + each.getMovie().getTitle()+ "\t" +
         String.valueOf(each.getCharge()) + "\n";
   }

   private String getFooterLines(Customer aCustomer){
     return "Amount owed is " +
      String.valueOf(aCustomer.getTotalCharge()) + "\n" + 
      "You earned " +
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      " frequent renter points";
   }
}