package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HerokuPage {
    public HerokuPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}









//ackage pages;
//       import org.openqa.selenium.WebElement;
//       import org.openqa.selenium.support.FindBy;
//       import org.openqa.selenium.support.PageFactory;
//       import utilities.Driver;
//ublic class HerokuPages {
//   public HerokuPages(){
//       PageFactory.initElements(Driver.getDriver(),this);
//   }
//   @FindBy(css = "button[onclick=\"addElement()\"]")
//   public WebElement addElementButton;
//   @FindBy(css = "button[class=\"added-manually\"]")
//   public WebElement deleteButton;
//   @FindBy(xpath = "//h3[.='Add/Remove Elements']")
//   public WebElement addRemovesElementsText;
// @FindBy(css = "button[class=added-manually]")
//public List<WebElement> deleteList;*/
//
//}