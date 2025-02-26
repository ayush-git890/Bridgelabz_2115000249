package org.example;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.*;
import java.io.*;

public class IPLAndCensorAnalyzer{
    public static void main(String[] args) throws IOException {
        processJSON("ipl_data.json", "censored_ipl_data.json");
        processCSV("ipl_data.csv", "censored_ipl_data.csv");
    }
    private static void processJSON(String s1, String s2) throws IOException {
        ObjectMapper map = new ObjectMapper();
        JsonNode root = map.readTree(new File(s1));

        for (JsonNode m : root) {
            ((ObjectNode) m).put("team1", censorTeamName(m.get("team1").asText()));
            ((ObjectNode) m).put("team2", censorTeamName(m.get("team2").asText()));
            ((ObjectNode) m).put("winner", censorTeamName(m.get("winner").asText()));
            ((ObjectNode) m).put("player_of_match", "REDACTED");
        }

        map.writerWithDefaultPrettyPrinter().writeValue(new File(s2), root);
        System.out.println("Censored JSON data written to " + s2);
    }
    private static void processCSV(String s1, String s2) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(s1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(s2));

        String header = reader.readLine();
        writer.write(header + "\n");

        String st;
        while ((st = reader.readLine()) != null) {
            String[] arr = st.split(",");
            arr[1] = censorTeamName(arr[1]);
            arr[2] = censorTeamName(arr[2]);
            arr[5] = censorTeamName(arr[5]);
            arr[6] = "REDACTED";
            writer.write(String.join(",", arr));
        }

        reader.close();
        writer.close();
        System.out.println("Censored CSV data written to " + s2);
    }
    private static String censorTeamName(String teamName) {
        String[] words = teamName.split(" ");
        if (words.length > 1) {
            words[1] = "***";
        }
        return String.join(" ", words);
    }
}