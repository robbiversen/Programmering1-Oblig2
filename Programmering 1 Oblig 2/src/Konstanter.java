
public interface Konstanter {
	int kreditt = 2;
	int bonus = 3000;

	public void settFornavn(String fornavn);
	
	public String hentFornavn();
	
	public void settEtternavn(String etternavn);
	
	public String hentEtternavn();
	
	public void settFulltNavn(String fornavn, String etternavn);
	
	public String hentFulltNavn();
	
	public double beregnKreditt();
	
	public double beregnBonus();
	
}
