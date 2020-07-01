package br.iesb.projeto.dao;

import br.iesb.projeto.entitybeans.Morador;
import java.io.Serializable;


public class MoradorDAO extends AbstractDAO<Morador> implements Serializable{

    public MoradorDAO() {
        super(Morador.class);
    }
    
    
}
