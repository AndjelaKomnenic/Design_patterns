package org.example.structural_DP.Proxy;

public class Main {
    public static void main(String[] args) {
        WebsiteAccess proxy = new ProxyWebsiteAccess("bannedUser123");

        proxy.visitWebsite("JohnDoe");          // Allowed
        proxy.visitWebsite("bannedUser123");    // Denied
        proxy.visitWebsite("Alice");            // Allowed
    }
}
