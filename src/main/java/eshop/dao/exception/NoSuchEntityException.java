package eshop.dao.exception;

//нет такой сущности, i.e. don't have such user or product
public class NoSuchEntityException extends DaoBusinessException {

    public NoSuchEntityException(String message) {
        super(message);
    }

    public NoSuchEntityException(String message, Throwable cause) {
        super(message, cause);

    }

}
