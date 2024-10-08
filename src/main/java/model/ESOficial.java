/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vanessalagomachado
 */
public class ESOficial extends EntradaSaida{
    private int kmRegistrado;
    private Pessoa motorista;

    public ESOficial(TipoMovimentacao tipo, Veiculo veiculo, Pessoa motorista) {
        super(tipo, veiculo);
        this.motorista = motorista;
    }

    public int getKmRegistrado() {
        return kmRegistrado;
    }

    public void setKmRegistrado(int kmRegistrado) {
        this.kmRegistrado = kmRegistrado;
    }

    public Pessoa getMotorista() {
        return motorista;
    }

    public void setMotorista(Pessoa motorista) {
        this.motorista = motorista;
    }
    
    
}
