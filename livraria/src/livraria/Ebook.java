package livraria;

public class Ebook extends Livro implements Promocional {
	private String waterMark;
	
	public Ebook(Autor autor) {
		super(autor);
	}
	
	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		if(porcentagem > 0.15) {
			return false;
		}
		System.out.println("aplicando desconto do ebook");
		double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto);
		return true;
	}

	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}
	
	public String getWaterMark() {
		return waterMark;
	}

}
