import java.util.ArrayList;
import java.util.Date;

public abstract class Kort {
	//private ArrayList<Navn> navn = new ArrayList<Navn>();
	private java.util.Date dateCreated = new java.util.Date();
	private String navn;
	private int pin;
	private int kortnummer;
	private int aksesskode;
	private boolean sperretKort;
	private int antallkort = 100000;
	
	
	public Kort(String navn, int pin) {
		super();
		this.dateCreated = dateCreated;
		this.navn = navn;
		this.pin = pin;
		this.kortnummer = ++antallkort;
		//this.aksesskode = aksesskode;
		this.sperretKort = false;
	}
	
	public String getNavn() {
		return this.navn;
	}
	
	public boolean isSperret() {
		return sperretKort;
	}
	
	//skal med abstract i denne metoden?
	public boolean sjekkPIN(int pin){
		return this.pin == pin;
	}

	@Override
	public String toString() {
		return "Kort \nOpprettet: " + dateCreated + "\nNavn: " + navn + "\nPin: " + pin + "\nKortnummer: " + kortnummer
				+ "\nAksesskode: " + aksesskode + "\nSperret: " + sperretKort;
	}
	
}

