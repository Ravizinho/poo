package exercicio;

import java.util.List;
import java.util.ArrayList;

public class ControleDePedidos implements InterfaceSistemaDeControle {
	
	private List<Pedido> pedidos;
	
	public ControleDePedidos(){
		this.pedidos = new ArrayList<Pedido>();
	}
	
	public int calculaQuantidadeDePedidosDoCliente(String nomeCliente){
		int cont = 0;
		for(Pedido s: pedidos){
			if(s.getCliente().getNome().equals(nomeCliente)){
				cont++;
			}
		}
		return cont;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	
	public void adicionaPedido(Pedido p) {
		pedidos.add(p);		
	}

	
	public List<Pedido> pesquisaPedidoIncluindoProduto(long codProduto) {
		
		List<Pedido> guardaProduto = new ArrayList<Pedido>();
		
		for(Pedido s: pedidos){
			for(ItemDePedido item: s.getItens()){
				if(item.getCodProduto() == codProduto){
					guardaProduto.add(s);
				}
			}
			
		}
		return guardaProduto;
		
	}

	
	public void removePedido(long numPedido) {
		for(Pedido p: pedidos){
			if(p.getNumeroDoPedido() == numPedido){
				pedidos.remove(p);
			}
		}
		
	}

}
