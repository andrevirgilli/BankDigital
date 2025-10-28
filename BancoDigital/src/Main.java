
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
        
		Cliente andre = new Cliente();
		andre.setNome("Andre");
		Conta cc2 = new ContaCorrente(andre);

		Banco banco = new Banco();
		banco.setContas(cc);
		banco.setContas(poupanca);
		banco.setContas(cc2);

		cc.depositar(100);
		cc.transferir(100, poupanca);

		banco.ListarContas();
	}

}
