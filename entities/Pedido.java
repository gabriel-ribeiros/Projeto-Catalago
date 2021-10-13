package com.example.entities;

import java.io.Serializable;
import java.util.List;

public class Pedido implements Serializable
{
	private static final long serialVersionUID = 1L;
	 
	public int Id;
	public Cliente Cliente;
	public List<Produto> Produtos;
	public double TotalGeral;
	
	public Pedido()
	{		
	}
		

	public Pedido(int id, double totalGeral) {
		super();
		Id = id;
		TotalGeral = totalGeral;
	}



	public void AddCarrinho(Produto produto)
	{
		Produtos.add(produto);
	}
	
	public void AlterarCarrinho(int Qtde, int ProdutoId)
	{
		 for(Produto p : Produtos)
		 {
			 if(p.Id == ProdutoId) {
				 p.Qtde = Qtde;
				 p.CalcularSubTotal();
			 }
		 }
	}
	
	public void RemoverCarrinho(int ProdutoId)
	{
		for(Produto p : Produtos)
		 {
			 if(p.Id == ProdutoId) {
				 p.Qtde = 0;				 
				 p.CalcularSubTotal();
			 }
		 }
		
		Produtos.removeIf(x -> x.Id == ProdutoId);
		
	}
	
	
	public void CalcularTotal()
	{ 
		for(Produto p : Produtos)
		{
			TotalGeral += p.Subtotal;
		}
	}
}
