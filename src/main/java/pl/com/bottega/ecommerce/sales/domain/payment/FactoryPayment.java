package pl.com.bottega.ecommerce.sales.domain.payment;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;
import pl.com.bottega.ecommerce.sharedkernel.Money;

public class FactoryPayment {

	

	public class PaymentFactory implements PaymentInterfaceFactory {

		public Payment create(ClientData client, Money amount) 
		{
			return new Payment(Id.generate(), client, amount.multiplyBy(-1));	
		}
	}
}
