package study;

public class LdapAuthenticator extends Authenticator {
    @Override
    protected Auth createAuth(String id) {
        ldapContext ctx = ldapClient.find(id);
        return new Auth(id, ctx.getAttribute("name"));
    }

    @Override
    protected boolean doAuthenticate(String id, String pw) {
        return ldapClient.authenticate(id, pw);

    }
}
