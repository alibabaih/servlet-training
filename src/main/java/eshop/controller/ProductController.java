package eshop.controller;


import eshop.Product;
import eshop.dao.ProductDao;
import eshop.dao.exception.DaoSystemException;
import eshop.dao.impl.ProductDaoMock;

import javax.ejb.NoSuchEntityException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ProductController extends HttpServlet {
    public static final String PARAM_ID = "id";
    public static final String ATTRIBUTE_MODEL_TO_VIEW = "product";
    public static final String PAGE_OK = "product.jsp";
    public static final String PAGE_ERROR = "error.jsp";

    //field of the controller
    private ProductDao productDao = new ProductDaoMock();

    @Override
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String idStr = request.getParameter(PARAM_ID); //couple key and value which shows in browser address field
        //String idStr = request.getAttribute(PARAM_ID); //
        //String idStr = request.getAttribute(PARAM_ID); //data which go from outside, data which entered user
        if (idStr != null) {
            try {
                Integer id = Integer.valueOf(idStr);
                Product model = productDao.selectById(id);
                request.setAttribute(ATTRIBUTE_MODEL_TO_VIEW, model);
                //OK
                //request.getRequestDispatcher(PAGE_OK).forward(request, response);
                //return;
                //OR
                RequestDispatcher dispatcher = request.getRequestDispatcher(PAGE_OK);
                dispatcher.forward(request, response); //inner (internal) redirect
                return;

            } catch (NumberFormatException | NoSuchEntityException | DaoSystemException e) {
                //NOP
            } catch (eshop.dao.exception.NoSuchEntityException e) {
                e.printStackTrace();
            }
        }
        //IF FAIL
        response.sendRedirect(PAGE_ERROR); //outer (external) redirect
    }


}
