package com.visuu.test.service;

import com.visuu.test.models.Parameter;

import java.util.List;

public interface ParameterService {

    public void addParameter(Parameter parameter);
    public void editParameter(Parameter parameter);
    public void deleteParameter(int id);
    public Parameter getParameter(int id);
    public List getAllParameters();


}
