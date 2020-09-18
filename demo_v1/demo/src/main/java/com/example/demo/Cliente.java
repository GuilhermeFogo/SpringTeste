package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {
	
	private @Id @GeneratedValue Long id;
	private String nome;
	private String email;
	
	public Cliente(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	
	public String getEmail() {
		return email;
	}
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	
	
}
