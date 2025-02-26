package org.example;
import com.fasterxml.jackson.databind.*;
public class P5_JacksonJSONStructure{
    public static void main(String[] args) {
        String st="{\"name\":\"Ayush\",\"age\":23}";
        ObjectMapper map=new ObjectMapper();
        try{
            JsonNode node=map.readTree(st);
            System.out.println("its valid");
        }catch(Exception e){
            System.out.println("invalid....");
        }
    }
}