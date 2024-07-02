package map.ordenacao.livraria_online;

public class MainLivrariaOnline {
    public static void main(String[] args) {
        LivrariaOnline livraria = new LivrariaOnline();

        livraria.adicionarLivro(11111, "https://www.amazon.com.br/Harry-Potter-Pedra-Filosofal-Rowling", "Harry Potter e a Pedra Filosofal", "J. K. Rowling", 35.29);
        livraria.adicionarLivro(2222, "https://www.amazon.com.br/Harry-Potter-C%C3%A2mara-Secreta-Rowling", "Harry Potter e a Câmara Secreta", "J. K. Rowling", 44.92);
        livraria.adicionarLivro(33333, "https://www.amazon.com.br/dp/8535932178/ref=sspa_dk_detail_0?psc=1&pd_rd_i=8535932178&pd_rd_w=3OEUn&content-id=amzn1.sym.b0d855ab-21fd-49b1-ae3e-5a01e562f959&pf_rd_p=b0d855ab-21fd-49b1-ae3e-5a01e562f959", "O oráculo da noite: A história e a ciência do sonho", "Sidarta Ribeiro", 66.72);

        System.out.println(livraria.exibirLivrosOrdenadosPorPreco());
        System.out.println(livraria.obterLivroMaisCaro());
        System.out.println(livraria.obterLivroMaisBarato());
        System.out.println(livraria.pesquisarLivroPorAutor("J. K. Rowling"));
    }
}
