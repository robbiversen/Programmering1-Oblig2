import java.util.GregorianCalendar;

public class Ansatt extends Kort{
	
	private GregorianCalendar dateToday;
	private int openKontortid = 7;
	private int stengtKontortid = 17;

	public Ansatt(String navn, int pin) {
		super(navn, pin);
	}
	
	public boolean sjekkPIN(int pin){
		this.dateToday = new GregorianCalendar();
		if ((dateToday.HOUR_OF_DAY >= openKontortid) && (dateToday.HOUR_OF_DAY <= stengtKontortid) && (super.isSperret() == false)) {
			return true;
		}
		return super.sjekkPIN(pin); 
	}

	@Override
	public String toString() {
		return "Ansatt \nDato i dag: " + dateToday + "\nKontortid: " + openKontortid + " - "
				+ stengtKontortid +  super.toString();
	}
}