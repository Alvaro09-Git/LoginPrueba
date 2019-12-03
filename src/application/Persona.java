package application;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Persona {
	String nombre;
	String usuario;
	String contrase�a;
	public Persona(String nombre, String usuario, String contrase�a) {
		super();
		this.nombre = nombre;
		this.usuario = usuario;
		this.contrase�a = contrase�a;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	//COPIAR USUARIO EN EL JSON
			public static void serializarArrayAJson(ArrayList<Persona> listaPersonas) {
				Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
//				String representacionBonita = prettyGson.toJson(empleados);
//				System.out.println(representacionBonita);
				  try(FileWriter writer = new FileWriter("personas.json")){
					  prettyGson.toJson(listaPersonas, writer);
			        } catch (IOException e) {
			            e.printStackTrace();
			        }
			}

}
