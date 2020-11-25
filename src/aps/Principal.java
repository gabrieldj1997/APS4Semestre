package aps;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import server.Conexao;
import static algoritmos.BubbleSort.*;

public class Principal {

    static Conexao con = new Conexao();
    static ArrayList<EstruturaDado> array500 = new ArrayList<EstruturaDado>();
    static ArrayList<EstruturaDado> array5k = new ArrayList<EstruturaDado>();
    static ArrayList<EstruturaDado> array10k = new ArrayList<EstruturaDado>();
    static ArrayList<EstruturaDado> array30k = new ArrayList<EstruturaDado>();

    public static void main(String[] args) {
        con.getConnection();
        con.getState();
        try {
            con.state.execute("use aps;");
            ResultSet rs = con.state.executeQuery("select * from mytable");
            while (rs.next()) {
                String nom = rs.getString("Nome");
                int orb = rs.getInt("Orbita");
                String data = rs.getString("Data");
                String lat = rs.getString("latitude");
                String lon = rs.getString("longitude");
                EstruturaDado dado = new EstruturaDado(nom, orb, data, lat, lon);
                array30k.add(dado);
            }
            for (int i = 0; i < array30k.size(); i++) {
                System.out.println(i + " >>> " + array30k.get(i).toString());
            }
            System.out.println(Chronometer.elapsedTime());
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
