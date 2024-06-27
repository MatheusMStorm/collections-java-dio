package list.pesquisa.catalogo_livros;

public class MainCatalogoLivros {
    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        // Adicionando livros
        catalogo.adicionarLivro("Memórias Póstumas de Brás Cubas", "Machado de Assis", 1881);
        catalogo.adicionarLivro("Dom Casmurro", "Machado de Assis", 1899);
        catalogo.adicionarLivro("Canção do Exílio", "Gonçalves Dias", 1899);
        catalogo.adicionarLivro("Memórias Póstumas de Brás Cubas", "Machado de Assis", 2019);

        // Pesquisar por autor
        System.out.println(catalogo.pesquisarPorAutor("Machado de Assis"));
        System.out.println(catalogo.pesquisarPorAutor("Gonçalves Dias"));  
        
        // Pesquisar por intervalo de tempo
        System.out.println(catalogo.pesquisarPorIntervaloAnos(1880, 1900));

        // Pesquisar por título
        System.out.println(catalogo.pesquisarPorTitulo("Memórias Póstumas de Brás Cubas"));
    }
}
