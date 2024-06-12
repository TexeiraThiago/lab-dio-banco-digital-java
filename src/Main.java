import Models.Cliente;
import Models.Conta;
import Models.Corrente;
import Models.Poupanca;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nome = "Clinte";
        Conta cc = new Corrente(cliente);
        cc.depositar(100);
        Conta cp = new Poupanca(cliente);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}