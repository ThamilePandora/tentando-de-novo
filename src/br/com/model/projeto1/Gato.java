package br.com.model.projeto1;

import java.util.Objects;

public class Gato {

		private Integer idade;
		private String nome;
		private String cor;

		/*public Gato(Integer idade, String nome, String cor) {
			this.idade = idade;
			this.nome = nome;
			this.cor = cor;
		}*/

		public Integer getIdade() {
			return idade;
		}

		public void setIdade(Integer idade) {
			this.idade = idade;
		}

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

		@Override
		public String toString() {
			return "Gato [idade=" + idade + ", nome=" + nome + ", cor=" + cor + "]";
		}		
}
