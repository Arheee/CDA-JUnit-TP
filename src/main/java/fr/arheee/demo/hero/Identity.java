package fr.arheee.demo.hero;

public class Identity {
    private String firstName;
    private String lastName;
    private String job;

    public Identity(String firstName, String lastName, String job) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.job = job;
    }

    /**
     *
     * @return
     */
    public String getIdentity() {
        return this.firstName + " " + this.lastName + " " + this.job;
    }
}
