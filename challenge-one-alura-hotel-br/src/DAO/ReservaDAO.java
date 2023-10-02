package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import model.Reserva;

public class ReservaDAO {
    private Connection connection;

    public ReservaDAO(Connection connection){
        this.connection = connection;
    }
    public void salvar(Reserva reserva) {
        try {
            String sql = "INSERT INTO reservas (data_entrada, data_saida, valor, ds_forma_pagamento) VALUES(?, ?, ?, ?)";
             try (PreparedStatement pstm = connection.prepareStatement(sql, Statement.KEEP_CURRENT_RESULT)) {
                
                pstm.setString(1, reserva.getDataEntradaFormatada());
                pstm.setString(2, reserva.getDataSaidaFormatada());
                pstm.setDouble(3, reserva.getValor());
                pstm.setString(4, reserva.getFormaPagamento());
                System.out.println(pstm.toString());
                pstm.execute();

             } 
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
