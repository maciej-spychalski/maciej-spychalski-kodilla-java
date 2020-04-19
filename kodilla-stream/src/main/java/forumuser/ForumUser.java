package forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int userID;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int numberOfPosts;

    public ForumUser(final int userID, final String userName, final char sex, final LocalDate birthDate,
                     final int numberOfPosts) {
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.numberOfPosts = numberOfPosts;
    }

    public int getUserID() {
        return userID;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "User{" +
                "user name='" + userName + '\'' +
                ", sex='" + sex + '\'' +
                ", birth date='" + birthDate + '\'' +
                ", number of posts='" + numberOfPosts + '\'' +
                ", user ID='" + userID +  '\'' +
                '}';

    }
}