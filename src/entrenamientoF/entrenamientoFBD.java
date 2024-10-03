
package entrenamientoF;

/**
 *
 * @author edufi
 */
import java.sql.Connection;
import java.sql.DriverManager;
public class entrenamientoFBD {
 //atributos de la clase
    private String url="jdbc:mysql://localhost:3306/";
    private String bd="functionaltraining";
    private String user="root";
    private String password="";
    private String driver ="com.mysql.cj.jdbc.Driver";
    protected Connection entrenamientoF;
    
    public entrenamientoFBD(){
        try{
            //llamada para cargar el driver para poder conectarse a una base de datos
            Class. forName(driver);
            //DriverManager es una clase que conecta una aplicaciòn a una fuente de datos
            entrenamientoF= DriverManager.getConnection(url+bd,user,password);
        }catch(Exception ex){
            ex.printStackTrace();
              }

        }

    }
