package vn.pandora.Model;

import java.sql.Date;

public class User {

	public User(int id , String firstname, String lastname, String id_card, String email,
			String phone, Boolean isEmailActive, Boolean isPhoneActive,
			String password,String role, String  address, String avatar,String cover,
			double e_wallet , Date createdAt, Date updatedAt) {
		
		this.id =id ;
		this.firstname=firstname;
		this.lastname=lastname;
		this.id_card=id_card;
		this.email=email;
		this.phone=phone ;
		this.isEmailActive=isEmailActive;
		this.isPhoneActive=isPhoneActive;
		this.password=password;
		this.role=role;
		this.addresse=address;
		this.avatar=avatar;
		this.cover=cover;
		this.e_wallet=e_wallet;
		this.createdAt=createdAt;
		this.updatedAt=updatedAt;
		
	}
	public User() {}
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getId_card() {
		return id_card;
	}
	public void setId_card(String id_card) {
		this.id_card = id_card;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean isEmailActive() {
		return isEmailActive;
	}
	public void setEmailActive(boolean isEmailActive) {
		this.isEmailActive = isEmailActive;
	}
	public boolean isPhoneActive() {
		return isPhoneActive;
	}
	public void setPhoneActive(boolean isPhoneActive) {
		this.isPhoneActive = isPhoneActive;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getAddresse() {
		return addresse;
	}
	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public double getE_wallet() {
		return e_wallet;
	}
	public void setE_wallet(double e_wallet) {
		this.e_wallet = e_wallet;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
private int id;
private String firstname;
private String lastname;
private String id_card;
private String email;
private String phone;
private boolean isEmailActive;
private boolean isPhoneActive;
private String password;
private String role;
private String addresse;
private String avatar;
private String cover;
private double e_wallet;
private Date createdAt;
private Date updatedAt;
}
