package set.ordenacao.gerenciamento_alunos;

public class MainGerenciadorAlunos {
    public static void main(String[] args) {
        GerenciadorAlunos alunos = new GerenciadorAlunos();

        alunos.adicionarAluno("Matheus", 223456, 8.5);
        alunos.adicionarAluno("Willian", 223457, 5.5);
        alunos.adicionarAluno("Marcos", 223457, 4.5);
        alunos.adicionarAluno("Norma", 223458, 9.5);
        alunos.adicionarAluno("Madu", 223459, 10);
        alunos.adicionarAluno("José", 223460, 3.5);

        alunos.exibirAlunos();
        System.out.println(alunos.exibirAlunoPorNome());
        System.out.println(alunos.exibirAlunoPorNota());

        alunos.removerAluno(223457);
    }
}
