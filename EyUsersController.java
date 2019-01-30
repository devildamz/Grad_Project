package com.eatary.managedbeans;

import com.eatary.entities.EyUsers;
import com.eatary.ejbs.EyUsersFacade;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.annotation.PostConstruct;

@ManagedBean(name = "eyUsersController")
@ViewScoped
public class EyUsersController extends AbstractController<EyUsers> {

   
    private EyUsersFacade ejbFacade = new EyUsersFacade();

    /**
     * Initialize the concrete EyUsers controller bean. The AbstractController
     * requires the EJB Facade object for most operations.
     */
    @PostConstruct
    @Override
    public void init() {
        super.setFacade(ejbFacade);
    }

    public EyUsersController() {
        // Inform the Abstract parent controller of the concrete EyUsers?cap_first Entity
        super(EyUsers.class);
    }

}
