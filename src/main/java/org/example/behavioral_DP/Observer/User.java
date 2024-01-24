package org.example.behavioral_DP.Observer;

public class User implements Subscriber{
    private String username;

    public User(String username) {
        this.username = username;
    }

    @Override
    public void update(String articleTitle) {
        System.out.println(username + " received a notification: New article - " + articleTitle);
    }
}
