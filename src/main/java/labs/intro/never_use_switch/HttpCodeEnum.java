package labs.intro.never_use_switch;

public enum HttpCodeEnum {
    INFO(100, 199),
    SUCCESS(200, 299),
    REDIRECTION(300, 399);

    private final int min;
    private final int max;

    HttpCodeEnum(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public static HttpCodeEnum findByHttpCode(int code) throws IllegalStateException{
        HttpCodeEnum[] enums = values();
        for (HttpCodeEnum anEnum : enums) {
            if (anEnum.min <= code && code <= anEnum.max) {
                return anEnum;
            }
        }
        throw new IllegalStateException(code + " not in supported range");
    }
}
