package controlador;
import java.util.Comparator;

import modelo.bean.Usuario;
public class NombreComparator implements Comparator<Usuario> {

	@Override
	public int compare(Usuario o1, Usuario o2) {
		
		return o1.getNombreApellido().compareToIgnoreCase(o2.getNombreApellido());
	}

}
 