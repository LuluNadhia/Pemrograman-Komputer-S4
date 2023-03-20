package thread;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author HP VICTUS
 */
public class CurrencyConversionResponse {
    private String base;
    private String date;
    private Map<String, String> rates = new TreeMap<>();
    

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Map<String, String> getRates() {
        return rates;
    }

    public void setRates(Map<String, String> rates) {
        this.rates = rates;
    }
    
    
}
