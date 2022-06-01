package com.event.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Event {

	@JsonProperty("Id")
	private String id;
	
	@JsonProperty("HostName")
	private String hostname;
	
	@JsonProperty("Category")
	private int category;
	
	@JsonProperty("LogMessage")
	private String logmessage;
	
	@JsonProperty("Severity")
	private String severity;
	
	@JsonProperty("LogTime")
	private Long logtime;
	
	@JsonProperty("ProcessName")
	private String processname;
	
	@JsonProperty("ThreadName")
	private String threadname;
	
	@JsonProperty("CallStack")
	private String callstack;
	
	@JsonProperty("LastUpdated")
	private Long lastupdated;
	
	public Event() {}
	
	public Event(String id, String hostname, int category, String logmessage, String severity, Long logtime,
			String processname, String threadname, String callstack, Long lastupdated) {
		this.id = id;
		this.hostname = hostname;
		this.category = category;
		this.logmessage = logmessage;
		this.severity = severity;
		this.logtime = logtime;
		this.processname = processname;
		this.threadname = threadname;
		this.callstack = callstack;
		this.lastupdated = lastupdated;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getLogmessage() {
		return logmessage;
	}

	public void setLogmessage(String logmessage) {
		this.logmessage = logmessage;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public Long getLogtime() {
		return logtime;
	}

	public void setLogtime(Long logtime) {
		this.logtime = logtime;
	}

	public String getProcessname() {
		return processname;
	}

	public void setProcessname(String processname) {
		this.processname = processname;
	}

	public String getThreadname() {
		return threadname;
	}

	public void setThreadname(String threadname) {
		this.threadname = threadname;
	}

	public String getCallstack() {
		return callstack;
	}

	public void setCallstack(String callstack) {
		this.callstack = callstack;
	}

	public Long getLastupdated() {
		return lastupdated;
	}

	public void setLastupdated(Long lastupdated) {
		this.lastupdated = lastupdated;
	}

}
