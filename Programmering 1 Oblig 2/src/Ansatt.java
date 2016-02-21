import java.util.GregorianCalendar;

public class Ansatt extends Kort {

	private GregorianCalendar dateToday;
	private int openKontortid = 7;
	private int stengtKontortid = 17;

	public Ansatt(String navn, int pin) {
		super(navn, pin);
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
		return "Ansatt \nKontortid: " + openKontortid + " - " + stengtKontortid + "\n" + super.toString();
	}
}