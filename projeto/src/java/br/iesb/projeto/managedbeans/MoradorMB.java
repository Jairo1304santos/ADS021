package br.iesb.projeto.managedbeans;

import br.iesb.projeto.dao.MoradorDAO;
import br.iesb.projeto.entitybeans.Morador;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "moradorMB")
@RequestScoped
public class MoradorMB implements Serializable {

    private Morador morador;
    private MoradorDAO dao;
    private List<Morador> lista;

    public MoradorMB() {
        this.morador = new Morador();
        this.dao = new MoradorDAO();
    }

    public Morador getMorador() {
        return morador;
    }

    public void setMorador(Morador morador) {
        this.morador = morador;
    }

    public List<Morador> getLista() {
        if (lista == null) {
            lista = dao.findAll();
        }
        return lista;
    }

    public void setLista(List<Morador> lista) {
        this.lista = lista;
    }

    public String criar() {
        this.morador = new Morador();
        return "/pages/morador/criar";
    }

    public String editar(Morador morador) {
        this.morador = morador;
        return "/pages/morador/criar";
    }

    public String remover(Morador morador) {
        dao.remove(morador);
        return "/pages/morador/listar?faces-redirect=true";
    }

    public String salvar(Morador morador) {
        if (morador.getId() == null) {
            dao.create(morador);
        } else {
            dao.edit(morador);
        }
        return "/pages/morador/listar?faces-redirect=true";
    }

}
