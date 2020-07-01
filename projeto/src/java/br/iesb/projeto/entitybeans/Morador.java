
package br.iesb.projeto.entitybeans;

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
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "moradores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Morador.findAll", query = "SELECT m FROM Morador m")
    , @NamedQuery(name = "Morador.findById", query = "SELECT m FROM Morador m WHERE m.id = :id")
    , @NamedQuery(name = "Morador.findByMatricula", query = "SELECT m FROM Morador m WHERE m.matricula = :matricula")
    , @NamedQuery(name = "Morador.findByNome", query = "SELECT m FROM Morador m WHERE m.nome = :nome")
    , @NamedQuery(name = "Morador.findByTelefone", query = "SELECT m FROM Morador m WHERE m.telefone = :telefone")
    , @NamedQuery(name = "Morador.findByCpf", query = "SELECT m FROM Morador m WHERE m.cpf = :cpf")
    , @NamedQuery(name = "Morador.findByEmail", query = "SELECT m FROM Morador m WHERE m.email = :email")
    , @NamedQuery(name = "Morador.findByEndereco", query = "SELECT m FROM Morador m WHERE m.endereco = :endereco")
    , @NamedQuery(name = "Morador.findByCep", query = "SELECT m FROM Morador m WHERE m.cep = :cep")
    , @NamedQuery(name = "Morador.findByBairro", query = "SELECT m FROM Morador m WHERE m.bairro = :bairro")
    , @NamedQuery(name = "Morador.findByUf", query = "SELECT m FROM Morador m WHERE m.uf = :uf")
    , @NamedQuery(name = "Morador.findByMunicipio", query = "SELECT m FROM Morador m WHERE m.municipio = :municipio")})
public class Morador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "matricula")
    private int matricula;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "telefone")
    private int telefone;
    @Basic(optional = false)
    @Column(name = "cpf")
    private int cpf;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "endereco")
    private String endereco;
    @Basic(optional = false)
    @Column(name = "cep")
    private int cep;
    @Basic(optional = false)
    @Column(name = "bairro")
    private String bairro;
    @Basic(optional = false)
    @Column(name = "uf")
    private String uf;
    @Basic(optional = false)
    @Column(name = "municipio")
    private String municipio;

    public Morador() {
    }

    public Morador(Integer id) {
        this.id = id;
    }

    public Morador(Integer id, int matricula, String nome, int telefone, int cpf, String email, String endereco, int cep, String bairro, String uf, String municipio) {
        this.id = id;
        this.matricula = matricula;
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.cep = cep;
        this.bairro = bairro;
        this.uf = uf;
        this.municipio = municipio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
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
        if (!(object instanceof Morador)) {
            return false;
        }
        Morador other = (Morador) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.iesb.projeto.entitybeans.Morador[ id=" + id + " ]";
    }
    
}
