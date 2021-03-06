/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eatary.ejbs;

import com.eatary.entities.EyDomains;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

/**
 *
 * @author devildamz
 */
@Stateless
public class EyDomainsFacade extends AbstractFacade<EyDomains> {
    @PersistenceContext(unitName = "the_eataryPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("the_eataryPU");
        em = emFactory.createEntityManager();
        return em;
    }

    public EyDomainsFacade() {
        super(EyDomains.class);
    }
    
}
