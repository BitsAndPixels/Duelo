package duelo;

public class Derringer extends Arma{
	
	
	public Derringer(){
		super();
		this.cargador=2;
		this.cantTiros=this.cargador;
		this.danio=1;
		this.alcance=1.5;
		this.durabilidad=7;
		this.tipoArma="Derringer";
	}
	
}
