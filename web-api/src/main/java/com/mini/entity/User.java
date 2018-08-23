package com.mini.entity;

import java.util.Date;

/**
 * Created by ldw
 */
public class User {
	private int u_Id;// 必填
	private String u_Name; // 姓名
	private String u_Login_Pass;// 登录密码
	private String u_Number;// 员工号
	private String u_Group;// 项目组
	private String u_Email;// 邮箱
	private String u_Gender; // 性别
	private String u_Mobilephone; // 手机号
	private String u_Role; // 角色
	private String create_Id;// 必填
	private Date create_Date;
	private String update_Id;

	private String open_Id;
	private Date update_Date;
	private int del_Flg;// 必填

	public int getU_Id() {
		return u_Id;
	}

	public void setU_Id(int u_Id) {
		this.u_Id = u_Id;
	}

	public String getU_Name() {
		return u_Name;
	}

	public void setU_Name(String u_Name) {
		this.u_Name = u_Name;
	}

	public String getU_Login_Pass() {
		return u_Login_Pass;
	}

	public void setU_Login_Pass(String u_Login_Pass) {
		this.u_Login_Pass = u_Login_Pass;
	}

	public String getU_Group() {
		return u_Group;
	}

	public void setU_Group(String u_Group) {
		this.u_Group = u_Group;
	}

	public String getU_Number() {
		return u_Number;
	}

	public void setU_Number(String u_Number) {
		this.u_Number = u_Number;
	}

	public String getU_Email() {
		return u_Email;
	}

	public void setU_Email(String u_Email) {
		this.u_Email = u_Email;
	}

	public String getU_Gender() {
		return u_Gender;
	}

	public void setU_Gender(String u_Gender) {
		this.u_Gender = u_Gender;
	}

	public String getU_Mobilephone() {
		return u_Mobilephone;
	}

	public void setU_Mobilephone(String u_Mobilephone) {
		this.u_Mobilephone = u_Mobilephone;
	}

	public String getCreate_Id() {
		return create_Id;
	}

	public void setCreate_Id(String create_Id) {
		this.create_Id = create_Id;
	}

	public Date getCreate_Date() {
		return create_Date;
	}

	public void setCreate_Date(Date create_Date) {
		this.create_Date = create_Date;
	}

	public String getUpdate_Id() {
		return update_Id;
	}

	public void setUpdate_Id(String update_Id) {
		this.update_Id = update_Id;
	}

	public String getOpen_Id() {
		return open_Id;
	}

	public void setOpen_Id(String open_Id) {
		this.open_Id = open_Id;
	}

	public Date getUpdate_Date() {
		return update_Date;
	}

	public void setUpdate_Date(Date update_Date) {
		this.update_Date = update_Date;
	}

	public int getDel_Flg() {
		return del_Flg;
	}

	public void setDel_Flg(int del_Flg) {
		this.del_Flg = del_Flg;
	}

	public String getU_Role() {
		return u_Role;
	}

	public void setU_Role(String u_Role) {
		this.u_Role = u_Role;
	}

}