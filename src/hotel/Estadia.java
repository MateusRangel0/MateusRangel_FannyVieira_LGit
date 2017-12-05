package hotel;

/**
 * Representação da estadia de um Animal no Pet Hotel
 * @author fannybv
 *
 */
public class Estadia {
	
	/**
	 * Animal que está hospedado
	 */
	private Animal animal;
	/**
	 * Valor do quarto
	 */
	private double valor;
	/**
	 * Quantidade de dias que o animal ficará hospedado
	 */
	private int dias;
	
	/**
	 * Construtor que inicializa todos os atributos do animal
	 * @param nome o nome do animal
	 * @param tipo Indica de que animal se trata ex.(cobra, cachorro)
	 * @param idade A idade do animal
	 * @param dias Quantidade de dias que o animal ficará hospedado
	 * @param valor Valor do quarto
	 */
	public Estadia(String nome, String tipo, int idade, int dias, double valor) {
		this.animal = new Animal(nome, tipo, idade);
		this.valor = valor;
		this.dias = dias;
	}
	
	public double getValor() {
		return valor;
	}

	public int getDias() {
		return dias;
	}
	
	public String getNome() {
		return animal.getNome();
	}

	public String getTipo() {
		return animal.getTipo();
	}

	public int getIdade() {
		return animal.getIdade();
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return this.getNome() + ", " + 
				this.getTipo()+ ", " +
				this.getDias()+ " dias com o preço de R$ " +this.getValor();
	}


	
	
	
	
	

}
