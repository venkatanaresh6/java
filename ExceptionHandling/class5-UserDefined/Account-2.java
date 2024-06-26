class InsuffientFundsException extends Exception{
    InsuffientFundsException(String msg){
        super(msg);
    }
}
class Account{
    public void withdrawl_Amount(int amount){
        int acc_Bal=1400;
        if (acc_Bal < amount) {
            throw new InsuffientFundsException("Low Balance");
        } else {
            System.out.println("Enjoy!");
        }
    }
    public static void main(String[] args) {
        Account a1=new Account();
        a1.withdrawl_Amount(22400);
    }
}