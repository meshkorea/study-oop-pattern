package study.pattern.template.ldap;

import study.pattern.template.Auth;
import study.pattern.template.Authenticator;

public class LdapAuthenticator extends Authenticator {

  private final LdapClient ldapClient;

  public LdapAuthenticator(LdapClient ldapClient) {
    this.ldapClient = ldapClient;
  }

  @Override
  protected boolean doAuthenticate(String id, String pw) {
    return ldapClient.authenticate(id, pw);
  }

  @Override
  protected Auth createAuth(String id) {
    LdapContext ctx = ldapClient.find(id);
    return new Auth();
  }
}
