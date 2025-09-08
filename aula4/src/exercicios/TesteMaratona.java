package exercicios;

public class TesteMaratona {

	public static void main(String[] args) {
		AtletaAmador aa = new AtletaAmador("José", "Masculino", 17, 1.79, false);
		AtletaProfissional ap = new AtletaProfissional("Mauro", "Masculino", 17, 1.60, 60);
		AtletaProfissional ap1 = new AtletaProfissional("João", "Masculino", 17, 1.80, 62);

		System.out.println(aa + " " + aa.verificaSituacao());
		System.out.println(ap + " " + ap.verificaSituacao());
		System.out.println(ap1 + " " + ap1.verificaSituacao());
	}

}
