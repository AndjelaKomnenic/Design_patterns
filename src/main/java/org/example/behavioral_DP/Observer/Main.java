package org.example.behavioral_DP.Observer;

public class Main {
    public static void main(String[] args) {
        Subscriber user1 = new User("John");
        Subscriber user2 = new User("Alice");
        Subscriber user3 = new User("Bob");

        NewsPublisher newsPublisher = new NewsPublisher();

        newsPublisher.subscribe(user1);
        newsPublisher.subscribe(user2);
        newsPublisher.subscribe(user3);

        newsPublisher.publishArticle("Breaking News: Important Event");
        newsPublisher.publishArticle("Technology Advancements");
        newsPublisher.publishArticle("World Politics Update");

        newsPublisher.unsubscribe(user2);

        newsPublisher.publishArticle("Health and Wellness Tips");
    }
}
