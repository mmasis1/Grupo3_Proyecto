package proyecto.avance.registrar.categoria;

public class Categoria {
    private int IdCategoria;
    public String NombreCategoria;
    
    
    
    public void setNombreCategoria(String NombreCategoria){
    this.NombreCategoria = NombreCategoria;
}
   public String getNombreCategoria(){
    return NombreCategoria;
}
   public void setIdCategoria(int IdCategoria) {
        this.IdCategoria = IdCategoria;
    
    }
public int getIdCategoria() {
        IdCategoria = IdCategoria +1;
        return IdCategoria;
    
    }

}
