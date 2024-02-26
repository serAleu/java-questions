package patterns.behavioral.chain_of_responsibility.example1.server;

import patterns.behavioral.chain_of_responsibility.example1.middleware.Middleware;

import java.util.HashMap;
import java.util.Map;

public class Server {
    private Map<String, String> users = new HashMap<>();
    private Middleware middleware;

    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    public boolean logIn(String email, String password) {
        if(middleware.check(email, password)) {
            System.out.println("Authorization have been successful!");
            // Здесь должен быть какой-то полезный код, работающий для
            // авторизированных пользователей.
            return true;
        }
        return false;
    }

    public void register(String email, String password) {
        users.put(email, password);
    }

    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }
}
