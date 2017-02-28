package com.visuu.test.dao.impl;

import com.visuu.test.dao.ItemParameterDao;
import com.visuu.test.models.Item;
import com.visuu.test.models.ItemParameter;
import com.visuu.test.models.Parameter;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ItemParamaterDaoImpl implements ItemParameterDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void setValue(Item item, Parameter parameter, String value) {
        sessionFactory.getCurrentSession().update(new ItemParameter(item, parameter, value));
    }

    @Override
    public String getValue(Item item, Parameter parameter) {
        Query query = sessionFactory
                .getCurrentSession()
                .createQuery("from ItemParameter where parameter_id = "
                        + parameter.getId() + " AND item_id = " + item.getId());
        ItemParameter itemParameter = (ItemParameter) query.uniqueResult();

        return itemParameter.getValue();
    }

    @Override
    public void removeValue(Item item, Parameter parameter) {
        Query query = sessionFactory
                .getCurrentSession()
                .createQuery("from ItemParameter where parameter_id = "
                        + parameter.getId() + " AND item_id = " + item.getId());
        ItemParameter itemParameter = (ItemParameter) query.uniqueResult();
        sessionFactory.getCurrentSession().delete(itemParameter);

    }


}
