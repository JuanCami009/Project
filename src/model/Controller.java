package model;

import java.util.Calendar;

public class Controller {

	private Project[] projects;
	private static final int SIZE = 10;

	public Controller() {

		projects = new Project[SIZE];
	
	}
	
	//Incomplete
	public boolean RegisterProject() {

		return false;
	}

	//Incomplete
	// Date class also has their own before() and after() method
	public String searchProjectsAfterDate() {

		String msg = "";

		return msg;

	}
	
	//Incomplete
	// Date class also has their own before() and after() method
	public String searchProjectsBeforeDate() {

		String msg = "";

		return msg;

	}
	public int getFirstValidPosition(){
		int pos = -1; 
		boolean isFound = false; 
		for(int i = 0; i < SIZE && !isFound; i++){
			if(projects[i] == null){
				pos = i; 
				isFound = true;
			}
		}
		return pos; 
	}
}
