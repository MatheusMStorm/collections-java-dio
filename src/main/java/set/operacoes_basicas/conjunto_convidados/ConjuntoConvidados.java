package set.operacoes_basicas.conjunto_convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> setConvidados;

    public ConjuntoConvidados() {
        this.setConvidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        setConvidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : setConvidados) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        setConvidados.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return setConvidados.size();
    }

    public void exibirConvidados() {
        System.out.println(setConvidados);
    }
}
