package com.ge.exercise1;


import org.codehaus.jackson.map.ObjectMapper;

public class MyParser implements Parser {

    
    @Override
    public Application parseApplicationData(String data)  {

        ObjectMapper mapper = new ObjectMapper();

        try{
            
            Application app = mapper.convertValue(data, ApplicationEntity.class);
            return app;
        }catch(Exception e){
            return null;
        }
        

    }

}