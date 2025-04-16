package encapsulation;
/*
  Encapsulation is a fundamental concept in object-oriented programming that involves bundling the
  data (variables) and the methods (functions) that operate on the data into a single unit, called a class.
  It also restricts direct access to some of the object's components,
  which is a means of preventing accidental interference and misuse of the data.

Key Points:
Private Variables: All variables should be private to restrict direct access.
Public Methods: Provide public getter and setter methods to access and update the value of private variables.
Controlled Access: Encapsulation allows controlled access to the data.

 */
public class Account {
  private int accno;
  private String name;
  private double amount;

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
