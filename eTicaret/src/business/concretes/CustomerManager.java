package business.concretes;

import java.util.List;

import business.abstracts.CustomerService;
import core.CustomerValidator;
import dataAcsess.abstracts.CustomerDao;
import entities.concretes.Customer;

public class CustomerManager implements CustomerService{

	public CustomerManager() {
		
	}

	private CustomerValidator customerValidator;
	private CustomerDao customerDao;
	private List<Customer> customerList;
	
	
	
	public CustomerManager(CustomerValidator customerValidator, CustomerDao customerDao) {
		this.customerValidator = customerValidator;
		this.customerDao = customerDao;
	}

	@Override
	public void register(Customer customer) {
		if(CustomerValidator.customerCheck(customer.getName() , customer.getLastName())){
			System.out.println("-> �sminiz Ve Soyad�n�z Do�rudur ");
			if(CustomerValidator.emailCheck(customer.geteMail())) {
				System.out.println("-> Emailiniz Do�rudur ");
				if(CustomerValidator.passowordCheck(customer.getPassword())) {
					System.out.println("-> �ifreniz Do�rudur ");
					System.out.println("-> " + customer.getName() + " Giri� Yapt�");
				}else
				System.out.println("-> L�tfen �ifrenizi En Ez Alt� Haneli Giriniz ");
			}else
			System.out.println("-> L�tfen Emailinizi Do�ru Giriniz ");
		}else
		System.out.println("-> L�tfen �sminizi Ve Soyad�n�z� Do�ru Giriniz ");
	}

	@Override
	public void login(Customer customer) {
		System.out.println("-> " + customer.getName() + " Giri� Yapt�");
		
	}

	@Override
	public void logout(Customer customer) {
		System.out.println(customer.getName()+" ��k�� Yapt�");
		
	}

	@Override
	public List<Customer> getAll() {
		return customerList;
	}

}
