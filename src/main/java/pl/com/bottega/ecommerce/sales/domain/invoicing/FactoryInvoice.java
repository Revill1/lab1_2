package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;

public class FactoryInvoice {
	

	public class InvoiceFactory implements InvoiceInterfaceFactory {

		public Invoice create(ClientData client) {
			return new Invoice(Id.generate(), client);
		}
	}
}