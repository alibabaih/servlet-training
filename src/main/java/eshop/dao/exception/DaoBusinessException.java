package eshop.dao.exception;

public class DaoBusinessException extends DaoException {

    //root for all exceptions which connected to the business logic
    public DaoBusinessException(String message) {
        super(message);
    }

    public DaoBusinessException(String message, Throwable cause) {
        super(message, cause);
    }

}
