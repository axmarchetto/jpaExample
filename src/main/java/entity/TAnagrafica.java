/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Andrea
 */
@Entity
@Table(name = "t_anagrafica")
@NamedQueries({
    @NamedQuery(name = "TAnagrafica.findAll", query = "SELECT t FROM TAnagrafica t"),
    @NamedQuery(name = "TAnagrafica.findById", query = "SELECT t FROM TAnagrafica t WHERE t.id = :id"),
    @NamedQuery(name = "TAnagrafica.findByNome", query = "SELECT t FROM TAnagrafica t WHERE t.nome = :nome"),
    @NamedQuery(name = "TAnagrafica.findByCognome", query = "SELECT t FROM TAnagrafica t WHERE t.cognome = :cognome")})
public class TAnagrafica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "cognome")
    private String cognome;

    public TAnagrafica() {
    }

    public TAnagrafica(Integer id) {
        this.id = id;
    }

    public TAnagrafica(Integer id, String cognome) {
        this.id = id;
        this.cognome = cognome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TAnagrafica)) {
            return false;
        }
        TAnagrafica other = (TAnagrafica) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.TAnagrafica[ id=" + id + " ]";
    }
    
}
