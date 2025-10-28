import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

    public Banco(){
		contas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(Conta conta) {
		contas.add(conta);
	}

	public void ListarContas(){
		
		//List<Conta> contas = this.getContas();
		String linha;

		if (contas == null && contas.isEmpty()){
			System.out.println("NENHUMA CONTA CADASTRADA");
		}

		for (int i = 0; i < contas.size(); i++)
		{
		    linha = "Agencia: " + contas.get(i).getAgencia() + " | Numero: " + contas.get(i).getNumero() +" | Nome: " + contas.get(i).getNome() + " | Saldo: "+ contas.get(i).getSaldo();
			System.out.println(linha);
		}
	}
}
