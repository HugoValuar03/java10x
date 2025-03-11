public class ContaCorrente extends ContaBancaria{

    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo atual na conta corrente é de: R$" + getSaldo());
    }

    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
    }
}
