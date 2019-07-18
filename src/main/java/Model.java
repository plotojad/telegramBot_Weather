public class Model {

    private String name;
    private Integer temp;
    private Integer humidity;
    private String icon;
    private String main;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTemp() {
        return temp;
    }

    public void setTemp(Integer temp) {
        this.temp = temp;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer wet) {
        this.humidity = wet;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getMain() {
        switch (main) {
            case "Thunderstorm":
                return "Гроза";
            case "Drizzle":
                return "Заморозки";
            case "Rain":
                return "Дождь";
            case "Snow":
                return "Снег";
            case "Mist":
                return "Дымка";
            case "Smoke":
                return "Дым";
            case "Haze":
                return "Мгла";
            case "Dust":
                return "Пыль";
            case "Fog":
                return "Туман";
            case "Sand":
                return "Песок";
            case "Ash":
                return "Пепел";
            case "Squall":
                return "Шквал";
            case "Tornado":
                return "Торнадо";
            case "Clear":
                return "Ясно";
            case "Clouds":
                return "Облачно";
            default:
                return main;
        }
    }

    public void setMain(String rain) {
        this.main = rain;
    }
}
