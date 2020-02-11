import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


import java.io.IOException;

public class ElTiempo {
    public static void main(String[]args) throws IOException {

        Document doc = Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").userAgent("Mozilla").get();
        Elements ElementoTemperatura= doc.getElementsByClass("today_nowcard-temp");
        Elements ElementoTiempo= doc.getElementsByClass("today_nowcard-phrase");
        String Titulo= doc.title();
        String Temperatura=ElementoTemperatura.text();
        String Tiempo=ElementoTiempo.text();
        System.out.println("La página es "+Titulo+ "La temperaturaes de: " +Temperatura+ " y esta "+Tiempo);
    }

}