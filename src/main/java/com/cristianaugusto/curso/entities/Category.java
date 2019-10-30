package com.cristianaugusto.curso.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_category")
public class Category implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	private Set<Product> products = new HashSet<Product>();
	
	public Category() {}

	public Category(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getIdLong() {
		return id;
	}

	public void setIdLong(Long id) {
		this.id = id;
	}

	public String getNameString() {
		return name;
	}

	public void setNameString(String name) {
		this.name = name;
	}

	public Set<Product> getProducts() {
		return products;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
}
