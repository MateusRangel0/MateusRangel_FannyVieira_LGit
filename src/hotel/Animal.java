package hotel;

/**
 * Representação de um animal.
 * @author fannybv
 *
 */
public class Animal {

	/**
	 * Nome do animal
	 */
	private String nome;
	/**
	 * Indica de que animal se trata ex.(cobra, cachorro)
	 */
	private String tipo;
	/**
	 * A idade do animal
	 */
	private int idade;
	
	
	/**
	 * Construtor que inicializa todos os atributos da classe
	 * @param nome o nome do animal
	 * @param tipo o tipo do animal ex.cachorro, cobra
	 * @param idade a idade do animal
	 */
	public Animal(String nome, String tipo, int idade) {
		this.idade = idade;
		this.nome = nome;
		this.tipo = tipo;
	}
	
	public String getNome() {
		return nome;
	}

	public String getTipo() {
		return tipo;
	}

	public int getIdade() {
		return idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}
	
	
}
