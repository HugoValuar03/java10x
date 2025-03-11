public abstract class ContaBancaria implements Conta {

    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria() {
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Saldo : " + saldo;
    }
}
