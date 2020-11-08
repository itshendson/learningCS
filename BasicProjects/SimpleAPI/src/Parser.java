import java.util.Date;

public class Parser {

    //Elements
    private String country;
    private int newConfirmed;
    private int totalConfirmed;
    private int newDeaths;
    private int totalDeaths;
    private int newRecovered;
    private int totalRecovered;

    //Element setters
    public void setCountry(String country) {
        this.country = country;
    }

    public void setNewConfirmed(int newConfirmed) {
        this.newConfirmed = newConfirmed;
    }

    public void setTotalConfirmed(int totalConfirmed) {
        this.totalConfirmed = totalConfirmed;
    }

    public void setNewDeaths(int newDeaths) {
        this.newDeaths = newDeaths;
    }

    public void setTotalDeaths(int totalDeaths) {
        this.totalDeaths = totalDeaths;
    }

    public void setNewRecovered(int newRecovered) {
        this.newRecovered = newRecovered;
    }

    public void setTotalRecovered(int totalRecovered) {
        this.totalRecovered = totalRecovered;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    //Element getters
    public String getCountry() {
        return country;
    }

    public int getNewConfirmed() {
        return newConfirmed;
    }

    public int getTotalConfirmed() {
        return totalConfirmed;
    }

    public int getNewDeaths() {
        return newDeaths;
    }

    public int getTotalDeaths() {
        return totalDeaths;
    }

    public int getNewRecovered() {
        return newRecovered;
    }

    public int getTotalRecovered() {
        return totalRecovered;
    }

    public Date getDate() {
        return date;
    }

    private Date date;

}
