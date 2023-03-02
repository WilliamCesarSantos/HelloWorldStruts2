package br.ada.americadas.struts.helloworldstruts.customer;

public class CustomerService {

    private CustomerDAO dao;

    public CustomerService(CustomerDAO dao) {
        this.dao = dao;
    }

    public Customer save(Customer customer) {
        if (customer == null) {
            throw new RuntimeException("Não pode ser nulo");
        }
        if (!isCpfValid(customer)) {
            throw new RuntimeException("CPF invalido");
        }
        dao.save(customer);
        return customer;
    }

    private boolean isCpfValid(Customer customer) {
        return true;
    }

}
