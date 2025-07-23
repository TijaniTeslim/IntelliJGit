public class BankAccount {
    private int acctnum;
    private int acctbal;
    private String acctName;
    private String email;
    private int phoneNumber;

    public BankAccount(int acctbal, String acctName, String email, int phoneNumber) {
        this.acctbal = acctbal;
        this.acctName = acctName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(int acctnum, int acctbal, String acctName, String email, int phoneNumber) {
        this.acctnum = acctnum;

    }


    public void withdrawFunds(int credit) {
        if (acctbal - credit < 0) this.acctbal = acctbal;
        acctbal -= credit;
        System.out.println("dear " + acctName + " ,your withrawal of $" + credit + " has been processed" +
                " \nyour current account balance is $" + acctbal);
    }
    public void depoFunds(int debit) {
        acctbal += debit;
        System.out.println("dear " + acctName + " ,your deposit of $" + debit + " has been processed\n" +
                ",your current account balance is $"+ acctbal);
    }

    public int getAcctnum() {
        return acctnum;
    }

    public void setAcctnum(int acctnum) {
        this.acctnum = acctnum;
    }

    public int getAcctbal() {
        return acctbal;
    }

    public void setAcctbal(int acctbal) {
        this.acctbal = acctbal;
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



}
