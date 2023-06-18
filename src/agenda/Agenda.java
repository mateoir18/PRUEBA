package agenda;

import java.util.Collection;
import java.util.HashMap;

public class Agenda {

	private HashMap<String, Contacto> contactos;
	private int tamanioMaximo;
	
	public Agenda() {
		contactos = new HashMap<>(10);
	}
	public Agenda(int tamaño) {
		tamanioMaximo = tamaño;
		contactos = new HashMap<>(tamaño);
	}
	
	public void aniadirContacto(Contacto c) {
		if(contactos.containsKey(c.getNombre())) {
			System.out.println("El contacto que estas intentando añadir, ya existe");
		}
		else {
			contactos.put(c.getNombre(), c);
		}
	}
	public boolean existeContacto(Contacto c) {
		return contactos.containsKey(c.getNombre());
	}
	public void listarContactos() {
		Collection<Contacto> contactos = this.contactos.values();
		for(Contacto c: contactos) {
			System.out.println(c);
		}
	}
	public String buscaContacto(String nombre) {
		Contacto c = contactos.get(nombre);
		if(c!=null) {
			return c.getTelefono();
		}
		else {
			return null;
		}
	}
	public void eliminarContacto(Contacto c) {
		Contacto eliminado = contactos.remove(c.getNombre());
		if(eliminado != null) {
			System.out.println("El contacto fue eliminado");
		}
		else {
			System.out.println("El contacto no existe en la Agenda");
			
		}
	}
	public boolean agendaLlena() {
		boolean estado;
		if(contactos.size()>= tamanioMaximo) {
			estado = true;
		}
		else {
			estado = false;
		}
		return estado;
	}
	public int huecosLibres() {
		int cuenta = tamanioMaximo - contactos.size();
		 return cuenta;
	
		
	}
	
	
}
