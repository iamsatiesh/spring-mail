package com.demo.mail.dto;

public class Request {
	
	private String name;
	private String sendTo;
	private String sendFrom;
	private String subject;
	
	public Request() {
		super();
	}

	public Request(String name, String sendTo, String sendFrom, String subject) {
		super();
		this.name = name;
		this.sendTo = sendTo;
		this.sendFrom = sendFrom;
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSendTo() {
		return sendTo;
	}

	public void setSendTo(String sendTo) {
		this.sendTo = sendTo;
	}

	public String getSendFrom() {
		return sendFrom;
	}

	public void setSendFrom(String sendFrom) {
		this.sendFrom = sendFrom;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Sender [name=" + name + ", sendTo=" + sendTo + ", sendFrom=" + sendFrom + ", subject=" + subject + "]";
	}
	
	

}
