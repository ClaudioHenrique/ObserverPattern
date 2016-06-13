package Pattern;

import java.util.ArrayList;

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
	}
	
	
	
	@Override
	public void addUsuario(Usuario user) {
		// TODO Auto-generated method stub
	}

}
