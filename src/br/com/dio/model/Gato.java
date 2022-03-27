package br.com.dio.model;

import java.util.Objects;

public class Gato {
	
	private String nome;
	private String cor;
	private Integer idade;
	
	/*Construtor vazio
	 *Atalho Ctrl+3 e pesquisar constru
	 *Clique na opção: Generate Constructor using Fields
	 *Deixe todas as opções desmarcadas.
	 */
	public Gato() {
		// Crtl+D apaga uma linha inteira.
	}
	
	/*Construtores
	 *Atalho Ctrl+3 e pesquisar constru
	 *Clique na opção: Generate Constructor using Fields
	 *Deixe todas as opções marcadas.
	 */
	
	public Gato(String nome, String cor, Integer idade) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}

	/*Getters and Setters
	 *Atalho Ctrl+3 e pesquisar Getters
	 *Clique na opção: Generate Getters and Setters methords for type's field
	 *Deixe todas as opções marcadas.
	 * */
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	/*hashCode and equals
	 *Atalho Ctrl+3 e pesquisar hashCode
	 *Clique na opção: Generate hashCode() and equals() methords for type's field
	 *Deixe todas as opções marcadas.
	 * */

	@Override
	public int hashCode() {
		return Objects.hash(cor, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}

	/*toString
	 *Atalho Ctrl+3 e pesquisar toString
	 *Clique na opção: Generate the to toString methords for type's field
	 *Deixe apenas a field marcada
	 * */
	
	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
	}/**/
	
	
	
	//Mudar um bloco de lugar segure Alt e clique nas setas pra cima ou pra baixo
	//Pra indentar o codigo Ctrl+Shift+F
	
	
	
	
}
