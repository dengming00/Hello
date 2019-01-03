package com.ming.Exception;

/**
 * 自定义异常类
 */
public class SysException extends Exception {
    private String message;

    public SysException() {
    }

    public SysException(String message) {

        this.message = message;
    }

    @Override
    public String toString() {
        return "SysException{" +
                "message='" + message + '\'' +
                '}';
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
