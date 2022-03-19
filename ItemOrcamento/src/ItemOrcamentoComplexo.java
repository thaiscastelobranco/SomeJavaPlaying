
public class ItemOrcamentoComplexo extends ItemOrcamento {
	
	private ItemOrcamento subitensDeOrcamento[];
	
	
	public ItemOrcamentoComplexo(String historico, float valor, ItemOrcamento subitensDeOrcamento[]) {
		super(historico, valor);
		this.subitensDeOrcamento = subitensDeOrcamento;
	}

	@Override
	public float getValor() {
		float soma = 0;
		for (int i = 0; i < subitensDeOrcamento.length ; i++) {
			soma += subitensDeOrcamento[i].getValor();
		}
		return soma;
	}
	
	public ItemOrcamento encontraItem(String historico) {
		for (int i = 0; i < subitensDeOrcamento.length; i++) {
			if (subitensDeOrcamento[i].getHistorico().equals(historico)) {
				return subitensDeOrcamento[i];
			} 
		}
		return null;
	}
	

}
