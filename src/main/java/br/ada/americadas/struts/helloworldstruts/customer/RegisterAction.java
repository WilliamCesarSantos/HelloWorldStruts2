package br.ada.americadas.struts.helloworldstruts.customer;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

@Namespace("/customer")
public class RegisterAction extends ActionSupport {

    private Customer customer;
    private CustomerService service;

    public RegisterAction() {
        CustomerDAO dao = new CustomerDAO();
        service = new CustomerService(dao);
    }

    @Override
    @Action(value = "register_customer", results = {
            @Result(name = SUCCESS, location = "/customer/register.jsp"),
            @Result(name = ERROR, location = "default_error.jsp")
    })
    public String execute() throws Exception {
        //Mundo livre
        try {
            this.service.save(customer);
            return SUCCESS;
        } catch(Exception exception) {
            exception.printStackTrace();
            return ERROR;
        }
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
