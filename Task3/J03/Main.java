package Task3.J03;

public class Main {
    public static void main(String[] args) {
        TouristPlace jaipur = new TouristPlace("Amer", "10:00AM to 5:00PM", 200);
        jaipur.addFamousFor("Jaipur History").addFamousFor("Maota Lake").addFamousFor("Mountains");

        jaipur.rate(5);
        jaipur.rate(4);
        jaipur.rate(3);

        System.out.print("Rating is " + jaipur.starRating);
    }
}
