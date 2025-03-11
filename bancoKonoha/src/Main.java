//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();

        System.out.println("----------Conta Corrente----------");
        cc.depositar(200);
        cc.consultarSaldo();
        cc.depositar(200);
        cc.consultarSaldo();

        System.out.println("----------Conta Poupança----------");
        ContaPoupanca cp = new ContaPoupanca();
        cp.depositar(200);
        cp.consultarSaldo();
        cp.depositar(200);
        cp.consultarSaldo();
    }
}