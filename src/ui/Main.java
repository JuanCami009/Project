package ui;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Scanner;

import model.Controller;

public class Main{

	private Scanner reader;
	private Controller controller;
	private Calendar rightNow;

	public Main() {

		reader = new Scanner(System.in);
		controller = new Controller();
		rightNow = Calendar.getInstance();
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
	double budget;
	DateFormat formatter;

	System.out.println("Digite el nombre del proyecto");
	name = reader.next();
	System.out.println("Digite el nombre del cliente");
	clientName = reader.next();
	System.out.println("Digite la fecha de inicio");
	
	System.out.println("Digite la fecha de fin");


	System.out.println("Digite el presupuesto para el proyecto");
	budget= reader.nextDouble();


	}

	//Incomplete
	public void searchProjectsAfterDate() {

	}
	
	//Incomplete
	public void searchProjectsBeforeDate() {

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
