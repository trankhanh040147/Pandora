package vn.pandora.Model;

import java.sql.Date;

public class Category {

	public Category() {
		
	}
	public Category(int id , String name, int categoryId, String image,Boolean isDeleted,Date createdAt,Date updatedAt) {
		this.id=id;
		this.name =name ;
		this.categoryId=categoryId;
		this.image=image;
		this.isDeleted=isDeleted;
		this.createdAt=createdAt;
		this.updatedAt=updatedAt;
	}
private int id;
private String name;
private int categoryId;
private String image;
private Boolean isDeleted ;
private Date createdAt;
private Date updatedAt;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getCategoryId() {
	return categoryId;
}
public void setCategoryId(int categoryId) {
	this.categoryId = categoryId;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public Boolean getIsDeleted() {
	return isDeleted;
}
public void setIsDeleted(Boolean isDeleted) {
	this.isDeleted = isDeleted;
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
}
