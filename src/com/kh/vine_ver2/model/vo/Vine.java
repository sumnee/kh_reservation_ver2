package com.kh.vine_ver2.model.vo;

import java.sql.Date;

public class Vine {
	private String wineName;
	private String winePhone;
	private String wineEmail;
	private String wineDate;
	private String wineTime;
	private int number;
	private Date wineSettime;
	private String wineCancel;
	
	public Vine() {}
	
	
	public Vine(String wineName, String winePhone, String wineEmail, String wineDate, String wineTime, int number) {
		super();
		this.wineName = wineName;
		this.winePhone = winePhone;
		this.wineEmail = wineEmail;
		this.wineDate = wineDate;
		this.wineTime = wineTime;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Vine [wineName=" + wineName + ", winePhone=" + winePhone + ", wineEmail=" + wineEmail + ", wineDate="
				+ wineDate + ", wineTime=" + wineTime + ", number=" + number + ", wineSettime=" + wineSettime
				+ ", wineCancel=" + wineCancel + "]";
	}


	public String getWineName() {
		return wineName;
	}


	public void setWineName(String wineName) {
		this.wineName = wineName;
	}


	public String getWinePhone() {
		return winePhone;
	}


	public void setWinePhone(String winePhone) {
		this.winePhone = winePhone;
	}


	public String getWineEmail() {
		return wineEmail;
	}


	public void setWineEmail(String wineEmail) {
		this.wineEmail = wineEmail;
	}


	public String getWineDate() {
		return wineDate;
	}


	public void setWineDate(String wineDate) {
		this.wineDate = wineDate;
	}


	public String getWineTime() {
		return wineTime;
	}


	public void setWineTime(String wineTime) {
		this.wineTime = wineTime;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public Date getWineSettime() {
		return wineSettime;
	}


	public void setWineSettime(Date wineSettime) {
		this.wineSettime = wineSettime;
	}


	public String getWineCancel() {
		return wineCancel;
	}


	public void setWineCancel(String wineCancel) {
		this.wineCancel = wineCancel;
	}

}
