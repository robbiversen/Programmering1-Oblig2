import java.util.ArrayList;
import java.util.Collections;

public class KortTest {

	public static void main(String[] args) {

		ArrayList<Kort> reg = new ArrayList<Kort>();

		Kort k1 = new Ansatt("Ole", "Nilsen", 1234, 3, 180);
		Kort k2 = new Gjest("Marit", "Olsen");
		Kort k3 = new Ansatt("Bjørn", "Aasen", 6543, 4, 200);
		Kort k4 = new Ansatt("Egon", "Olsen", 1234, 0, 400);
		try {
			Kort k5 = (Kort) k4.clone();

			reg.add(k1);
			reg.add(k2);
			reg.add(k3);
			reg.add(k4);
			reg.add(k5);
		} catch (CloneNotSupportedException e) {
			System.out.println("Cannot clone object k5");
		}

		// fikk ikke Collections.sort(reg) til å virke som den skulle, etter mye
		// feilsøking bla inne på compareTo metoden i Kort klassen aner jeg
		// fremdeles ikke hvorfor denne ikke vil fungere.
		// Collections.sort(reg);

		// Eneste måte jeg så ut til å få Collections til å fungere som gitt i
		// oppgaven var å benytte meg av Comparator klassen, men denne kommer
		// vell strengt tatt ikke inn før kapittel 20, så er spent på å se
		// hvordan
		// dette var ment å løses uten den.

		Collections.sort(reg, new MyComparator());

		for (int i = 0; i < reg.size(); i++) {
			Kort kort = (Kort) reg.get(i);
			System.out.print(kort);
			System.out.println("\nTest av kort: med kode 1234 er" + (kort.sjekkPIN(1234) ? " gyldig" : " ugyldig"));
			System.out.println("\nTest av kort: med kode 9999 er" + (kort.sjekkPIN(9999) ? " gyldig" : " ugyldig\n\n"));
		}

		System.out.println(k3.compareTo(k2));
	}

}
