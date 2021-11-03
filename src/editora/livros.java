/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editora;


import editora.autores;
import editora.editoras;
import java.sql.Date;
/**
 *
 * @author breno
 */
public class livros {
    private int id_livro;
    private int id_editora;
    private int id_autor;
    private String titulo;
    private Date ano;
    private editoras editora;
    private autores autor;
    
    public int getId_livro() {
        return id_livro;
    }

    public int getId_editora() {
        return id_editora;
    }

    public int getId_autor() {
        return id_autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public Date getAno() {
        return ano;
    }

    public editoras getEditora() {
        return editora;
    }

    public autores getAutor() {
        return autor;
    }
    
}
