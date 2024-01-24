package org.example.structural_DP.Proxy;

public class ProxyWebsiteAccess implements WebsiteAccess{

    private RealWebsiteAccess realWebsiteAccess;
    private String bannedUser;

    public ProxyWebsiteAccess(String bannedUser) {
        this.bannedUser = bannedUser;
    }

    @Override
    public void visitWebsite(String username) {
        if (isUserBanned(username)) {
            System.out.println("Access denied. User " + username + " is banned.");
        } else {
            if (realWebsiteAccess == null) {
                realWebsiteAccess = new RealWebsiteAccess();
            }
            realWebsiteAccess.visitWebsite(username);
        }
    }

    private boolean isUserBanned(String username) {
        return username.equals(bannedUser);
    }
}
