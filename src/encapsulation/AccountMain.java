package encapsulation;

public class AccountMain {
    public static void main(String[] args) {
        Account ac=new Account();
        ac.setAccno(101);
        ac.setName("Suresh");
        ac.setAmount(123456);
        System.out.println(ac.getAccno());
        System.out.println(ac.getAmount());
        System.out.println(ac.getName());

    }
}
