
package test;
import beans.Alimentos;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;


public class OperacionesBD {
    public static void main(String[] args) {
        //listarPelicula();
        actualizarAnimal(1,"perro");
    }
    
    public static void actualizarAnimal (int id, String animal){
        DBConnection con = new DBConnection();
        String sql = "UPDATE alimentos SET animal = '" + animal + "'WHERE id = " + id;
        
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
            
        } catch(Exception ex){
            
            System.out.println(ex.getMessage());
        
        }
        
        finally {
            con.desconectar();
        }
    }
    
    public static void listarAlimentos(){
         DBConnection con= new DBConnection();
         String sql = "SELECT * FROM alimentos";
    
         try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String marca = rs.getString("marca");
                String animal = rs.getString("animal");
                double peso = rs.getDouble("peso");
                boolean premium = rs.getBoolean("premium"); 
                double costo = rs.getDouble("costo");
                String edad = rs.getString("edad");
                int stock = rs.getInt("stock");
                
                Alimentos alimentos = new Alimentos(id,nombre,marca,animal,peso,premium,costo,edad,stock); 
                System.out.println(alimentos.toString());
            }
            
            st.executeQuery(sql);
            
        } catch(Exception ex){
            
            System.out.println(ex.getMessage());
        
        }
        
        finally {
            con.desconectar();
        }        
 
    }
    
    
    
}
