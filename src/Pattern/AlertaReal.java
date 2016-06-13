package Pattern;

import java.util.ArrayList;
import java.util.Iterator;

import Interface.Alerta;
import Interface.Usuario;

public class AlertaReal implements Alerta {

	private Boolean alerta = false;
	private ArrayList observadores = new ArrayList();
	
	public void changeAlerta(){
		if(this.alerta)
			this.alerta = false;
		else
			this.alerta = true;
		//notifica o usuario
		this.notificar();
	}
	
	public Boolean getAlerta(){
		return this.alerta;
	}
	
	@Override
	public void addUsuario(Usuario user) {
		observadores.add(user);
	}
	
	public void delUsuario(Usuario user){
		observadores.remove(user);
	}
	
	private void notificar(){
		Iterator i = observadores.iterator();
		while(i.hasNext()){
			Usuario user = (Usuario) i.next();
			user.update(this);
		}
	}

}
