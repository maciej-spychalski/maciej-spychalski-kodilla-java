package com.kodilla.stream.immutable;

public final class ForumUser {
    private final String username;
    private final String realNam;

    public ForumUser(final String username, final String realNam) {
        this.username = username;
        this.realNam = realNam;
    }

    public String getUsername() {
        return username;
    }

    public String getRealNam() {
        return realNam;
    }
}
