package controlador;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import modelo.bean.Actividad;
import modelo.dao.ModeloActividad;

/**
 * Servlet implementation class ApiCrearActividad
 */
@WebServlet("/ApiCrearActividad")
public class ApiCrearActividad extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApiCrearActividad() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("UTF-8"); //enieak eta ondo irakurtzeko
		String jsonActividad = request.getParameter("actividad");
		
		
		
		System.out.println(jsonActividad);
		JSONObject jsonObject = new JSONObject(jsonActividad);
		

		Actividad actividad = new Actividad();
		
		actividad.setNombre(jsonObject.getString("nombre"));
		actividad.setDias(jsonObject.getString("dias"));
		actividad.setHoras(jsonObject.getInt("horas"));
		actividad.setPrecio(jsonObject.getInt("precio"));
		
		
		//usuario.setNombreApellido(jsonObject.getString("nombreApellido"));
		//usuario.setCodigo(jsonObject.getString("codigo"));
		//usuario.setDni(jsonObject.getString("dni"));
		
		ModeloActividad mActividad = new ModeloActividad();
		mActividad.insert(actividad);
			
		try {
			mActividad.getConexion().close();
		} catch (SQLException e) {
			System.out.println("Errorea conexioa ixtean");
			e.printStackTrace();
		}
		
		response.setHeader("Access-Control-Allow-Origin","*"); //jsonp deia denean ez da behar
		response.setCharacterEncoding("UTF-8");
	}

}
