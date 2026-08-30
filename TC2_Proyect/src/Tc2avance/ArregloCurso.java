package Tc2avance;

import java.util.ArrayList;

public class ArregloCurso {
private ArrayList<Curso> curs;
public ArregloCurso() {
	curs=new ArrayList<Curso>();
	Adicionar(new Curso(5409, "FÍSICA 1", 14, 17));
	Adicionar(new Curso(5698, "GEOMETRÍA 1", 14, 17));
	Adicionar(new Curso(4425, "METODOLOGÍA 1", 14, 17));
}
public void Adicionar(Curso x) {
	curs.add(x);
}
public int Tamaño() {
	return curs.size();
}
public Curso Obtener(int i) {
	return curs.get(i);
}
}
