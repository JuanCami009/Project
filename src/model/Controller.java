package model;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.DateFormat;


public class Controller {

	private Project[] projects;
	
	private static final int SIZE = 10;

	private DateFormat formatter;


	public Controller() {

		projects = new Project[SIZE];

		this.formatter = new SimpleDateFormat("dd/M/yy");
	
	}
	
	//Incomplete
	public void RegisterProject(String name, String clientName, Calendar initialDate, Calendar finalDate, double budget) {
		Project project = new Project(name, clientName, initialDate, finalDate, budget);
		int pos = getFirstValidPosition();

		if(pos != -1){
			projects[pos]= project;
		}

	}

	//Incomplete
	// Date class also has their own before() and after() method
	public String searchProjectsAfterDate(String nameProject) {
		String msg = "El proyecto no ha sido encontrado";
		boolean isFound= false;

		for(int i = 0; i<SIZE && !isFound; i++){
			if(projects[i].getName().equalsIgnoreCase(nameProject)){
				isFound = true;
				msg = "La fecha final del proyecto es: ";
                System.out.println(projects[i].getFinalDate());
               
			}
		}


		 return msg;

	}
	
	//Incomplete
	// Date class also has their own before() and after() method
	public String searchProjectsBeforeDate() {

		String msg = "El proyecto no ha sido encontrado";

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
