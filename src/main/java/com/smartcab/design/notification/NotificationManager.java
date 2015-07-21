package com.smartcab.design.notification;

import java.util.ArrayList;
import java.util.Iterator;

import com.smartcab.member.domain.Member;

public abstract class NotificationManager {
	protected String message;
	private ArrayList<Member> members = new ArrayList<Member>();
	
	public NotificationManager(){

	}
	public void addObserver(Member menber){
		members.add(menber);
		
	}
	
	public void deleteObserver(Member menber){
		members.remove(menber);
		
	}
	
	public void notifyObserver(Object args){
		Iterator it = members.iterator();
		
		while(it.hasNext()){
			Member member = (Member) it.next();
			member.updateMember();
		}
		
	}

}
