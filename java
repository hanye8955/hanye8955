package com.sun.content.server.operator.security.adaptor; 
import com.sun.content.server.service.security.User; 
import java.util.Date; 
import java.util.Hashtable; 
 
public class SampleUserImpl implements User 
{ 
 
    private Hashtable fInfo; 
 
    public SampleUserImpl() { 
 
        fInfo = new Hashtable(); 
 
        setLoginId("guest"); 
        setFirstName("guest"); 
