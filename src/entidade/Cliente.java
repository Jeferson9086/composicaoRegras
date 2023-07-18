package entidade;

public class Cliente {

	private String nome;
	private double salario;
	private int tempoEmpregado;
	private boolean restricoesSpc;
	private boolean pagamentoAtraso;

	public Cliente(String nome, double salario, int tempoEmpregado, boolean restricoesSpc, boolean pagamentoAtraso) {
		this.nome = nome;
		this.salario = salario;
		this.tempoEmpregado = tempoEmpregado;
		this.restricoesSpc = restricoesSpc;
		this.pagamentoAtraso = pagamentoAtraso;
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}

	public int getTempoEmpregado() {
		return tempoEmpregado;
	}

	public boolean isRestricoesSpc() {
		return restricoesSpc;
	}

	public boolean isPagamentoAtraso() {
		return pagamentoAtraso;
	}
}
