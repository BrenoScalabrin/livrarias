/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import editora.autores;
import editora.bancoMysql;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diego.menegazzi
 */
public class autoresDAO {
    
    public void cadastrar(autores a){
        
        Connection conn = bancoMysql.conectaBanco();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
       
        try {
            stmt = conn.prepareStatement("INSERT INTO autores (nome,endereco,numero,bairro,cidade,cpf) VALUES (?,?,?,?,?,?");
            stmt.setString(1, a.getNome());
            stmt.setString(2, a.getEndereco());
            stmt.setInt(3, a.getNumero());
            stmt.setString(4, a.getBairro());
            stmt.setString(5, a.getCidade());
            stmt.setBigDecimal(6, new BigDecimal(a.getCpf()));
            
            stmt.executeUpdate();                        
            
            JOptionPane.showMessageDialog(null, "Autor cadastrada com sucesso!");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao cadastrar o autor! Por favor, tente mais tarde.");
             Logger.getLogger(autoresDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            
                                   
      
            
        
                
    }
}