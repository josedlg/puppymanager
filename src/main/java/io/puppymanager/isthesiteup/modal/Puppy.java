package io.puppymanager.isthesiteup.modal;

import java.io.Serializable;


import javax.persistence.*;


@Entity
public class Puppy implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String breed; 
    private String name;
    private String email;
    private String phone;
    private String imageURL;
    @Column(nullable = false, updatable = false )
    private String puppyCode;
    
    public Puppy() {}

    public Puppy(String breed, String name,String email, String phone, String imageURL, String puppyCode){
        this.breed = breed;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.imageURL = imageURL;        
    }
    public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBread() {
		return this.breed;
	}

	public void setBread(String bread) {
		this.breed = bread;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return this.phone;
	
    }
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getImageURL() {
		return this.imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}


	public String getPuppyCode() {
		return this.puppyCode;
	}

	public void setPuppyCode(String puppyCode) {
		this.puppyCode = puppyCode;
	}

    public String toString() {
        return 
        id + " " + breed + " " + name + " " + email + " " + phone + " " + imageURL + " " + puppyCode;
    }

}