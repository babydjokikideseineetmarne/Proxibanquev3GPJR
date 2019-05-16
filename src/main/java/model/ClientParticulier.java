package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@DiscriminatorValue("particulier")
@XmlRootElement
/**
 * @author JOachim Gwennhaelle
 *
 */
public class ClientParticulier extends Client {

	public ClientParticulier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClientParticulier(String name, String nickname, String address, String postalcode, String city,
			String number) {
		super(name, nickname, address, postalcode, city, number);
		// TODO Auto-generated constructor stub
	}

	public ClientParticulier(String name, String nickname) {
		super(name, nickname);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ClientParticulier []";
	}

}
