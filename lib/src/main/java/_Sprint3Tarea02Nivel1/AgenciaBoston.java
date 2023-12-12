package _Sprint3Tarea02Nivel1;

public class AgenciaBoston extends Agencia {
	public AgenciaBoston(AgenteBolsa ag) {
		this.sujeto = ag;
		this.sujeto.agregar(this);
	}

	@Override
	public void actualizar() {
		System.out.println("Agencia Boston Actuializada.");
	}

}
