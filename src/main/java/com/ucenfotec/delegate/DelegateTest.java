package com.ucenfotec.delegate;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.inject.Named;
@Named
public class DelegateTest implements  JavaDelegate {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void execute(DelegateExecution delegateExecution) throws  Exception{
        String testFieldA = (String) delegateExecution.getVariable("test_field_a");
        String testFieldB =  (String) delegateExecution.getVariable("test_field_b");
        String testFieldC = (String) delegateExecution.getVariable("test_field_c");
        System.out.println(testFieldA);
        System.out.println(testFieldB);
        System.out.println(testFieldC);
        System.out.println("=============");
    }
}
