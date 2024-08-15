package ejercicio4.pkg1_herencia;


public class CuentaAhorros extends Cuenta{
    private boolean activa;
    public CuentaAhorros(float saldo, float tasa_anual){
        super(saldo,tasa_anual);
        if (saldo>=10000){
            activa = true;
        }else{
            activa = false;
        }
        
    }
    public void consignar(float cantidad){
        if (activa == true){
            super.consignar(cantidad);
        }
    }
    public void retirar(float cantidad){
         if (activa)
            super.retirar(cantidad);
        }
    
    public void extractoMensual(){
        if (numero_retiros>4){
            comision_mensual += (numero_retiros-4) * 1000;            
         }
        super.extractoMensual();
        if (saldo<10000){
            activa = false;
        }        
    }
    public void imprimir(){
        super.imprimir();        
    }
}
