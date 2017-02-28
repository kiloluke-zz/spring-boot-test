package com.visuu.test.dao;

import com.visuu.test.models.Item;
import com.visuu.test.models.Parameter;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by kyle on 27.02.17.
 */
public interface ParameterDao {

    public void addParameter(Parameter parameter);
    public void editParameter(Parameter parameter);
    public void deleteParameter(int id);
    public Parameter getParameter(int id);
    public List getAllParameters();

}
