package com.example.entities;

import java.io.Serializable;

public class Cliente implements Serializable
{
	    private static final long serialVersionUID = 1L;

		public int Id;
		public String Nome;
		public String CPF;
		
		public Cliente() 
		{			
		}
		
		public Cliente(int id, String nome, String cpf)
		{
			super();
			Id = id;
			Nome = nome;
			CPF = cpf;
		}
}
