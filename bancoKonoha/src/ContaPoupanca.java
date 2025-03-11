public class ContaPoupanca extends ContaBancaria{
    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo atual na conta poupança é de: R$" + getSaldo());
    }

    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + (valor - (valor * 0.01)));
    }
}
