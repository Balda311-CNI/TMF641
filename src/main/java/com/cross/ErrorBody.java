package com.cross;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ErrorBody implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    private Integer code;
    private String message;
    private String task;

    public ErrorBody( Integer code, String message, String task ) {
        this.code = code;
        this.message = message;
        this.task = task;
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode( Integer code ) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage( String message ) {
        this.message = message;
    }

    public String getTask() {
        return this.task;
    }

    public void setTask( String task ) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "ErrorBody{" + "code=" + code + ", message='" + message + '\'' + ", task='" + task + '\'' + '}';
    }

}
