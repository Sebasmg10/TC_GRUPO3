package clases;

public class Nrc {

	private int codigo, cant_max, cant_actu;
	private String NombreCurso, Docente;
	public Nrc(int codigo, int cant_max, int cant_actu, String nombreCurso, String docente) {
		super();
		this.codigo = codigo;
		this.cant_max = cant_max;
		this.cant_actu = cant_actu;
		NombreCurso = nombreCurso;
		Docente = docente;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCant_max() {
		return cant_max;
	}
	public void setCant_max(int cant_max) {
		this.cant_max = cant_max;
	}
	public int getCant_actu() {
		return cant_actu;
	}
	public void setCant_actu(int cant_actu) {
		this.cant_actu = cant_actu;
	}
	public String getNombreCurso() {
		return NombreCurso;
	}
	public void setNombreCurso(String nombreCurso) {
		NombreCurso = nombreCurso;
	}
	public String getDocente() {
		return Docente;
	}
	public void setDocente(String docente) {
		Docente = docente;
	}
	
}