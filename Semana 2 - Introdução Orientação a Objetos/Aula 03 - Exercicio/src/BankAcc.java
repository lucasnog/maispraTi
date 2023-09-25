public class BankAcc {

    private Integer accNumber;
    private String holder;
    private double balance = 0;
    public double amountD;
    public double amountW;


    public Integer getAccNumber() {
        return accNumber;
    }

    public String getholder() {
        return holder;
    }

    public double getBalance() {
        return balance;

    }

    public void deposit (double amountD){

        balance += amountD;
        System.out.println(amountD + " Reais depositado com sucesso");
        System.out.println("O novo saldo é: " + this.getBalance() + " reais");
    }
    public void withdraw (double amountW){
        if(amountW > balance) {
            System.out.println("Saldo insuficiente.");
        }else {
            balance -= amountW;
            System.out.println("Retirado com sucesso.");
            System.out.println("O novo saldo é: " + this.getBalance() + " reais");
        }
    }



}