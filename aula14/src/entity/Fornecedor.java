package entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * Classe utiliza para identificar um fornecedor
 * @author Roni Schanuel
 * @since 22-09-2025
 */

public class Fornecedor implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * identificador único da classe 
	 */
	private Integer codigo;
	/**
	 * identificador único da empresa na receita federal
	 */
	private String cnpj;
	private String razaoSocial;
	private Boolean ativa;
	private Double faturamento;

	/**
	 * Construtor com atributos principais
	 * @param cnpj
	 * @param razaoSocial
	 */
	public Fornecedor(String cnpj, String razaoSocial) {
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}

	public Boolean getAtiva() {
		return ativa;
	}


	public void setAtiva(Boolean ativa) {
		this.ativa = ativa;
	}


	
	public Double getFaturamento() {
		return faturamento;
	}




	public void setFaturamento(Double faturamento) {
		this.faturamento = faturamento;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Fornecedor [cnpj=" + cnpj + ", razaoSocial=" + razaoSocial + "]";
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cnpj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fornecedor other = (Fornecedor) obj;
		return Objects.equals(cnpj, other.cnpj);
	}
	
	/**
	 * Método para calcular pagamento de fornecedores
	 * @author João
	 * @return Double
	 * @throws IllegalArgumentException
	 */
	public Double calcularPagamento() throws IllegalArgumentException{
		return 0.0;
	}
	
}