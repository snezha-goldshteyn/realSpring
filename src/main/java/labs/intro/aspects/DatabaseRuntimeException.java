package labs.intro.aspects;

public class DatabaseRuntimeException extends RuntimeException {
    @Override
    public String getMessage() {
        return "This is a huge exception";
    }
}
