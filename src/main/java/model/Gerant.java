package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@DiscriminatorValue("gerant")
@XmlRootElement
/**
 * @author JOachim Gwennhaelle
 *
 */
public class Gerant extends Personne {

	public Gerant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gerant(String name, String nickname) {
		super(name, nickname);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Gerant []";
	}

}
