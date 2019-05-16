package model;

import javax.persistence.Embeddable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Embeddable
@XmlRootElement
@XmlAccessorType(value = XmlAccessType.FIELD)
public class CompteBancaire {
	private String numberaccompte;

	public CompteBancaire(String numberaccompte) {
		super();
		this.numberaccompte = numberaccompte;
	}

	@Override
	public String toString() {
		return "CompteBancaire [numberaccompte=" + numberaccompte + "]";
	}

}
