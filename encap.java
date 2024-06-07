class Bank1 {
    private int balance;

    public void setBal(int amt){
        if(amt>0){
            balance = amt;
        } else {
            System.out.println("Account should not consistes of negative balance");
            System.exit(0);
        }
    }

    public int getBal(){
        return balance;
    }
}



public class encap {
    public static void main(String[] args) {
        Bank1 bank = new Bank1();
        bank.setBal(-15000);
        System.out.println(bank.getBal());
       
    }
}
