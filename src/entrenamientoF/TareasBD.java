
package entrenamientoF;

/**
 *
 * @author edufi
 */
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class TareasBD extends entrenamientoFBD{
    // atributos de la clase
    private Statement sentencia;
    private ResultSet resultado;
    private PreparedStatement sentenciaps;

    //método para consultar todos los clientes
    public void consultar(){
        try{
            // Crear un objeto Statement para enviar instrucciones SQL
            sentencia=entrenamientoF.createStatement();
            // Construcción de sentencia SQL
            String query="SELECT * FROM alimento ";
            // El método executeQuery ejecuta una sentencia SELECT y devuelve un objeto ResultSet
            resultado = sentencia.executeQuery(query);
            // Recorrer el objeto ResultSet obtenido
            while(resultado.next()){
                int id_alimento = resultado.getInt ("id_alimento");
                String kilocalorias = resultado.getString ("kilocalorias");
                String cantidad = resultado.getString("cantidad");
                String nombre =resultado.getString("nombre");
                String proteina =resultado.getString("proteina");
                String grasa =resultado.getString("grasa");
                String carbohidratos =resultado.getString("carbohidratos");
                String fibra =resultado.getString("fibra");
                
                System.out.println("\nalimento: " + id_alimento + "\nkilocalorias: " + kilocalorias + "\ncantidad: "+ cantidad +"\nnombre: " + nombre +"\nproteina: "+ proteina + "\ngrasa: " + grasa +"\ncarbohidrato: "+ carbohidratos + "\nfibra: "+ fibra );
            }
           
             
            // Crear un objeto Statement para enviar instrucciones SQL
            sentencia=entrenamientoF.createStatement();
            // Construcción de sentencia SQL
            String queryU="SELECT * FROM usuario ";
            // El método executeQuery ejecuta una sentencia SELECT y devuelve un objeto ResultSet
            resultado = sentencia.executeQuery(queryU);
            while(resultado.next()){
                int id_usuario = resultado.getInt("id_usuario");
                String username = resultado.getString("username");
                String fecha_creacion = resultado.getString("fecha_creacion");
                String imagen  =resultado.getString("imagen");
                String 	email =resultado.getString("email");
                String sexo =resultado.getString("sexo");
                String IMC =resultado.getString("IMC");
                String altura =resultado.getString("altura");
                String peso_actual =resultado.getString("peso_actual");
                String peso_deseado =resultado.getString("peso_deseado");
                String password =resultado.getString("password");
                String fecha_nacimiento =resultado.getString("fecha_nacimiento");
                String peso_ideal =resultado.getString("peso_ideal");
                String plan_id =resultado.getString("plan_id");
                
                System.out.println("\nid_usuario: " + id_usuario + "\nusername: " + username + "\nfecha_creacion : " + fecha_creacion +"\nimagen: " + imagen +"\nemail : "+ email + "\nsexo : " + sexo +"\nIMC:" + IMC + "\nestatura : "+ altura + "\npeso_actual: " + peso_actual +"\npeso_deseado: " + peso_deseado +"\npassword: " + password + "\nfecha_nacimiento: " + fecha_nacimiento + "\npeso_ideal: " + peso_ideal + "\nplan_id:" + plan_id);
            }
             
            // Crear un objeto Statement para enviar instrucciones SQL
            sentencia=entrenamientoF.createStatement();
            // Construcción de sentencia SQL
            String queryR="SELECT * FROM rutina ";
            // El método executeQuery ejecuta una sentencia SELECT y devuelve un objeto ResultSet
            resultado = sentencia.executeQuery(queryR);
            while(resultado.next()){
                int id_rutina = resultado.getInt("id_rutina");
                String nombre = resultado.getString("nombre");
                String tiempo_total = resultado.getString("tiempo_total");
                String dificultad  =resultado.getString("dificultad");
                String 	tiempo_descanso =resultado.getString("tiempo_descanso");
                String id_usuario=resultado.getString("id_usuario");
                
                System.out.println("\nid_rutina: " + id_rutina + "\nnombre: " + nombre + "\ntiempo_total : " + tiempo_total +"\ndificultad: " + dificultad +"\ntiempo_descanso : "+ tiempo_descanso + "\nid_usuario : " + id_usuario);
            }
            
            // Crear un objeto Statement para enviar instrucciones SQL
            sentencia=entrenamientoF.createStatement();
            // Construcción de sentencia SQL
            String queryP="SELECT * FROM plan ";
            // El método executeQuery ejecuta una sentencia SELECT y devuelve un objeto ResultSet
            resultado = sentencia.executeQuery(queryP);
            while(resultado.next()){
                int id_plan = resultado.getInt("id_plan");
                String kilocalorias = resultado.getString("kilocalorias");
                String fibra = resultado.getString("fibra");
                String grasa  =resultado.getString("grasa");
                String 	carbohidrato =resultado.getString("carbohidrato");
                String proteina =resultado.getString("proteina");
                
                System.out.println("\nid_uplan: " + id_plan + "\nkilocalorias: " + kilocalorias + "\nfibra : " + fibra +"\ngrasa: " + grasa +"\ncarbohidrato : "+ carbohidrato + "\nproteina : " + proteina);
            }
            
            // Crear un objeto Statement para enviar instrucciones SQL
            sentencia=entrenamientoF.createStatement();
            // Construcción de sentencia SQL
            String queryEJ="SELECT * FROM ejercicios";
            // El método executeQuery ejecuta una sentencia SELECT y devuelve un objeto ResultSet
            resultado = sentencia.executeQuery(queryEJ);
            while(resultado.next()){
                int id_ejercicio = resultado.getInt("id_ejercicio");
                String nombre = resultado.getString("nombre");
                String dificultad = resultado.getString("dificultad");
                String id_youtube =resultado.getString("id_youtube");
                String 	estiramiento =resultado.getString("estiramiento");
                String imagen =resultado.getString("imagen");
                
                System.out.println("\nid_ejercicio : " + id_ejercicio + "\nnombre: " + nombre + "\ndificultad : " + dificultad +"\nid_youtobe: " + id_youtube +"\nestiramiento : "+ estiramiento + "\nimagen : " + imagen);
            }
            // Crear un objeto Statement para enviar instrucciones SQL
            sentencia=entrenamientoF.createStatement();
            // Construcción de sentencia SQL
            String queryD="SELECT * FROM dia ";
            // El método executeQuery ejecuta una sentencia SELECT y devuelve un objeto ResultSet
            resultado = sentencia.executeQuery(queryD);
            while(resultado.next()){
                int id_dia = resultado.getInt("id_dia");
                String fecha = resultado.getString("fecha");
                String kilocalorias = resultado.getString("kilocalorias");
                String fibra  =resultado.getString("fibra");
                String 	carbohidratos =resultado.getString("carbohidratos");
                String grasa =resultado.getString("grasa");
                String proteina =resultado.getString("proteina");
                String alimentacion_id =resultado.getString("alimentacion_id");
                
                System.out.println("\nid_dia: " + id_dia + "\nfecha: " + fecha + "\nkilocalorias : " + kilocalorias +"\nfibra: " + fibra +"\ncarbohidratos: "+ carbohidratos + "\nproteina : " + proteina+ "\ngrasa: "+grasa +"\nalimentacion_id"+ alimentacion_id );
            }
            
            // Crear un objeto Statement para enviar instrucciones SQL
            sentencia=entrenamientoF.createStatement();
            // Construcción de sentencia SQL
            String queryA="SELECT * FROM dia_alimento ";
            // El método executeQuery ejecuta una sentencia SELECT y devuelve un objeto ResultSet
            resultado = sentencia.executeQuery(queryA);
            while(resultado.next()){
                int id_dia_alimento = resultado.getInt("id_dia_alimento");
                 int alimento_id = resultado.getInt("alimento_id"); 
                System.out.println("\nid_dia_alimento: " + id_dia_alimento + "\nalimento_id: " + alimento_id );
            }
             // Crear un objeto Statement para enviar instrucciones SQL
            sentencia=entrenamientoF.createStatement();
            // Construcción de sentencia SQL
            String queryM="SELECT * FROM menu ";
            // El método executeQuery ejecuta una sentencia SELECT y devuelve un objeto ResultSet
            resultado = sentencia.executeQuery(queryM);
            while(resultado.next()){
                int id_menu = resultado.getInt("id_menu");
                String desayuno =resultado.getString("desayuno");
                String almuerzo =resultado.getString("almuerzo");
                String merienda =resultado.getString("merienda");
                String cena =resultado.getString("cena");
                System.out.println("\nid_menu: " + id_menu + "\ndesayuno: " + desayuno + "\nalmuerzo: " + almuerzo + "merienda: "+ merienda + "\ncena: "+cena);
            }
            // Crear un objeto Statement para enviar instrucciones SQL
            sentencia=entrenamientoF.createStatement();
            // Construcción de sentencia SQL
            String queryAL="SELECT * FROM alimentacion ";
            // El método executeQuery ejecuta una sentencia SELECT y devuelve un objeto ResultSet
            resultado = sentencia.executeQuery(queryAL);
            while(resultado.next()){
                int id_alimentacion = resultado.getInt("id_alimentacion");
                 int id_usuario= resultado.getInt("id_usuario"); 
                 String numero_dia =resultado.getString("numero_dia");
                 
                System.out.println("\nid_alimentacion: " + id_alimentacion + "\nid_usuario : " + id_usuario + "\nnumero_dia:" + numero_dia  );
            }
            
            // Crear un objeto Statement para enviar instrucciones SQL
            sentencia=entrenamientoF.createStatement();
            // Construcción de sentencia SQL
            String queryT="SELECT * FROM dieta ";
            // El método executeQuery ejecuta una sentencia SELECT y devuelve un objeto ResultSet
            resultado = sentencia.executeQuery(queryT);
            while(resultado.next()){
                int id_dieta= resultado.getInt("id_dieta"); 
                 String nombre =resultado.getString("nombre");
                   String objetivo =resultado.getString("objetivo");
                   String descripcion =resultado.getString("descripcion");
                 
                System.out.println("\nid_dieta: " + id_dieta + "\nnombre : " + nombre + "\nobjetivo :" + objetivo +"\ndescripcion: " + descripcion );
            }
             // Crear un objeto Statement para enviar instrucciones SQL
            sentencia=entrenamientoF.createStatement();
            // Construcción de sentencia SQL
            String queryDM="SELECT * FROM dieta_menu ";
            // El método executeQuery ejecuta una sentencia SELECT y devuelve un objeto ResultSet
            resultado = sentencia.executeQuery(queryDM);
            while(resultado.next()){
                int id_dieta = resultado.getInt("id_dieta");
                 int id_menu = resultado.getInt("id_menu"); 
                System.out.println("\nid_dieta : " + id_dieta + "\nid_menu: " + id_menu );
            }
             // Crear un objeto Statement para enviar instrucciones SQL
            sentencia=entrenamientoF.createStatement();
            // Construcción de sentencia SQL
            String queryUD="SELECT * FROM usuario_dieta ";
            // El método executeQuery ejecuta una sentencia SELECT y devuelve un objeto ResultSet
            resultado = sentencia.executeQuery(queryUD);
            while(resultado.next()){
                int id_usuario = resultado.getInt("id_usuario");
                 int id_dieta = resultado.getInt("id_dieta"); 
                System.out.println("\nid_dieta : " + id_dieta + "\nid_usuario: " + id_usuario );
            }
            
              // Crear un objeto Statement para enviar instrucciones SQL
            sentencia=entrenamientoF.createStatement();
            // Construcción de sentencia SQL
            String queryRE="SELECT * FROM rutina_ejercicio ";
            // El método executeQuery ejecuta una sentencia SELECT y devuelve un objeto ResultSet
            resultado = sentencia.executeQuery(queryRE);
            while(resultado.next()){
                int id_rutina = resultado.getInt("id_rutina");
                 int id_ejercicio = resultado.getInt("id_ejercicio"); 
                System.out.println("\nid_rutina : " + id_rutina + "\nid_ejercicio: " + id_ejercicio );
            }
                        
            // Cerrar las conexiones abiertasid
            resultado.close();
            sentencia.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
   
    public void insertar(
            int id_alimento, 
            String kilocalorias, 
            String cantidad, 
            String nombre, 
            String proteina, 
            String grasa, 
            String carbohidratos, 
            String fibra){
        try{    
            // Sentencia SQL con parámetros
            String query="INSERT INTO alimento VALUES (?,?,?,?,?,?,?,?)";
            // Preparación de la consulta para pasar los parámetros
            sentenciaps = entrenamientoF.prepareStatement(query);
            sentenciaps.setInt(1, id_alimento);
            sentenciaps.setDouble(3, Double.parseDouble(kilocalorias));
            sentenciaps.setDouble(8, Double.parseDouble(cantidad));
            sentenciaps.setString(2, nombre );
            sentenciaps.setDouble(7, Double.parseDouble(proteina));
            sentenciaps.setDouble(6, Double.parseDouble(grasa));
            sentenciaps.setDouble(5, Double.parseDouble(carbohidratos));
            sentenciaps.setDouble(4, Double.parseDouble(fibra));
            // El método executeUpdate, ejecuta sentencias INSERT, UPDATE, o DELETE, las cuales no retornan datos
            sentenciaps.executeUpdate();
            // Cerrar la conexión abierta
            sentenciaps.close();
            System.out.println("El alimento ha sido registrado satisfactoriamente \n");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    
    public void Actualizar(
            int id,
            String nombre,
            Double kilocalorias,
            Double fibra,
            Double carbohidratos,
            Double grasa,
            Double proteina,
            Double cantidad
    ){
        try {
            String query = "UPDATE alimento SET nombre = ?, kilocalorias = ?, "
                    + "fibra = ?, carbohidratos = ?, grasa = ?, proteina = ?, cantidad = ? WHERE id_alimento = ?";
            
            // Preparación de la consulta para pasar los parámetros
            sentenciaps = entrenamientoF.prepareStatement(query);

            sentenciaps.setString(1, nombre );
            sentenciaps.setDouble(2, kilocalorias );
            sentenciaps.setDouble(3, fibra );
            sentenciaps.setDouble(4, carbohidratos );
            sentenciaps.setDouble(5, grasa );
            sentenciaps.setDouble(6, proteina );
            sentenciaps.setDouble(7, cantidad );
            sentenciaps.setInt(8, id );

            sentenciaps.executeUpdate();
                // Cerrar la conexión abierta
            sentenciaps.close();
        System.out.println("El alimento ha sido actualizar satisfactoriamente \n");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void Delete(
            int id
    ){
        try {
            String query = "DELETE FROM alimento WHERE id_alimento = ?";
            
            // Preparación de la consulta para pasar los parámetros
            sentenciaps = entrenamientoF.prepareStatement(query);

            sentenciaps.setInt(1, id );

            sentenciaps.executeUpdate();
                // Cerrar la conexión abierta
            sentenciaps.close();
        System.out.println("El alimento ha sido eliminar satisfactoriamente \n");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}

