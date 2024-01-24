package org.example.behavioral_DP.Observer;

import java.util.ArrayList;
import java.util.List;

public class NewsPublisher {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String latestArticleTitle;

    public void subscribe(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(){
        for (Subscriber subscriber : subscribers) {
            subscriber.update(latestArticleTitle);
        }
    }

    public void publishArticle(String articleTitle) {
        this.latestArticleTitle = articleTitle;
        notifySubscribers();
    }
}
