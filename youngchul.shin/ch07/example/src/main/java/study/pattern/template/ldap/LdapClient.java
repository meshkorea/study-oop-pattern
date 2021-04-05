package study.pattern.template.ldap;

public class LdapClient {

  public boolean authenticate(String id, String pw) {
    return true;
  }

  public LdapContext find(String id) {
    return new LdapContext();
  }
}
