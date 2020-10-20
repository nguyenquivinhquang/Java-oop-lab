public class Account {
    private int accNo;
    private double accBal;

    public Account(int accNo) {
        this.accNo = accNo;
    }

    public Account(int accNo, double accBal) {
        this.accNo = accNo;
        this.accBal = accBal;
    }

    public int getaccNo() {
        return accNo;
    }

    public double getaccBal() {
        return accBal;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public void setAccBal(double accBal) {
        this.accBal = accBal;
    }

    public void deposit(double amount) {

    }

    public void withdraw(double amount) {
        this.accBal -= amount;
    }

    public String toString() {

        return Integer.toString(accNo) + " " + Double.toString(accBal);
    }

    public final void print() {

    }
}

class SavingAccount extends Account {

    public int hihi;
    private int day;
    private double percentage = 1 / 100;

    public SavingAccount(int accNo, int day) {
        super(accNo);
        this.day = day;

    }

    public void addsInterest() {
        double curMoney = super.getaccBal();
        curMoney = curMoney + percentage * curMoney * day;
        super.setAccBal(curMoney);

    }

}

class CheckingAccount extends Account {
    public double debt;

    public CheckingAccount(int accNo) {
        super(accNo);
    }

    public void overdraftLimit(int amount) {
        this.debt += amount;
    }

    public void withdraw(double amount) {
        this.debt -= amount;
        if (debt < 0) {
            super.setAccBal(super.getaccBal() + debt);
        }
    }
}