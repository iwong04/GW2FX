package sample;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    String inline = "";

    {
        try {
            URL url = new URL("http://api.gw2tp.com/1/bulk/items.json");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int responsecode = conn.getResponseCode();
            if (responsecode != 200)
                throw new RuntimeException("HttpResponseCode: " + responsecode);
            else {
                Scanner sc = new Scanner(url.openStream());
                while (sc.hasNext()) {
                    inline += sc.nextLine();
                }
            }
            JsonParser parse = new JsonParser();
            JsonObject jobj = (JsonObject) parse.parse(inline);
            JsonElement updated = jobj.get("updated");
            JsonArray jsonarr_1 = (JsonArray) jobj.get("items");
            JsonArray jsonarr_2 = (JsonArray) jobj.get("columns");
            System.out.println(jsonarr_2);
            for (int i = 0; i < jsonarr_1.size(); i++) {
                System.out.println(jsonarr_1.get(0));
            }



            JsonArray ids = new JsonArray();
            JsonArray buy = new JsonArray();
            JsonArray sell = new JsonArray();
            JsonArray supply= new JsonArray();
            JsonArray demand = new JsonArray();



            System.out.println(jsonarr_2);
            for (int i = 0; i < jsonarr_1.size(); i++) {
                ids.add(jsonarr_1.get(i).getAsJsonArray().get(0));
                buy.add(jsonarr_1.get(i).getAsJsonArray().get(1));
                sell.add(jsonarr_1.get(i).getAsJsonArray().get(2));
                supply.add(jsonarr_1.get(i).getAsJsonArray().get(3));
                demand.add(jsonarr_1.get(i).getAsJsonArray().get(4));

            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


