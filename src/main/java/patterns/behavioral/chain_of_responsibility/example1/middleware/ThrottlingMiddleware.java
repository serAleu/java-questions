package patterns.behavioral.chain_of_responsibility.example1.middleware;

/**
 * Здесь и в других классах наследующих Middleware конкретный
 * элемент цепи обрабатывает запрос по своему
 */
public class ThrottlingMiddleware extends Middleware {
    private int requestPerMinute;
    private int request;
    private long currentTime;

    public ThrottlingMiddleware(int requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
        this.currentTime = System.currentTimeMillis();
    }

    /**
     * При вызове checkNext() вызывается check() конкретной реализации от
     * Middleware
     */
    @Override
    public boolean check(String email, String password) {
        if(System.currentTimeMillis() > currentTime + 60000) {
            request = 0;
            currentTime = System.currentTimeMillis();
        }
        request++;
        if(request > requestPerMinute) {
            System.out.println("Request limit exceeded!");
            Thread.currentThread().stop();
        }
        return checkNext(email, password);
    }
}
