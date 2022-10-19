package com.yash.StreamAPI;

public class State {
	
 private int stateid;
 private String statename;
 
public State() {
	super();
}

public State(int stateid, String statename) {
	super();
	this.stateid = stateid;
	this.statename = statename;
}

public int getStateid() {
	return stateid;
}

public void setStateid(int stateid) {
	this.stateid = stateid;
}

public String getStatename() {
	return statename;
}

public void setStatename(String statename) {
	this.statename = statename;
}

@Override
public String toString() {
	return "State [stateid=" + stateid + ", statename=" + statename + "]";
}
	
 
}
