package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import configuracion.Setings;


/*
    @author Arturo Reygadas Gonzalez
 */
public class ConexionDB {
     
    public static Connection GetConnection()
    {
        Connection conexion=null;
        configuracion.Configuracion cargar=new configuracion.Configuracion();
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String servidor = "jdbc:mysql://"+cargar.ip_servidor()+":"+cargar.puerto()+"/"+cargar.Base_de_Datos()+"?autoReconnect=true&useSSL=false";
            String usuarioDB=""+cargar.Usuario()+"";
            //String passwordDB="";
            String passwordDB=""+cargar.Contraceña()+"";
            conexion= DriverManager.getConnection(servidor,usuarioDB,passwordDB);
        }
        catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error1 "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion=null;
            Setings config = new Setings();
            config.show();
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error2 "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion = null;
            Setings config = new Setings();
            config.show();
        }
        catch(Exception ex)
        {
    
            JOptionPane.showMessageDialog(null, ex, "Error3"+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion=null;
            
            Setings config = new Setings();
            config.show();
        }
        finally
        {
            return conexion;
        }
    }
}