package br.com.hibernate.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EntidadeTest {

	@Id
	@GeneratedValue
	private Long id;

	public Long getId() {
		return this.id;
	}
}
