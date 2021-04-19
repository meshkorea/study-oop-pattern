/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package study;

import java.util.ArrayList;

public class TemplateMethodPatternApp {

    public static void main(String[] args) {
        DbAuthenticator authenticator = new DbAuthenticator();

        try {
            Auth auth = authenticator.authenticate("id", "pw");    
            System.out.println(auth.getUsername());
        } catch (Exception e) {
            System.out.println("exception 발생!");
        }    
    }
}