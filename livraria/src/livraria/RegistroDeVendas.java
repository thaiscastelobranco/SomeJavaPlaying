package livraria;

public class RegistroDeVendas {

	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Maur�cio Aniche");
		
		LivroFisico fisico = new LivroFisico(autor);//Livro fisico = new LivroFisico;
		fisico.setNome("Test-Driven Development");
		fisico.setValor(59.90);
		
		Ebook ebook = new Ebook(autor);//Livro ebook = new Ebook;
		ebook.setNome("Test-Driven Development");
		ebook.setValor(29.90);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adiciona(fisico);
		carrinho.adiciona(ebook); 
		
		System.out.println("O valor total da compra �: " + carrinho.getTotal());
		if(fisico.aplicaDescontoDe10Porcento()) {
			System.out.println("Valor agora �: " + fisico.getValor());
		}
	}

}
