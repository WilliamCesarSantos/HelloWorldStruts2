package br.ada.americadas.struts.helloworldstruts.customer;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import java.util.List;

@Namespace("/customer")
public class ListAction extends ActionSupport {

    private List<Customer> customers;
    private CustomerService service;

    public ListAction() {
        CustomerDAO dao = new CustomerDAO();
        this.service = new CustomerService(dao);
    }

    @Override
    @Action(value = "list_customer", results = {
            @Result(name = SUCCESS, location = "/customer/list.jsp")
    })
    public String execute() throws Exception {
        this.customers = this.service.findAll();
        return SUCCESS;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

}
