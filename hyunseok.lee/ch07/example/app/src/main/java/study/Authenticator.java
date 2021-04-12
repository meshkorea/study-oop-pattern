package study;

public abstract class Authenticator {
    public Auth authenticate(String id, String pw) {
        if (! doAuthenticate(id, pw))
            throw createException();

        return createAuth(id);
    }

    protected abstract Auth createAuth(String id);

    private RuntimeException createException() {
        throw new AuthException();
    }

    protected abstract boolean doAuthenticate(String id, String pw);

}
