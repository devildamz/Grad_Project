package com.eatary.managedbeans;

import com.eatary.entities.EyLocations;
import com.eatary.ejbs.EyLocationsFacade;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.annotation.PostConstruct;

@ManagedBean(name = "eyLocationsController")
@ViewScoped
public class EyLocationsController extends AbstractController<EyLocations> {

 
    private EyLocationsFacade ejbFacade = new EyLocationsFacade();

    /**
     * Initialize the concrete EyLocations controller bean. The
     * AbstractController requires the EJB Facade object for most operations.
     */
    @PostConstruct
    @Override
    public void init() {
        super.setFacade(ejbFacade);
    }

    public EyLocationsController() {
        // Inform the Abstract parent controller of the concrete EyLocations?cap_first Entity
        super(EyLocations.class);
    }

}
