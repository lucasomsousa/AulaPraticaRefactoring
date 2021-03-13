import java.util.Enumeration;

public abstract class Statement {
  public String value(Customer aCustomer) {
    Enumeration rentals = aCustomer.getRentals();
    String result = getRentalsTitle(aCustomer);

    while (rentals.hasMoreElements()) {
      Rental each = (Rental) rentals.nextElement();
      //show figures for each rental
      result += getRentalFigures(each);
    }
    //add footer lines
    result += getFooterLines(aCustomer);
    return result;
  }

  protected abstract String getRentalsTitle(Customer aCustomer);

  protected abstract String getRentalFigures(Rental each);

  protected abstract String getFooterLines(Customer aCustomer);
}