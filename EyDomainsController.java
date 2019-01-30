package com.eatary.managedbeans;

import com.eatary.entities.EyDomains;
import com.eatary.ejbs.EyDomainsFacade;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.annotation.PostConstruct;

@ManagedBean(name = "eyDomainsController")
@ViewScoped
public class EyDomainsController extends AbstractController<EyDomains> {

    
    private EyDomainsFacade ejbFacade = new EyDomainsFacade();

    /**
     * Initialize the concrete EyDomains controller bean. The AbstractController
     * requires the EJB Facade object for most operations.
     */
    @PostConstruct
    @Override
    public void init() {
        super.setFacade(ejbFacade);
    }

    public EyDomainsController() {
        // Inform the Abstract parent controller of the concrete EyDomains?cap_first Entity
        super(EyDomains.class);
    }

}
