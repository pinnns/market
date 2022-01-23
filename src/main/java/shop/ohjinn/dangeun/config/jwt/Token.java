package shop.ohjinn.dangeun.config.jwt;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class Token {

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static final class Request{
        private String id;
        private String secret;
    }

    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static final class Response{
        private String token;
    }
}
