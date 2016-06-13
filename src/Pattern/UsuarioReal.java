package Pattern;

import Interface.Alerta;
import Interface.Usuario;

public class UsuarioReal implements Usuario{

	private AlertaReal observer;
	
	public UsuarioReal(AlertaReal a){
		this.observer = a;
		this.observer.addUsuario(this);
	}
	
	@Override
	public void update(Alerta a) {
		if(a == this.observer){
			System.out.println("[AVISO] FOI ENVIADO UM ALERTA PARA TODOS OS USUARIO."
					+ " STATUS ATUAL:" + this.observer.getAlerta());
		}
	}

}
