package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import forumuser.Forum;
import forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();

        Map<Integer, ForumUser> theResultMapOfUserss = theForum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> LocalDate.now().getYear() - user.getBirthDate().getYear() >= 20)
                .filter(user -> user.getNumberOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID, user -> user));

        System.out.println("# elements: " + theResultMapOfUserss.size());
        theResultMapOfUserss.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}