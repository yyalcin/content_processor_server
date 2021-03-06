/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unicauca.stcav.persistence.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author johaned
 */
@Entity
@Table(name = "Chat", catalog = "stcav1", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Chat.findAll", query = "SELECT c FROM Chat c"),
    @NamedQuery(name = "Chat.findByIdChat", query = "SELECT c FROM Chat c WHERE c.idChat = :idChat"),
    @NamedQuery(name = "Chat.findByComunidadidComunidad", query = "SELECT c FROM Chat c WHERE c.comunidadidComunidad = :comunidadidComunidad"),
    @NamedQuery(name = "Chat.findByEstampa", query = "SELECT c FROM Chat c WHERE c.estampa = :estampa"),
    @NamedQuery(name = "Chat.findByUsuarioidUsuario", query = "SELECT c FROM Chat c WHERE c.usuarioidUsuario = :usuarioidUsuario")})
public class Chat implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idChat")
    private Long idChat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Comunidad_idComunidad")
    private long comunidadidComunidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Estampa")
    @Temporal(TemporalType.TIMESTAMP)
    private Date estampa;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Mensaje")
    private String mensaje;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Usuario_idUsuario")
    private long usuarioidUsuario;

    public Chat() {
    }

    public Chat(Long idChat) {
        this.idChat = idChat;
    }

    public Chat(Long idChat, long comunidadidComunidad, Date estampa, long usuarioidUsuario) {
        this.idChat = idChat;
        this.comunidadidComunidad = comunidadidComunidad;
        this.estampa = estampa;
        this.usuarioidUsuario = usuarioidUsuario;
    }

    public Long getIdChat() {
        return idChat;
    }

    public void setIdChat(Long idChat) {
        this.idChat = idChat;
    }

    public long getComunidadidComunidad() {
        return comunidadidComunidad;
    }

    public void setComunidadidComunidad(long comunidadidComunidad) {
        this.comunidadidComunidad = comunidadidComunidad;
    }

    public Date getEstampa() {
        return estampa;
    }

    public void setEstampa(Date estampa) {
        this.estampa = estampa;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public long getUsuarioidUsuario() {
        return usuarioidUsuario;
    }

    public void setUsuarioidUsuario(long usuarioidUsuario) {
        this.usuarioidUsuario = usuarioidUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idChat != null ? idChat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Chat)) {
            return false;
        }
        Chat other = (Chat) object;
        if ((this.idChat == null && other.idChat != null) || (this.idChat != null && !this.idChat.equals(other.idChat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.unicauca.stcav.persistence.entities.Chat[ idChat=" + idChat + " ]";
    }
    
}
