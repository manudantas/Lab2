package Notas;

import java.util.ArrayList;

public class AlunoDAO {
	ArrayList< Aluno > alunos = new ArrayList<Aluno>();

	public void inserir(Aluno aluno){
		alunos.add(aluno);
	}
	
	public void remover(Aluno aluno){
		for(int i=0;i<alunos.size();i++){
			Aluno alunog = alunos.get(i);
			if(alunog == aluno){
				alunos.remove(aluno);
			}
		}
	}
	
	public void atualizarAluno(Aluno alunoant, Aluno alunonov){
		for(int i=0;i<alunos.size();i++){
			Aluno alunog = alunos.get(i);
			if(alunog == alunoant){
				alunoant.setNome(alunonov.getNome());
				alunoant.setNota1(alunonov.getNota1());
				alunoant.setNota2(alunonov.getNota2());
				alunoant.setFrequencia(alunonov.getFrequencia());
				}
			}
		}
	
	public Aluno procuraAluno(String nomedoaluno){
		for(int i=0;i<alunos.size();i++){
			Aluno alunog = alunos.get(i);
			String nome = alunog.getNome();
			if(nome.equals(nomedoaluno)){
				return alunog;
			}
		}
		return null;
	}
	
	}







