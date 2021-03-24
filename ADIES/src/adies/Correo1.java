/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adies;

/**
 *
 * @author guill
 */
public class Correo1 {
    String usuarioCorreo, nombreArchivo, Contrasea, rutaArchivo, destino, asunto,mensaje;
    
    
    public Correo1(){  
    }
    
    public Correo1(String usuarioCorreo,/*String nombreArchivo,*/String Contrasea,/*String rutaArchivo,*/String destino,String asunto,String mensaje){
        this.usuarioCorreo = usuarioCorreo;
       // this.nombreArchivo= nombreArchivo;
        this.Contrasea=Contrasea;
     //   this.rutaArchivo=rutaArchivo;
        this.destino=destino;
        this.asunto=asunto;
        this.mensaje=mensaje;
    }

    public String getUsuarioCorreo() {
        return usuarioCorreo;
    }

    public void setUsuarioCorreo(String usuarioCorreo) {
        this.usuarioCorreo = usuarioCorreo;
    }

  /*  public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }*/

    public String getContrasea() {
        return Contrasea;
    }

    public void setContrasea(String Contrasea) {
        this.Contrasea = Contrasea;
    }

  /*  public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }*/

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
}



