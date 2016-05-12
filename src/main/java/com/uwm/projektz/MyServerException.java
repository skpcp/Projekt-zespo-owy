package com.uwm.projektz;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

/**
 * Created by Tomasz Komoszeski on 2016-05-11.
 */
public class MyServerException extends Exception {
    HttpStatus status;
    HttpHeaders headers;

    public MyServerException(String message, HttpStatus status) {
        super(message);
        this.status = status;
        this.headers = new HttpHeaders();
        this.headers.add("state",message);
    }


    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public HttpHeaders getHeaders() {
        return headers;
    }

    public void setHeaders(HttpHeaders headers) {
        this.headers = headers;
    }
}
