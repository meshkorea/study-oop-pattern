public class BankAccountFacade {

    private int accountNumber;
    private int securityCode;

    AccountNumberCheck acctChecker;
    FundsCheck fundChecker;

    public BankAccountFacade(int newAcctNum, int newSecCode){
        this.accountNumber = newAcctNum;
        this.securityCode = newSecCode;

        acctChecker = new AccountNumberCheck();
        codeChecker = new SecurityCodeCheck();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void withdrawCash(double cashToGet) {
        if (acctChecker.accountActive(getAccountNumber()) && fundChecker.haveEnoughMoney(cashToGet)) {
            System.out.println("Transaction Complete\n");
        } else {
            System.out.println("Transaction Failed\n");
        }
    }

    public void depositCash(double cashToDeposit) {
        if(acctChecker.accountActive(getAccountNumber())) {
            fundChecker.makeDeposit(cashToDeposit);
            System.out.println("Transaction Complete\n");
        } else {
            System.out.println("Transaction Failed\n");
        }
    }
}