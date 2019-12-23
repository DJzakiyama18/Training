package com.example.demo;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class ShainForm {
//@NotEmpty はBean validationにあるクラス？？
@NotEmpty(message = " 値を入力してください")
@Size(min = 3,max= 3 ,message = "※入力は３文字でおねがします")//入力できる文字数の宣言
@Pattern(regexp="[0-9]*",message="※入力は数字でお願いします")//入力できる文字型の宣言　[0-9]*　正規表現
private String number;

@NotEmpty(message = "値を入力してください")
@Size(min = 0, max =10, message = "10文字以内でお願いします")
private String name;

@NotEmpty(message = "値を入力してください")
@Size(min = 8, max = 16, message = "入力は8文字以上16文字以内")
@Pattern(regexp = "[0-9a-zA-z]*", message = "入力は英数字でお願いします")
private String password;

public String getNumber() {
return number;
}

public void setNumber(String number) {
this.number = number;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

}