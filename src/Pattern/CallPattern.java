package Pattern;

public class CallPattern {
	public static void main(String args[]){
		//Inicio o alerta e os subscribes
		AlertaReal alerta = new AlertaReal();
		UsuarioReal u = new UsuarioReal(alerta);
		UsuarioReal r = new UsuarioReal(alerta);
		
		alerta.changeAlerta();
	}
}
