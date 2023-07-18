package application;

import java.util.function.Predicate;

import entidade.Cliente;

public class Programa {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Jeferson", 1200.0, 2, false, true);

		Predicate<Cliente> regraSalario = cli -> cli.getSalario() > 2000.0;
		Predicate<Cliente> regraTempoEmprego = cli -> cli.getTempoEmpregado() > 0;
		Predicate<Cliente> regraPagamentoAtraso = cli -> !cli.isPagamentoAtraso();
		Predicate<Cliente> regraSpc = cli -> !cli.isRestricoesSpc();

		avaliar(cliente, regraSalario);
		avaliar(cliente, regraTempoEmprego);
		avaliar(cliente, regraPagamentoAtraso);
		avaliar(cliente, regraSpc);
	}

	public static void avaliar(Cliente cli, Predicate<Cliente> regra) {
		String resultado = regra.test(cli) ? "Aceito" : "Recusado";
		System.out.println("Resultado: " + resultado);
	}
}
