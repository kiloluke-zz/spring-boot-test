package com.visuu.test.dao.impl;

import com.visuu.test.dao.ParameterDao;
import com.visuu.test.models.Item;
import com.visuu.test.models.Parameter;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by kyle on 27.02.17.
 */
@Repository
public class ParameterDaoImpl implements ParameterDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addParameter(Parameter parameter) {
        sessionFactory.getCurrentSession().save(parameter);
    }

    @Override
    public void editParameter(Parameter parameter) {
        sessionFactory.getCurrentSession().update(parameter);
    }

    @Override
    public void deleteParameter(int id) {

        sessionFactory.getCurrentSession().delete(getParameter(id));
    }

    @Override
    public Parameter getParameter(int id) {
        return (Parameter) sessionFactory.getCurrentSession().get(Parameter.class, id);
    }

    @Override
    public List getAllParameters() {
        return sessionFactory.getCurrentSession().createQuery("from Parameter").list();
    }
}
