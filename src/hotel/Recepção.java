package hotel;

import java.util.ArrayList;

public class Recepção {
	
	private ArrayList<Estadia> estadias;
	
	public Recepção() {
		this.estadias = new ArrayList<estadias>();
		
	}
	
	public void checkIn(String nome, String tipo, int idade, int dias, double valor) {
		Estadia estadia = new Estadia(nome, tipo, idade, dias, valor);	
	}
	
	public void checkOut(String nome) {
		for (Estadia estadia : estadias) {
			if (estadia.getNome().equals(nome)) {
				estadias.remove(estadia);
				break;
			}
		}
	}
	
	public int getNumDeHospedes() {
		return estadias.size();
	}
	
	public double getLucroTotal() {
		double total = 0.0;
		for (Estadia estadia : estadias) {
			total +=  estadia.getValor();
		}
		return total;
	}
	
	public String toString() {
		String hospedados = "Estadias:" + System.lineSeparator();
		for (Estadias estadias : estadias) {
			hospedados += String.format("%s (%s): %d dias com o preço de R$ %.2f", 
					estadia.getNome(), estadia.getTipo(), estadia.getDias(), estadia.getValor()
					+ System.lineSeparator());
		}
	}
}
