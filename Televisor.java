package Entidades;

import java.util.ArrayList;

public class Televisor {
	public String noticica;

	private ArrayList<NotificarNoticia> notificadores = new ArrayList<NotificarNoticia>();

	private int andar;

	public void addNotificador(NotificarNoticia n) {
		notificadores.add(n);
	}

	public void notificar() {
		for (NotificarNoticia n : notificadores) {
			n.setAndar(andar);

		}
	}

	public ArrayList<NotificarNoticia> getNotificadores() {
		return notificadores;
	}

	public void setNotificadores(ArrayList<NotificarNoticia> notificadores) {
		this.notificadores = notificadores;
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}

}
