package Entidades;

import java.util.ArrayList;

public class Elevador {
	private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

	Televisor televisor = new Televisor();

	private int[] andares = { 0, 1, 2, 3, 4, 5, 6 };

	public void movimenta() {

		for (int i = 0; i < andares.length; i++) {
			televisor.setAndar(andares[i]);
			televisor.notificar();
			// PARADA
		}

	}

	public Televisor getTelevisor() {
		return televisor;
	}

	public void setTelevisor(Televisor televisor) {
		this.televisor = televisor;
	}

}
