package model;

import java.util.Calendar;


public class Controller {

	private Project[] projects;
	
	private static final int SIZE = 10;



	public Controller() {

		projects = new Project[SIZE];

	
	}
	
	public void RegisterProject(String name, String clientName, Calendar initialDate, Calendar finalDate, double budget) {
		Project project = new Project(name, clientName, initialDate, finalDate, budget);
		int pos = getFirstValidPosition();

		if(pos != -1){
			projects[pos]= project;
		}

	}

	// Date class also has their own before() and after() method
	public void searchProjectsAfterDate(String nameProject) {

		boolean isFound= false;

		for(int i = 0; i<SIZE && !isFound; i++){
			if(projects[i].getName().equalsIgnoreCase(nameProject)){
				isFound = true;
                System.out.println("La fecha final del proyecto es: "+projects[i].getFinalDateFormated());
               
			}else {
				isFound = true;
				System.out.println("El proyecto no ha sido encontrado");
			}
		}



	}
	
	// Date class also has their own before() and after() method
	public void searchProjectsBeforeDate(String nameProject) {

	

		boolean isFound= false;

		for(int i = 0; i<SIZE && !isFound; i++){
			if(projects[i].getName().equalsIgnoreCase(nameProject)){
				isFound = true;
				
                System.out.println("La fecha incial del proyecto es: "+projects[i].getInitialDateFormated());
			}
			else {
                isFound = true;
                System.out.println("El proyecto no ha sido encontrado");
            }
		}


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
