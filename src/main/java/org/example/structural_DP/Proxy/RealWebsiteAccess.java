package org.example.structural_DP.Proxy;

public class RealWebsiteAccess implements WebsiteAccess{
    @Override
    public void visitWebsite(String username) {
        System.out.println("User " + username + " is visiting the website.");
    }
}
