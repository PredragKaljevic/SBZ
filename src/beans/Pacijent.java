package beans;

import java.util.ArrayList;
import java.util.Date;

public class Pacijent {

	private String idPacijent;
	private String ime;
	private String prezime;
	private Date datumRodjenja;
	private String pol;
	private ArrayList<Pregled> pregledi = new ArrayList<Pregled>();
	private ArrayList<Bolest> bolesti = new ArrayList<Bolest>();
	private ArrayList<Lek> alergicanNaLekove = new ArrayList<Lek>();
	public Pacijent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pacijent(String idPacijent, String ime, String prezime, Date datumRodjenja, String pol,
			ArrayList<Pregled> pregledi, ArrayList<Bolest> bolesti, ArrayList<Lek> alergicanNaLekove) {
		super();
		this.idPacijent = idPacijent;
		this.ime = ime;
		this.prezime = prezime;
		this.datumRodjenja = datumRodjenja;
		this.pol = pol;
		this.pregledi = pregledi;
		this.bolesti = bolesti;
		this.alergicanNaLekove = alergicanNaLekove;
	}
	public String getIdPacijent() {
		return idPacijent;
	}
	public void setIdPacijent(String idPacijent) {
		this.idPacijent = idPacijent;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public Date getDatumRodjenja() {
		return datumRodjenja;
	}
	public void setDatumRodjenja(Date datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}
	public String getPol() {
		return pol;
	}
	public void setPol(String pol) {
		this.pol = pol;
	}
	public ArrayList<Pregled> getPregledi() {
		return pregledi;
	}
	public void setPregledi(ArrayList<Pregled> pregledi) {
		this.pregledi = pregledi;
	}
	public ArrayList<Bolest> getBolesti() {
		return bolesti;
	}
	public void setBolesti(ArrayList<Bolest> bolesti) {
		this.bolesti = bolesti;
	}
	public ArrayList<Lek> getAlergicanNaLekove() {
		return alergicanNaLekove;
	}
	public void setAlergicanNaLekove(ArrayList<Lek> alergicanNaLekove) {
		this.alergicanNaLekove = alergicanNaLekove;
	}
	@Override
	public String toString() {
		return "Pacijent [idPacijent=" + idPacijent + ", ime=" + ime + ", prezime=" + prezime + ", datumRodjenja="
				+ datumRodjenja + ", pol=" + pol + ", pregledi=" + pregledi + ", bolesti=" + bolesti
				+ ", alergicanNaLekove=" + alergicanNaLekove + "]";
	}

	
	
}
