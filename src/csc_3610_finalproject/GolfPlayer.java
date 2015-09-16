package csc_3610_finalproject;

/**
 * Class CSC3610
 * Programmer: T.J. Stankus
 * Date: 9/16/2015
 * Purpose: creates a GolfPlayer object to store the players: first name, last name, handicap, and score
 */
public class GolfPlayer {

    String firstName;
    String lastName;
    double handicap;
    double score;


    public GolfPlayer() {

    }

    public GolfPlayer(String firstName, String lastName, double handicap, double score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.handicap = handicap;
        this.score = score;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getHandicap() {
        return handicap;
    }

    public void setHandicap(double handicap) {
        this.handicap = handicap;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "GolfPlayer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", handicap=" + handicap +
                ", score=" + score +
                '}';
    }
}
