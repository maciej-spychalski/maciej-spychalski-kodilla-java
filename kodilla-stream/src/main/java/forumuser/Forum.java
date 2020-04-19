package forumuser;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(0001, "User1", 'M',
                LocalDate.of(2000, 1,18),1));
        theUserList.add(new ForumUser(0002, "User2", 'F',
                LocalDate.of(2000,2,17),2));
        theUserList.add(new ForumUser(0003, "User3", 'M',
                LocalDate.of(2005,3,16),1));
        theUserList.add(new ForumUser(0004, "User4", 'M',
                LocalDate.of(1990,4,15),0));
        theUserList.add(new ForumUser(0005, "User5", 'F',
                LocalDate.of(1995,5,14),0));
        theUserList.add(new ForumUser(0006, "User6", 'M',
                LocalDate.of(1998,6,13),5));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theUserList);
    }
}