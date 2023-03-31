package ui;
import java.util.Calendar;
import java.util.Scanner;

import model.Controller;

public class Main{

	private Scanner reader;
	private Controller controller;

	public Main() {

		reader = new Scanner(System.in);
		controller = new Controller();
	}

	public static void main(String[] args) {

		Main exe = new Main();

		int option = 0;
		do{
			exe.menu();
			option = exe.validateIntegerInput();

		}while(option != 0);
		
		exe.reader.close();

	}

	// Incomplete
	public void menu() {
		System.out.println("1. Registrar proyecto");
		System.out.println("1. Consultar proyectos que finalizan antes de la fecha");
		System.out.println("1. Consultar proyectos que inician despúes de la fecha");
		System.out.println("0. Salir");
	}

	public void executeOption(int option){
		switch(option){

			case 1:
			registerProject();
			break;

			case 2:
			searchProjectsAfterDate();
			break;

			case 3:
			searchProjectsAfterDate();
			break;

			case -1:
			System.out.println("Opción invalida!!");
			break;

		}
	}

	//Incomplete
	public void registerProject() {
	String name;
	String clientName;
	Calendar initialDate;
	Calendar finalDate;
	int month;
	double budget;

	System.out.println("Digite el nombre del proyecto");
	name = reader.next();
	System.out.println("Digite el nombre del cliente");
	clientName = reader.next();
	initialDate = Calendar.getInstance();
	System.out.println("La fecha de incio es: "+initialDate);
	System.out.println("Digite en meses cuanto va durar el proyecto: ");
	month = reader.nextInt();
	finalDate = Calendar.getInstance();
	finalDate.add(Calendar.MONTH, month); 
	System.out.println("Digite el presupuesto para el proyecto");
	budget= reader.nextDouble();

	controller.RegisterProject(name, clientName, initialDate, finalDate, budget);

	
	}

	//Incomplete
	public void searchProjectsAfterDate() {
		String nameProject;

		System.out.println("Digite el nombre del proyecto: ");
		nameProject = reader.next();

		controller.searchProjectsAfterDate(nameProject);

	}
	
	//Incomplete
	public void searchProjectsBeforeDate() {

		String nameProject;

		System.out.println("Digite el nombre del proyecto: ");
		nameProject = reader.next();

		controller.searchProjectsBeforeDate(nameProject);

	}

	public int validateIntegerInput(){
        int option = 0; 
        if(reader.hasNextInt()){
            option = reader.nextInt(); 
        }
        else{
            reader.next();// limpiar el scanner 
            option = -1; 
            System.out.println("Ingrese un valor entero"); 
        }
        return option; 
    }

	
}
