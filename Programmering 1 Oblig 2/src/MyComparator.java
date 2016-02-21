import java.util.Comparator;

class MyComparator implements Comparator<Kort>{


	@Override
	public int compare(Kort kort1, Kort kort2) {
		if (kort1.getEtternavn().compareTo(kort2.getEtternavn()) > 0) {
			return 1;
		}
		else if (kort1.getEtternavn().compareTo(kort2.getEtternavn()) < 0) {
			return -1;
		}
		else { 
			if (kort1.getFornavn().compareTo(kort2.getFornavn()) > 0) {
				return 1;
			}
			else if (kort1.getFornavn().compareTo(kort2.getFornavn()) < 0) {
				return -1;
			}
			else {
				return 0;
			}
		}
	}
}
