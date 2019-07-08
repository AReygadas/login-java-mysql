
package configuracion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Arturo Reygadas Gonzalez
 */
public final class Configuracion {
   
    //configuracion por defecto 
    private String default_configuracion = "/127.0.0.1/3306/login_db/root/admin/";
    //direccion del archivo de texto
    private String archivo_de_configuracion=System.getProperty("user.dir") + "/miconfiguracion.txt";
    //Para leer archivo de texto
    private File archivo = null;
    private FileReader fr = null;
    private BufferedReader br = null;
    // para escribir en archivo
    private FileWriter fichero = null;
    private PrintWriter pw = null;
    //almacena los valores leidos del archivo de miconfiguracion.txt
    // donde los valores del vector:
    // 0     -> ip del servidor
    // 1     -> puerto 
    // 2     -> Nombre de la base de datos
    // 3     -> usuario 
    // 4     -> contraceña
    
    private final Vector<String> vector = new Vector<String>(10,2);
    
    public Configuracion() {  
        try {
            Configuraciones();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Configuracion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Configuracion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


 /* abre un archivo de texto y lee el contenido  */
    public void Configuraciones() throws FileNotFoundException, IOException{
        String configuracion="";//contenido del archivo         
        //el archivo se encuentra en el mismo directorio que la aplicacion         
        archivo = new File(archivo_de_configuracion);
        //si el archivo existe leemos la configuracion
        if(archivo.exists()){          
            configuracion = Leer_configuracion();
        }
        else{//sino existe lo creamos
           Guardar_Configuracion(default_configuracion);
           configuracion = Leer_configuracion();
        } 
        // el string que se retorno en "configuracion", lo separa mediante tokens y lo almacena
        // en una variable de tipo vector
        token(configuracion);
    
    }


      /* ABRE UN ARCHIVO DE TEXTO Y LEE EL CONENIDO EL CUAL RETORNA EN UN STRING */
    private String  Leer_configuracion() throws FileNotFoundException, IOException{
     String tmp_c="";
     fr = new FileReader(archivo);
     br = new BufferedReader(fr);
     // Lectura del fichero de texto
     String linea = null;
     while ((linea = br.readLine()) != null) {
         tmp_c = tmp_c + linea;
     }   
     fr.close();
     return tmp_c;
    }
    
    /* separa la configuracion y los añade al vector */
    private void token(String s){
     //separamos los valores leidos en tokens     
     StringTokenizer tokens = new StringTokenizer(s,"/");
     while(tokens.hasMoreTokens()){
        vector.addElement(tokens.nextToken());
        }           
    }

   
 //guarda las configuracion en el archivo de texto "miconfiguracion.txt"
 public boolean Guardar_Configuracion(String t){   
     boolean ok = false;
        try {
            fichero = new FileWriter(archivo_de_configuracion);
            pw = new PrintWriter(fichero);
            pw.println(t);
            ok = true;     
            fichero.close();
        } catch (IOException ex) {
            Logger.getLogger(Configuracion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ok;
  }
    
   /* DEVUELVE LOS VALORES ALMACENADOS EN EL VECTOR */ 
   /*  inicio */
   public String ip_servidor(){
        return vector.get(0).toString();
    }
    
    public int puerto(){
        return Integer.valueOf(vector.get(1).toString());
    }
    
    public String Base_de_Datos(){
    return vector.get(2).toString();
    } 
    
    public String Usuario(){
        return vector.get(3).toString();
    }
    
    public String Contraceña(){
        return vector.get(4).toString();
    }
}