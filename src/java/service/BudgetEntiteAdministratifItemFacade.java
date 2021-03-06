/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.BudgetEntiteAdministratifItem;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author lenovo
 */
@Stateless
public class BudgetEntiteAdministratifItemFacade extends AbstractFacade<BudgetEntiteAdministratifItem> {

    @PersistenceContext(unitName = "budget_en_ligne_3PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BudgetEntiteAdministratifItemFacade() {
        super(BudgetEntiteAdministratifItem.class);
    }
    
}
