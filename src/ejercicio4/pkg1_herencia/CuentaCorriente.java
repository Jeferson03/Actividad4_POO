package ejercicio4.pkg1_herencia;

public class CuentaCorriente extends Cuenta{
    float sobregiro = 0;
    public CuentaCorriente(float saldo, float tasa_anual){
        super(saldo,tasa_anual);
    }
    public void retirar(float cantidad){
        float excedente = saldo - cantidad;
        if (excedente<0){
            sobregiro = sobregiro - excedente;
            saldo = 0;
        } else{
            super.retirar(cantidad);
        }
    }
    public void consignar(float cantidad){
        float residuo = sobregiro - cantidad;
        if (sobregiro>0){
            if (residuo > 0){
                sobregiro = 0;
                saldo = residuo;
            }else{
                sobregiro -= residuo;
                saldo = 0;
            }
        }else{
            super.consignar(cantidad);
        }
    }
    public void extractoMensual(){
        super.extractoMensual();
    }
    public void imprimir(){
         System.out.println("Saldo: $" + saldo + "\nComision mensual: $" + comision_mensual + "\nNumero de transacciones: " + (numero_consignaciones+numero_retiros) + "\nValor de sobregiro: $" + sobregiro +"\n");
        
    }
}
