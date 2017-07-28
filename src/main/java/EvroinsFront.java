

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;




public class EvroinsFront {


    private WebDriver driver;
    private String frontUrl;
    private String frontUrlf;
    private String jjj;
    String parts;
    int timeoutInSeconds = 25;
    String orderId;

    //@Before

    public EvroinsFront(String frontUrl) {


        System.setProperty("webdriver.gecko.driver", "C:\\Users\\zhivkokasabov\\automation\\geckodriver.exe");
        this.driver = new org.openqa.selenium.firefox.FirefoxDriver();
        //frontUrl =  "http://www.euroinslife.bg/";
        this.driver.navigate().to(frontUrl);



    }

    /**
     * @param
     */
    public void loginBtn() {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        // wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#div-btn-login")));

        WebElement loginBtn = this.driver.findElement(By.cssSelector("#div-btn-login"));
        loginBtn.click();
    }


    public void makeLogin(String username, String password) {

        WebElement userInput = this.driver.findElement(By.id("txt-username"));
        userInput.sendKeys(username);

        WebElement passwordInput = this.driver.findElement(By.id("txt-password"));
        passwordInput.clear();
        passwordInput.sendKeys(password);

        WebElement submitBtn = this.driver.findElement(By.id("btn-submit-login"));
        submitBtn.click();
    }


    public void policiMenu() {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"div-main-items\"]/a[1]/div/div[1]/div")));
        WebElement policiBtn = this.driver.findElement(By.xpath("//*[@id=\"div-main-items\"]/a[1]/div/div[1]/div"));
        policiBtn.click();
    }

    public void kaskoMenu() {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"div-products\"]/a[2]/div/div[3]")));
        WebElement policiBtn = this.driver.findElement(By.xpath("//*[@id=\"div-products\"]/a[2]/div/div[3]"));
        policiBtn.click();
    }


    public void novaOferta() {
        WebElement novaOfertaBtn = this.driver.findElement(By.id("btn-NewProduct"));
        novaOfertaBtn.click();
    }

    public void dobavianeSlujitel() {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        //wait.until(ExpectedConditions.elementToBeClickable(By.id("user-upper-menu-toggle-3")));

        WebElement dobavianeBtn = this.driver.findElement(By.id("user-upper-menu-toggle-3"));
        dobavianeBtn.click();
        WebElement dobavianeSlujiteliBtn = this.driver.findElement(By.id("user-upper-menu-3-1"));
        dobavianeSlujiteliBtn.click();

    }

    public void dobavianePosrednik() {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        //wait.until(ExpectedConditions.elementToBeClickable(By.id("user-upper-menu-toggle-3")));
        //user-upper-menu-toggle-3

        WebElement dobavianeBtn = this.driver.findElement(By.id("user-upper-menu-toggle-3"));
        dobavianeBtn.click();
        WebElement dobavianeSlujiteliBtn = this.driver.findElement(By.id("user-upper-menu-3-2"));
        dobavianeSlujiteliBtn.click();

    }





    public void vavediDanniSlujitelIPosrednik(String address, String lk, String date_lk, String info) {

        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        //wait.until(ExpectedConditions.elementToBeClickable(By.id("brokers-egnbulstat")));
        // WebElement egnInput = this.driver.findElement(By.id("brokers-egnbulstat"));
        //egnInput.sendKeys(egn);

        WebElement egnInput = this.driver.findElement(By.id("brokers-egnbulstat"));
        egnInput.sendKeys(parts);
        System.out.println(egnInput);
        //egnInput.sendKeys(Keys.ENTER);




        /*WebElement getEgn = this.driver.findElement(By.xpath("/html/body/ul/li[3]/b[1]"));
        String parts =getEgn.getText();
        System.out.println(parts);
        WebElement productInput = this.driver.findElement(By.name("sku"));
        productInput.sendKeys(parts);
        System.out.println(parts + "test");
        productInput.sendKeys(Keys.ENTER);*/







        //WebElement nameInput = this.driver.findElement(By.id("brokers-clientName"));
        // nameInput.clear();
        //nameInput.sendKeys(name);



        WebElement nameInput = this.driver.findElement(By.id("brokers-clientName"));
        String randomName = generateString(new Random(), "abcdefghijklmnopqrstuvwxyz", 15);
        nameInput.sendKeys( "TestName" + randomName);







        // WebElement phoneInput = this.driver.findElement(By.id("brokers-mobilePhone"));
        // phoneInput.sendKeys(phone);


        WebElement phoneInput = this.driver.findElement(By.id("brokers-mobilePhone"));
        String randomPassword = generateString(new Random(),"0123456789", 5);
        phoneInput.sendKeys(randomPassword);







        // WebElement mailInput = this.driver.findElement(By.id("brokers-eMail"));
        // mailInput.sendKeys(mail);

        WebElement mailInput = this.driver.findElement(By.id("brokers-eMail"));
        mailInput.clear();
        String randomEmail = generateString(new Random(), "abcdefghijklmnopqrstuvwxyz", 10);
        mailInput.sendKeys(randomEmail + "@vvv.com");




        WebDriverWait wait1 = new WebDriverWait(driver, timeoutInSeconds);
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"brokers-provincyId\"]/option[6]")));
        WebElement addCityBtn = this.driver.findElement(By.xpath("//*[@id=\"brokers-provincyId\"]/option[6]"));
        addCityBtn.click();

        WebElement addRegionBtn = this.driver.findElement(By.xpath("//*[@id=\"brokers-eknmCode\"]/option[3]"));
        addRegionBtn.click();

        WebElement addressInput = this.driver.findElement(By.id("brokers-fullAddress"));
        addressInput.sendKeys(address);

        WebElement lkInput = this.driver.findElement(By.id("brokers-passportNo"));
        lkInput.sendKeys(lk);

        WebElement date_lkInput = this.driver.findElement(By.id("brokers-passDateOfIssue"));
        date_lkInput.sendKeys(date_lk);

        WebElement cityLkBtn = this.driver.findElement(By.xpath("//*[@id=\"brokers-passProvincyId\"]/option[4]"));
        cityLkBtn.click();

        WebElement infoInput = this.driver.findElement(By.id("brokers-clientDesc"));
        infoInput.sendKeys(info);




        WebDriverWait wait2 = new WebDriverWait(driver, timeoutInSeconds);
        //wait.until(ExpectedConditions.elementToBeClickable(By.id("brokers-btn-submitClientInfo")));
        WebElement saveBtn = this.driver.findElement(By.id("brokers-btn-submitClientInfo"));
        saveBtn.click();                                  //brokers-btn-submitClientInfo
    }

    public void openEgnPage( ) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\zhivkokasabov\\automation\\geckodriver.exe");
        this.driver = new org.openqa.selenium.firefox.FirefoxDriver();
        //frontUrlf =  "http://georgi.unixsol.org/programs/egn.php";
        this.driver.navigate().to("http://external.euroins.bg/webinacsrelease/#/home");


    }




    public void getEgnUnique( ) {

        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/ul/li[3]/b[1]")));

        WebElement getEgn = this.driver.findElement(By.xpath("/html/body/ul/li[3]/b[1]"));

        parts =getEgn.getText();
        //int parts =getEgn.getText();
        System.out.println(parts+"test");

        // WebElement productInput = this.driver.findElement(By.xpath("sku"));
        //productInput.sendKeys(parts);
        //System.out.println(productInput + "test");
        // productInput.sendKeys(Keys.ENTER);
        driver.quit();
    }

























}



















//WebElement Email = driver.findElement(By.cssSelector("input[id=email]"));
//Email.SendKeys("hello@sampleemail.com");


