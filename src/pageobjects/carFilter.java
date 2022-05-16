package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="carFilter"                                
               , summary=""
               , connection="DemoSCM"
               , lightningWebComponent="carFilter"
               , namespacePrefix=""
     )             
public class carFilter {

	@TextType()
	@FindBy(xpath = ".//c-car-filter//lightning-input/div/input")
	public WebElement searchKey;
	
}
