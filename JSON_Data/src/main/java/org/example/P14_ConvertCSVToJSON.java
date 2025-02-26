package org.example;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.*;
import org.apache.commons.csv.*;
import java.io.*;
public class P14_ConvertCSVToJSON {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("sampleJson.json");
            CSVParser csv = new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader());
            ObjectMapper obj = new ObjectMapper();
            ArrayNode arr = obj.createArrayNode();

            for (CSVRecord record : csv) {
                ObjectNode jsonObject = obj.createObjectNode();
                record.toMap().forEach(jsonObject::put);
                arr.add(jsonObject);
            }
            String jsonOutput = obj.writerWithDefaultPrettyPrinter().writeValueAsString(arr);

            System.out.println("here we have convert json--> " + jsonOutput);

        } catch (IOException e) {
            System.err.println("there is an error here--> " + e.getMessage());
        }
    }
}