package duelo;

public abstract class Arma {
	protected String tipoArma;
	protected int cantTiros;
	protected int cargador;
	protected int danio;
	protected double alcance;
	protected int durabilidad;
	

	public Arma(){
		
	}
	
	public String getTipoArma() {
		return tipoArma;
	}

	public void setTipoArma(String tipoArma) {
		this.tipoArma = tipoArma;
	}

	public int getCantTiros() {
		return cantTiros;
	}

	public void setCantTiros(int cantTiros) {
		this.cantTiros = cantTiros;
	}
	
	public int getCargador() {
		return cargador;
	}

	public void setCargador(int cargador) {
		this.cargador = cargador;
	}

	public int getDanio() {
		return danio;
	}

	public void setDanio(int danio) {
		this.danio = danio;
	}

	public double getAlcance() {
		return alcance;
	}

	public void setAlcance(double alcance) {
		this.alcance = alcance;
	}

	public int getDurabilidad() {
		return durabilidad;
	}

	public void setDurabilidad(int durabilidad) {
		this.durabilidad = durabilidad;
	}
	
	public void desgaste(){
		this.setDurabilidad(this.getDurabilidad()-1);
	}

	public boolean armaRota(){
		if(this.getDurabilidad()!=0)
			return false;
		return true;
	}

	public void recarga(){
		this.setCantTiros(this.getCargador());
		this.desgaste();
	}
	
	public boolean tiro(){
		if (this.getCantTiros()==0)
			this.recarga();// Semiautomatica...ponele
		if (this.armaRota())
			return false;
		this.setCantTiros(this.getCantTiros()-1);
		return true;	
	}
	
}
