package Java;

import java.time.YearMonth;

public class Card extends Payment {
  public String number;
  public String cvv;
  public YearMonth date;

  public Card(Integer id, String number, String cvv, YearMonth date) {
    super(id);
    this.number = number;
    this.cvv = cvv;
    this.date = date;
  }
}
