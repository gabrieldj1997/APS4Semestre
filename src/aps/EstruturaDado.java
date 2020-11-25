
package aps;

public class EstruturaDado {
    
    public EstruturaDado(String nom, int orb, String data, String lat, String lon){
        this.nome = nom;
        this.orbita = orb;
        this.data = data;
        this.latitude = lat;
        this.longitude = lon;
    }
    
    public String nome;
    public int orbita;
    public String data;
    public String latitude;
    public String longitude;
    
    public String toString(){
        String text;
        text = "Nome = "+nome+" Orbita = "+orbita+" Data = "+data+" Latitude = "+latitude+" Longitude = "+longitude;
        return text;
    }
}
