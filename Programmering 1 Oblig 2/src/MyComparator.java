import java.util.Comparator;

class MyComparator implements Comparator<Kort>{


	@Override
	public int compare(Kort kort1, Kort kort2) {
		int alfabetisk = kort1.getEtternavn().compareTo(kort2.getEtternavn());
		if (alfabetisk == 0) {
			alfabetisk = kort1.getFornavn().compareTo(kort2.getFornavn());
		}
		return alfabetisk;
	}
}
