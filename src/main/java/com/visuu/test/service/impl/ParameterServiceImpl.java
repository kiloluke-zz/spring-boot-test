package com.visuu.test.service.impl;

import com.visuu.test.dao.ParameterDao;
import com.visuu.test.models.Parameter;
import com.visuu.test.service.ParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ParameterServiceImpl implements ParameterService {

    @Autowired
    private ParameterDao parameterDao;

    @Transactional
    public void addParameter(Parameter parameter) {
        parameterDao.addParameter(parameter);
    }

    @Transactional
    public void editParameter(Parameter parameter) {
        parameterDao.editParameter(parameter);
    }

    @Transactional
    public void deleteParameter(int id) {
        parameterDao.deleteParameter(id);
    }

    @Transactional
    public Parameter getParameter(int id) {
        return parameterDao.getParameter(id);
    }

    @Transactional
    public List getAllParameters() {
        return parameterDao.getAllParameters();
    }
}
