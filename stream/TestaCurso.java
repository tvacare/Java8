package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class TestaCurso {
	public static void main(String[] args) {
		
	List<Curso> cursos = new ArrayList<Curso>();
	cursos.add(new Curso("Python", 45));
	cursos.add(new Curso("JavaScript", 150));
	cursos.add(new Curso("Java 8", 113));
	cursos.add(new Curso("C", 55));
	
//	cursos.sort(Comparator.comparing(c -> c.getAlunos()));
//	OR
	cursos.sort(Comparator.comparingInt(Curso::getAlunos));
	
//	cursos.stream()
//	.filter(c -> c.getAlunos() >= 50)           		 //A API Strem nao modifica a collection como em outras APIS, por isso temos que usar o metodo MAP()
//	.map(Curso::getNome)						 		 //para criar um novo fluxo de acordo com o que queremos
//	.forEach(System.out::println);
	
	//Average
//	double avg = cursos.stream()
//	.mapToDouble(Curso::getAlunos)
//	.average()
//	.orElse(0);
//	
//	System.out.println(avg);
	
	List<String> list = cursos.stream()
			   .filter(c -> c.getAlunos() > 50)
			   .map(Curso::getNome)
			   .collect(Collectors.toList());	
	
	list.forEach(System.out::println);
	
	}
}
