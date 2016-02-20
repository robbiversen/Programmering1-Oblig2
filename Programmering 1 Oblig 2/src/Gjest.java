import java.util.GregorianCalendar;

public class Gjest extends Kort {
	private int dagerGyldig = 7;
	private GregorianCalendar gyldigTilDato;
	private GregorianCalendar dateToday;

	public Gjest(String navn) {
		super(navn, 9999);
		this.gyldigTilDato = new GregorianCalendar();
		gyldigTilDato.add(GregorianCalendar.DAY_OF_MONTH, dagerGyldig);
	}
	
	public GregorianCalendar getGyldigTilDato() {
		return gyldigTilDato;
	}

	public boolean sjekkPIN(int pin){
		this.dateToday = new GregorianCalendar();
		if (gyldigTilDato.after(dateToday)) {
			super.setSperretKort(true);
		}
		return super.sjekkPIN(pin);
	}

	@Override
	public String toString() {
		return "Gjest \nDager Gyldig: " + dagerGyldig + "\nGyldig Til Dato: " + gyldigTilDato + "\n"
				+ super.toString();
	}

}