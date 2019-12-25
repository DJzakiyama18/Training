package com.example.demo.inquiry;

import javax.validation.constraints.NotEmpty;

public class InquiryForm {
@NotEmpty(message = "値を入力してください1")
private String name;
@NotEmpty(message = "値を入力してください2")
private String email;
//@NotEmpty(message = "値を入力してください3")
private String content;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
}
