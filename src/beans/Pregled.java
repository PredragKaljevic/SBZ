package beans;

import java.util.ArrayList;
import java.util.Date;

public class Pregled {

	private String idPregleda;
	private Korisnik lekar;
	private Date datumPregleda;
	private ArrayList<Simptom> simptomi = new ArrayList<Simptom>();
	private Bolest dijagnostikovanaBolest;
	private Lek propisanLek;
	public Pregled() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pregled(String idPregleda, Korisnik lekar, Date datumPregleda, ArrayList<Simptom> simptomi,
			Bolest dijagnostikovanaBolest, Lek propisanLek) {
		super();
		this.idPregleda = idPregleda;
		this.lekar = lekar;
		this.datumPregleda = datumPregleda;
		this.simptomi = simptomi;
		this.dijagnostikovanaBolest = dijagnostikovanaBolest;
		this.propisanLek = propisanLek;
	}
	public String getIdPregleda() {
		return idPregleda;
	}
	public void setIdPregleda(String idPregleda) {
		this.idPregleda = idPregleda;
	}
	public Korisnik getLekar() {
		return lekar;
	}
	public void setLekar(Korisnik lekar) {
		this.lekar = lekar;
	}
	public Date getDatumPregleda() {
		return datumPregleda;
	}
	public void setDatumPregleda(Date datumPregleda) {
		this.datumPregleda = datumPregleda;
	}
	public ArrayList<Simptom> getSimptomi() {
		return simptomi;
	}
	public void setSimptomi(ArrayList<Simptom> simptomi) {
		this.simptomi = simptomi;
	}
	public Bolest getDijagnostikovanaBolest() {
		return dijagnostikovanaBolest;
	}
	public void setDijagnostikovanaBolest(Bolest dijagnostikovanaBolest) {
		this.dijagnostikovanaBolest = dijagnostikovanaBolest;
	}
	public Lek getPropisanLek() {
		return propisanLek;
	}
	public void setPropisanLek(Lek propisanLek) {
		this.propisanLek = propisanLek;
	}
	@Override
	public String toString() {
		return "Pregled [idPregleda=" + idPregleda + ", lekar=" + lekar + ", datumPregleda=" + datumPregleda
				+ ", simptomi=" + simptomi + ", dijagnostikovanaBolest=" + dijagnostikovanaBolest + ", propisanLek="
				+ propisanLek + "]";
	}

	
	
}
