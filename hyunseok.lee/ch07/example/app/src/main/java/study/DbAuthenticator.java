package study;

public class DbAuthenticator extends Authenticator{
    @Override
    protected Auth createAuth(String id) {
        User user = userDao.selectById(id);
        return new Auth(id, user.getUserName());
    }

    @Override
    protected boolean doAuthenticate(String id, String pw) {
        User user = userDao.selectById(id);
        boolean auth = user.equalPassword(pw);
        return auth;
    }
}
