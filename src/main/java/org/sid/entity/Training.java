package org.sid.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedHashSet;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@XmlAccessorType(XmlAccessType.FIELD) // pour indiquer a JAXB que les @ sont placées sur les champs et non pas les getters 
public class Training implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int duration;
	
	@XmlTransient // Pour ignorer cet element 
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "training")
	private Collection<Student> students = new LinkedHashSet<>();

}
