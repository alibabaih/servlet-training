package eshop.dao.exception;

//system problem, i.e. you don't have access to the data base
public class DaoSystemException extends DaoException {

    public DaoSystemException(String message) {
        super(message);
    }

    public DaoSystemException(String message, Throwable cause) {
        super(message, cause);
    }

}
