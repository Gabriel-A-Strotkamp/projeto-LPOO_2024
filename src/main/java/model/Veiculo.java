/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vanessalagomachado
 */
public class Veiculo {
    private int id;
    private String placa;
    private String cor;
    private TipoVeiculo tipoVeiculo;
    
    
    private Modelo modelo;
    private List<EntradaSaida> listaMovimentacoes;
    private Pessoa proprietario;
    
    

    public Veiculo() {
        listaMovimentacoes = new ArrayList<>();
    }

    public Veiculo(String placa, TipoVeiculo tipoVeiculo) {
        this.placa = placa;
        this.tipoVeiculo = tipoVeiculo;
        listaMovimentacoes = new ArrayList<>();
    }
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
    
    public void addMovimentacao(EntradaSaida movimentacao){
        listaMovimentacoes.add(movimentacao);
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }

    public List<EntradaSaida> getListaMovimentacoes() {
        return listaMovimentacoes;
    }
    
    
    
}
