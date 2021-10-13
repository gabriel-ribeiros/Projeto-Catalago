package com.example.entities;

import java.io.Serializable;

public class Produto implements Serializable
{
	private static final long serialVersionUID = 1L;
	 
	public int Id;
	public String Descricao;
	public int Qtde;
	public double VlrUnitario;
	public double Subtotal;
	
	public Produto()
	{		
	}

		
	public Produto(int id, String descricao, int qtde, double vlrUnitario) 
	{
		Id = id;
		Descricao = descricao;
		Qtde = qtde;
		VlrUnitario = vlrUnitario;	
		CalcularSubTotal();
	}
	
	public void CalcularSubTotal() 
	{
		Subtotal = Qtde * VlrUnitario;
	}
	
	
	
}
