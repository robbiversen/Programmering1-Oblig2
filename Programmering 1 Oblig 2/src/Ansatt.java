import java.util.GregorianCalendar;

public class Ansatt extends Kort implements Konstanter {

	private GregorianCalendar dateToday;
	private int openKontortid = 7;
	private int stengtKontortid = 17;
	private int ansinitet;
	private double timelonn;
	
	
	
	public Ansatt(String fornavn, String etternavn, int pin, int ansinitet, double timelonn) {
		super(fornavn, etternavn, pin);
		this.ansinitet = ansinitet;
		this.timelonn = timelonn;
	}

	
	@Override
	public void settFornavn(String fornavn) {
		super.setFornavn(fornavn);
	}




	@Override
	public String hentFornavn() {
		return super.getFornavn();
	}




	@Override
	public void settEtternavn(String etternavn) {
		super.setEtternavn(etternavn);
	}




	@Override
	public String hentEtternavn() {
		return super.getEtternavn();
	}




	@Override
	public void settFulltNavn(String fornavn, String etternavn) {
		super.setFornavn(fornavn);
		super.setEtternavn(etternavn);
	}


	@Override
	public String hentFulltNavn() {
		return super.getFornavn() + " " + super.getEtternavn();
	}
	


	@Override
	public double beregnKreditt() {
		return timelonn * kreditt;
	}




	@Override
	public double beregnBonus() {
		return bonus * ansinitet;
	}




	@Override
	public boolean sjekkPIN(int pin) {
		this.dateToday = new GregorianCalendar();
		if (isSperret()) {
			return false;
		} 
		else if ((dateToday.HOUR_OF_DAY >= openKontortid) && (dateToday.HOUR_OF_DAY <= stengtKontortid)
				&& (dateToday.DAY_OF_WEEK > 1) && (dateToday.DAY_OF_WEEK < 7)) {
			return true;
		}
		else {
			return this.pin == pin;
		}
	}


	@Override
	public String toString() {
		return "Ansatt \nKontortid: " + openKontortid + " - " + stengtKontortid + "\nKreditt: " + beregnKreditt() + "\nBonus: " + beregnBonus() + "\n" + super.toString();
	}
}