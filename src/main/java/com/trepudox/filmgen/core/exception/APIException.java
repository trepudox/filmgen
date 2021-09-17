package com.trepudox.filmgen.core.exception;

import lombok.Getter;

@Getter
public class APIException extends RuntimeException {

    private final String title;
    private final String detail;
    private final ExceptionCode code;

    public APIException(String title, String detail, ExceptionCode code) {
        super(detail);
        this.title = title;
        this.detail = detail;
        this.code = code;
    }

}
