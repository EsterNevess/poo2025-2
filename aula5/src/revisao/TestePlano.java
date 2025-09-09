package revisao;

public class TestePlano {

	public static void main(String[] args) {
		Clinica clinica = new Clinica("Amil", 80, 5, "Ckeckup", "123");
		Anestesista anestesista = new Anestesista("Amil", 80, 5, "José", 123, "Geral");
		Pediatra pediatra = new Pediatra("Amil", 80, 5, "Joaquim", 231, true);
		ControlePgto pgto = new ControlePgto();

		System.out.println("Valor Pago Clínica:");
		pgto.calcularTotalPago(clinica);
		System.out.println("valor pago clínica"+ clinica.getValorPago());

		System.out.println("Valor Pago Anestesista:");
		pgto.calcularTotalPago(anestesista);
		System.out.println("valor pago Anestesista"+ anestesista.getValorPago());

		System.out.println("Valor Pago Pediatra:");
		System.out.println("valor pago "+ clinica.getValorPago());
		pgto.calcularTotalPago(pediatra);
		

		System.out.println(clinica.toString());
		System.out.println(anestesista.toString());
		System.out.println(pediatra.toString());
		System.out.println("Total Geral Pago pela Amil:" + String.format("%.2f", pgto.getTotalPago()));

	}

}