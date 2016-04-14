package pl.com.bottega.ecommerce.canonicalmodel.factory;

import pl.com.bottega.ecommerce.sales.domain.invoicing.FactoryInvoice;
import pl.com.bottega.ecommerce.sales.domain.invoicing.InvoiceInterfaceFactory;
import pl.com.bottega.ecommerce.sales.domain.payment.FactoryPayment;
import pl.com.bottega.ecommerce.sales.domain.payment.PaymentInterfaceFactory;


public class Factory {

	public static PaymentInterfaceFactory getIPaymentFactory() 
	{
		return (PaymentInterfaceFactory) new FactoryPayment();
	}
	
	public static InvoiceInterfaceFactory getIIvoiceFactory() 
	{
		return (InvoiceInterfaceFactory) new FactoryInvoice();
	}
}