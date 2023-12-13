package ejercicio1;

public class CursoImpl implements Curso {

   private String nomCurso;
   private int codCurso;
   private int cupoDis;
	
	
	
	public CursoImpl(String nomCurso, int codCurso, int cupoDis) {
	super();
	this.nomCurso = nomCurso;
	this.codCurso = codCurso;
	this.cupoDis = cupoDis;
}

	@Override
	public String obtenerNomCurso() {
		// TODO Auto-generated method stub
		return nomCurso;
	}

	@Override
	public int obtenerCodCurso() {
		// TODO Auto-generated method stub
		return codCurso;
	}

	@Override
	public int obtenerCupoDis() {
		// TODO Auto-generated method stub
		return cupoDis;
	}

	public String getNomCurso() {
		return nomCurso;
	}

	public void setNomCurso(String nomCurso) {
		this.nomCurso = nomCurso;
	}

	public int getCodCurso() {
		return codCurso;
	}

	public void setCodCurso(int codCurso) {
		this.codCurso = codCurso;
	}

	public int getCupoDis() {
		return cupoDis;
	}

	public void setCupoDis(int cupoDis) {
		this.cupoDis = cupoDis;
	}

}
