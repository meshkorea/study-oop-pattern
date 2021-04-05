package study;

public class LdapAuthenticator {
    public Auth authenticate(String id, String pw) {
        boolean auth = ldapClient.authenticate(id, pw);

        if(! auth) {
            throw createException();
        }

        ldapContext ctx = ldapClient.find(id);

        return new Auth(id, ctx.getAttribute("name"));
    }

    private Exception createException() {
        return new AuthException();
    }
}
