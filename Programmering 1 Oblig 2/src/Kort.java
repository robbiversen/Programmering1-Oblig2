import java.util.GregorianCalendar;

public abstract class Kort {
	private GregorianCalendar dateCreated;
	private String fornavn;
	private String etternavn;
	protected int pin;
	private int kortnummer;
	private int aksesskode;
	private boolean sperretKort;
	private static int antallkort = 100000;
	
	
	public Kort(String fornavn, String etternavn, int pin) {
		super();
		this.dateCreated = new GregorianCalendar();
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.pin = pin;
		this.kortnummer = ++antallkort;
		//this.aksesskode = aksesskode;
		this.sperretKort = false;
	}
	
	public String getFornavn() {
		return fornavn;
	}


	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}


	public String getEtternavn() {
		return etternavn;
	}


	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
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
		return "Kort \nOpprettet: " + dateCreated.getTime() + "\nNavn: " + fornavn + " " + etternavn + "\nPin: " + pin + "\nKortnummer: " + kortnummer
				+ "\nAksesskode: " + aksesskode + "\nSperret: " + sperretKort;
	}
	
}




