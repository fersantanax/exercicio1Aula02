package entities;

import java.util.UUID;

public class Produto {

	private Integer idproduto;
	private String nome;
	private Integer quantidade;
	private String preco;

	public Integer getIdproduto() {
		return idproduto;
	}

	public void setIdproduto(Integer idproduto) {
		this.idproduto = idproduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer string) {
		this.quantidade = string;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String string) {
		this.preco = string;
	}

	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setCategoria(Categoria categoria) {
		// TODO Auto-generated method stub
		
	}

	public void setId(UUID randomUUID) {
		// TODO Auto-generated method stub
		
	}

	public void setQuantidade(String nextLine) {
		// TODO Auto-generated method stub
		
	}

}
