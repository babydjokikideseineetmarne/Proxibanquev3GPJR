package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("conseiller")
/**
 * @author JOachim Gwennhaelle
 *
 */
public class Conseiller extends Personne {

	public Conseiller() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Conseiller(String name, String nickname) {
		super(name, nickname);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Conseiller []";
	}

}
