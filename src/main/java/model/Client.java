package model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
//@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlRootElement
@Entity
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String nickname;
	private String address;
	private String postalcode;
	private String city;
	private String number;

	//@Embedded
	private String accompte;

	public Client() {
		super();
	}

	public Client(String name, String nickname) {
		super();
		this.name = name;
		this.nickname = nickname;
	}

	public Client(String name, String nickname, String address, String postalcode, String city, String number) {
		super();
		this.name = name;
		this.nickname = nickname;
		this.address = address;
		this.postalcode = postalcode;
		this.city = city;
		this.number = number;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAccompte() {
		return accompte;
	}

	public void setAccompte(String accompte) {
		this.accompte = accompte;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", nickname=" + nickname + ", address=" + address
				+ ", postalcode=" + postalcode + ", city=" + city + ", number=" + number + ", accompte=" + accompte
				+ "]";
	}

}
