package _Sprint3Tarea02Nivel1;

public class AgenciaNY extends Agencia {

	public AgenciaNY(AgenteBolsa ag) {
		this.sujeto = ag;
		this.sujeto.agregar(this);
	}
	@Override
	public void actualizar() {
		// TODO Auto-generated method stub
		System.out.println("AgenciaNY actualizada.");
	}
}
