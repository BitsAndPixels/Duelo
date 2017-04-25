package duelo;

public class Winchester extends Arma{
	
	public Winchester(){
		super();
		this.cargador=2;
		this.cantTiros=this.cargador;
		this.danio=3;
		this.alcance=4;
		this.durabilidad=15;
		this.tipoArma="Winchester";
	}

	public boolean tiro(){
		if(this.getCantTiros()==0 && !this.armaRota())
			return false; // Tiene que reecargar manualmente
		this.setCantTiros(this.getCantTiros()-1);		
		return true;	
	}

}
