package Entidades;

import java.util.ArrayList;

public class NotificarNoticia {
	private int andar;
	private ArrayList<Televisor> televisor = new ArrayList<Televisor>();

	public void addTelevisor(Televisor televi) {
		televisor.add(televi);
		televi.addNotificador(this);
	}

	public void enviarNoticia() {
		if (andar == 2) {
			for (Televisor t : televisor) {
				t.noticica = "Economia";
			}
		} else if (andar == 4) {
			for (Televisor t : televisor) {
				t.noticica = "Violencia";
			}
		} else {
			if (andar == 2) {
				for (Televisor t : televisor) {
					t.noticica = "Futebol";
				}
			}
		}
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}

	public ArrayList<Televisor> getTelevisor() {
		return televisor;
	}

	public void setTelevisor(ArrayList<Televisor> televisor) {
		this.televisor = televisor;
	}

}
