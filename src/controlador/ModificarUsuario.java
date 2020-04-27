package controlador;



import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.bean.Usuario;
import modelo.dao.ModeloUsuario;



/**
 * Servlet implementation class ModificarUsuario
 */
@WebServlet("/ModificarUsuario")
public class ModificarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int idUsuario = Integer.parseInt(request.getParameter("id"));
		String nombreApellido = request.getParameter("nombreApellido");
		String dni = request.getParameter("dni");
		String codigo = request.getParameter("codigo");
		
		Usuario usuario = new Usuario();
		
		usuario.setId(idUsuario);
		usuario.setNombreApellido(nombreApellido);
		usuario.setDni(dni);
		usuario.setCodigo(codigo);
		
		ModeloUsuario modeloUsuario = new ModeloUsuario();
		
		modeloUsuario.update(usuario);
		
		response.sendRedirect("VerUsuario?id=" + idUsuario);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}