package Java;

public class Paypal extends Payment {
  public String email;

  public Paypal(Integer id, String email) {
    super(id);
    this.email = email;
  }
}