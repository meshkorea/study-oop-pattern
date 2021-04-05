package study;

public class DbAuthenticator {
    public Auth authenticate(String id, String pw) throws Exception {
        User user = userDao.selectById(id);
        boolean auth = user.equalPassword(pw);

        if(! auth) {
            throw createException();
        }

        return new Auth(id, user.getUserName());
    }

    private Exception createException() {
        return new AuthException();
    }
}
