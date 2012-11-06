package exercicio;

import java.util.List;
import java.util.ArrayList;

public class Pedido {
	
	private long numeroDoPedido;
	private Cliente cliente;
	private List<ItemDePedido> itens;

	public Pedido(long numeroDoPedido){
		this.numeroDoPedido = numeroDoPedido;
		this.setCliente(new Cliente());
		this.itens = new ArrayList<ItemDePedido>();
	}
	
	public List<ItemDePedido> getItens(){
		return this.itens;
	}
	
	public void adicionaItem(ItemDePedido item){
		itens.add(item);
	}
	
	public long getNumeroDoPedido(){
		return this.numeroDoPedido;
	}
	
	public void setNumeroDoPedido(long numeroDoPedido){
		this.numeroDoPedido = numeroDoPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
