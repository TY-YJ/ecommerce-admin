package problem3;

public class Identifier {
    private String username;
    private String yearCreated;
    private String country;

    public Identifier(String username, String yearCreated, String country) {
        this.username = username;
        this.yearCreated = yearCreated;
        this.country = country;
    }

    public String getUsername() {
        return username;
    }

    public String getYearCreated() {
        return yearCreated;
    }

    public String getCountry() {
        return country;
    }

}
