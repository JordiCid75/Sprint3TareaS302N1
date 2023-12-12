package _Sprint3Tarea02Nivel1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AgenteBolsa agente = new AgenteBolsa();
		new AgenciaNY(agente);
		new AgenciaBoston(agente);
		
		// el agente recibe un cambio de bolsa
		System.out.println("Agente Recibe un cambio de bolsa 1.");
		agente.cambioBolsa();
		// el agente recibe un cambio de bolsa
		System.out.println("Agente Recibe un cambio de bolsa 2.");
		agente.cambioBolsa();
		// el agente recibe un cambio de bolsa
		System.out.println("Agente Recibe un cambio de bolsa 3.");
		agente.cambioBolsa();
		
		
	}

}
