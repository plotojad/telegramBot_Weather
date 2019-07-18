import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class Weather {

//    4c5b8bf19c78b1a26fd5ccde9ec5b77d

    public static String getWeather(String message, Model model) throws IOException {
        URL url = new URL("https://api.openweathermap.org/data/2.5/weather?q=" + message + "&units=metric&appid=4c5b8bf19c78b1a26fd5ccde9ec5b77d");
        Scanner in = new Scanner((InputStream) url.getContent());
        String result = "";
        while (in.hasNext()) {
            result += in.nextLine();
        }

        JSONObject object = new JSONObject(result);
        model.setName(object.getString("name"));

        JSONObject main = object.getJSONObject("main");
        model.setTemp(main.getInt("temp"));
        model.setHumidity(main.getInt("humidity"));

        JSONArray getArray = object.getJSONArray("weather");
        for (int i = 0; i < getArray.length(); i++) {
            JSONObject obj = getArray.getJSONObject(i);
            model.setIcon((String) obj.get("icon"));
            model.setMain((String) obj.get("main"));
        }

//        SendPhoto sendPhoto = new SendPhoto();
//        sendPhoto.setPhoto("http://openweathermap.org/img/wn/" + model.getIcon() + ".png");

        return "Город: " + model.getName() + "\n" +
                model.getMain() + "\n" +
                "Температура: " + model.getTemp() + "\u2103" + "\n" +
                "Влажность: " + model.getHumidity() + "%";
    }
}
