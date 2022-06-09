package amazonProject;

import org.testng.annotations.Test;

import amzonProject.AmazonSearchProduct;

public class AmazonTest {

	@Test
	public void verifySearchProduct() {
		
		AmazonSearchProduct amazonSearchProduct = new AmazonSearchProduct();
		
		amazonSearchProduct.openBrowser();
		
		amazonSearchProduct.searchProduct("Apple Watch", "Electronics");
		
		amazonSearchProduct.getNthProduct(4);
		
		amazonSearchProduct.closeBrowser();
		
	}
}
