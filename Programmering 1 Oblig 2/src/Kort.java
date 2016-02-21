import java.util.GregorianCalendar;

public abstract class Kort {
	private GregorianCalendar dateCreated;
	private String navn;
	protected int pin;
	private int kortnummer;
	private int aksesskode;
	private boolean sperretKort;
	private static int antallkort = 100000;
	
	
	public Kort(String navn, int pin) {
		super();
		this.dateCreated = new GregorianCalendar();
		this.navn = navn;
		this.pin = pin;
		this.kortnummer = ++antallkort;
		//this.aksesskode = aksesskode;
		this.sperretKort = false;
	}
	
	public String getNavn() {
		return this.navn;
	}
	
	public GregorianCalendar getDateCreated() {
		return dateCreated;
	}

	public boolean isSperret() {
		return sperretKort;
	}
	
	public void setSperretKort(boolean sperretKort){
		this.sperretKort = sperretKort;
	}
	
	public abstract boolean sjekkPIN(int pin);

	@Override
	public String toString() {
		return "Kort \nOpprettet: " + dateCreated.getTime() + "\nNavn: " + navn + "\nPin: " + pin + "\nKortnummer: " + kortnummer
				+ "\nAksesskode: " + aksesskode + "\nSperret: " + sperretKort;
	}
	
}




