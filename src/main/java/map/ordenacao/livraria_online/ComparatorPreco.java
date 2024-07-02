package map.ordenacao.livraria_online;

import java.util.Comparator;
import java.util.Map;

public class ComparatorPreco implements Comparator<Map.Entry<Long, Livro>> {

    @Override
    public int compare(Map.Entry<Long, Livro> l1, Map.Entry<Long, Livro> l2) {
        return Double.compare(l1.getValue().getPreco(), l2.getValue().getPreco());
    }
    
}
