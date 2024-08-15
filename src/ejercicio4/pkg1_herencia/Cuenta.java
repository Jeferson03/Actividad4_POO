
package ejercicio4.pkg1_herencia;


public class Cuenta {
    protected float saldo, tasa_anual;
    protected int numero_consignaciones = 0;
    protected int numero_retiros = 0;
    protected float comision_mensual = 0;
    public Cuenta(float saldo, float tasa_anual){
        this.saldo =  saldo;
        this.tasa_anual = tasa_anual;
    }
    public void consignar(float cantidad){
        saldo = saldo + cantidad;
        numero_consignaciones += 1;
    }
    public void retirar(float cantidad){
        if (cantidad>saldo){
           System.out.println("No tienes dinero suficiente");
        }else{
            saldo = saldo - cantidad;
            numero_retiros += 1;
        }       
    }
    public void extractoMensual(){
        saldo -= comision_mensual;
        interesMensual();
    }
    public void interesMensual(){        
        float interes_mensual = saldo * (tasa_anual/12);
        saldo += interes_mensual;
    }
    public void imprimir(){
        System.out.println("Saldo: $" + saldo + "\nComision mensual: $" + comision_mensual + "\nNumero de transacciones: " + (numero_consignaciones+numero_retiros)+ "\n");
        
    }
}
