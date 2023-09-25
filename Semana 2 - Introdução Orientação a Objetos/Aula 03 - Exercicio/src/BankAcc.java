public class BankAcc {

    private Integer accNumber;
    private Integer holder;
    private Integer balance = 0;
    public Integer amountD;
    public Integer amountW;


    public Integer getAccNumber() {
        return accNumber;
    }

    public Integer getholder() {
        return holder;
    }

    public Integer getBalance() {
        return balance;

    }

    public void deposit (Integer amountD){

        balance += amountD;
        System.out.println(amountD + " Reais depositado com sucesso");
        System.out.println("O novo saldo é: " + this.getBalance() + " reais");
    }
    public void withdraw (Integer amountW){
        if(amountW > balance) {
            System.out.println("Saldo insuficiente.");
        }else {
            balance -= amountW;
            System.out.println("Retirado com sucesso.");
            System.out.println("O novo saldo é: " + this.getBalance() + " reais");
        }
    }



}