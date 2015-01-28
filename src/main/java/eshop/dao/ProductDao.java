package eshop.dao;

import eshop.Product;
import eshop.dao.exception.DaoSystemException;
import eshop.dao.exception.NoSuchEntityException;

import java.util.List;

//CRUD operations
//create = SQL/insert = List/add
//read = SQL/insert = List/get
//update = SQL/update = List/set
//delete = SQL/delete = List/remove

public interface ProductDao {

    //select by primary key, method never return null, if items is missing throw NoSuchEntityException
    public Product selectById(int id) throws DaoSystemException, NoSuchEntityException;

    public List<Product> selectAll() throws DaoSystemException;
}
