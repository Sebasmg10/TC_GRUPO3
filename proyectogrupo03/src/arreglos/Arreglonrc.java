package arreglos;

import java.util.ArrayList;

import clases.Nrc;

public class Arreglonrc {
	private ArrayList<Nrc>nrcs;
	public Arreglonrc() {
		nrcs = new ArrayList<Nrc>();
		Adicionar(new Nrc(2020, 20, 16, "Tec. de pro.", "Lenin Arce"));
	}
	
		public void Adicionar(Nrc x) 
		{
			nrcs.add(x);
		}
	public int Tamaño() 
		{
		return nrcs.size();
		}
	public Nrc Obtener(int n) 
		{
			return nrcs.get(n);
		}
	public Nrc Buscar(int codi) 
		{
		for (int i = 0; i < Tamaño(); i++) {
			if(Obtener(i).getCodigo() == codi) return Obtener(i);
		}
		return null;
		}
	public void Eliminar(Nrc n) 
		{
			nrcs.remove(n);
		}
		
	
	

}
