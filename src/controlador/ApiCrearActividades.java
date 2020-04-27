package controlador;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import modelo.bean.Actividad;
import modelo.bean.Usuario;
import modelo.dao.ModeloActividad;
import modelo.dao.ModeloUsuario;

/**
 * Servlet implementation class ApiCrearActividades
 */
@WebServlet("/ApiCrearActividades")
public class ApiCrearActividades extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApiCrearActividades() {
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
		String jsonActividades = request.getParameter("actividades");
		System.out.println(jsonActividades);
		
		
		
		JSONArray jsonArray = new JSONArray(jsonActividades);
		ModeloActividad mActividad = new ModeloActividad();
		
		for(int i = 0; i < jsonArray.length();i++) {
			JSONObject jsonObject = jsonArray.getJSONObject(i);
			Actividad actividad = new Actividad();
			
			actividad.setNombre(jsonObject.getString("nombre"));
			actividad.setDias(jsonObject.getString("dias"));
			actividad.setHoras(jsonObject.getInt("horas"));
			actividad.setPrecio(jsonObject.getInt("precio"));
			
			mActividad.insert(actividad);
			
		}
	
	
			
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
