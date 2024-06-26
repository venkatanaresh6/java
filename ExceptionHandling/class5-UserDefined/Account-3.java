class InsuffientFundsException extends Exception{
    InsuffientFundsException(String msg){
        super(msg);
    }
}
class Account{
    public void withdrawl_Amount(int amount) throws InsuffientFundsException{
        int acc_Bal=1400;
        if (acc_Bal < amount) {
            try{
                throw new InsuffientFundsException("Low Balance");
            }
            catch(InsuffientFundsException ie){
                System.out.println(ie.getMessage());
            }
            
        } else {
            System.out.println("Enjoy!");
        }
    }
    public static void main(String[] args) throws InsuffientFundsException {
        Account a1=new Account();
        a1.withdrawl_Amount(22400);
    }
}