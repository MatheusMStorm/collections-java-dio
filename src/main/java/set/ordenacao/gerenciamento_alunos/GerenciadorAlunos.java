package set.ordenacao.gerenciamento_alunos;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> setAlunos;

    public GerenciadorAlunos() {
        this.setAlunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double nota) {
        setAlunos.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula) {
        Aluno alunoRemovido = null;
        for (Aluno a : setAlunos) {
            if (a.getMatricula() == matricula) {
                alunoRemovido = a;
                break;
            }
        }
        setAlunos.remove(alunoRemovido);
        System.out.println("Aluno removido com sucesso!");
    }

    public Set<Aluno> exibirAlunoPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(setAlunos);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunoPorNota() {
        Set<Aluno> alunosPorNome = new TreeSet<>(new ComparatorPorNota());
        alunosPorNome.addAll(setAlunos);
        return alunosPorNome;
    }

    public void exibirAlunos() {
        System.out.println(setAlunos);
    }

    class ComparatorPorNota implements Comparator<Aluno> {

        @Override
        public int compare(Aluno a1, Aluno a2) {
            return Double.compare(a1.getNota(), a2.getNota());
        }

    }
}