package ins.aiite.baseclass;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;
	public static WebElement element;
	public static Actions ac;
	public static TakesScreenshot ts;
	public static Alert at;
	public static Select s;
	public static Robot robot;
	public static JavascriptExecutor js;
	public static WebDriverWait wait;
	public static Wait waitfluent;
	public static String value;
	public static String loctn="C:\\Users\\itsme\\eclipse-workspace\\AdactinProjectWithoutPageFactoryAbstract\\src\\test\\resources\\loginInfo.properties";
	public static String fpath="C:\\Users\\itsme\\eclipse-workspace\\AdactinProjectWithoutPageFactoryAbstract\\src\\test\\resources\\Details.xlsx";
	
	public static WebDriver set_Property(String browser_Name) {
	switch(browser_Name) {
	case ("chrome"):
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\itsme\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		break;
	case ("gecko"):
		System.setProperty("webdriver.gecko.driver","C:\\Users\\itsme\\Downloads\\Selenium\\Drivers\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		 driver=new FirefoxDriver();
		break;
	case ("edge"):
		System.setProperty("webdriver.edge.driver","D:\\edgedriver_win32\\msedgedriver.exe");
		driver=new EdgeDriver();
		break;
	default:
		System.out.println("My choice chrome");
	}
	return driver;
}
	public static void launch_Url(String url) {
		System.out.println("Lauching url");
		driver.get(url);
		String givenUrl=driver.getCurrentUrl();
		if(givenUrl.equals(url)) {
			System.out.println("Url launched successfully");
		}
		else {
			System.out.println("Url launch failed");
		}
		
	}
	public static void maxi_window() {
		driver.manage().window().maximize();
	}
	public static WebElement get_Element_By(By id) {
		try {
	WebElement element=driver.findElement(id);
	return element;
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
	return element;
	}
	
	public static WebElement get_Element_By_Name(By name) {
		try {
	WebElement element=driver.findElement(name);
	return element;
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
	return element;
	}
	public static WebElement get_Element_By_ClassName(By classname) {
		try {
	WebElement element=driver.findElement(classname);
	return element;
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
	return element;
	}
	public static WebElement get_Element_By_Xpath(By xpath) {
		try {
	WebElement element=driver.findElement(xpath);
	return element;
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
	return element;
	}
	public static WebElement get_Element_By_LinkText(By linkText) {
		try {
	WebElement element=driver.findElement(linkText);
	return element;
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
	return element;
	}
	public static WebElement get_Element_By_PartialLinkText(By partiallinkText) {
		try {
	WebElement element=driver.findElement(partiallinkText);
	return element;
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
	return element;
	}
	public static WebElement get_Element_By_TagName(By tagName) {
		try {
	WebElement element=driver.findElement(tagName);
	return element;
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
	return element;
	}
	public static WebElement get_Element_By_xpathAxes(By xpathAxes) {
		try {
		WebElement element=driver.findElement(xpathAxes);	
		return element;
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
		return element;
	}
	public static WebElement get_Element_By_cssSelctor(By cssSelector) {
		try {
		WebElement element=driver.findElement(cssSelector);
		return element;
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
		return element; 
	}
	public static void navigateBackwardFromUrl()
	{
		driver.navigate().back();
	}
	public static void navigateForwardFromUrl()
	{
		driver.navigate().forward();
	}
	public static void switchTo_FrameElement(WebElement element) {
		try {
	driver.switchTo().frame(element);
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
	}
	public static void switchTo_Frame(String name) {
		try {
		driver.switchTo().frame(name);
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
	}
	public static void switchTo_frameId(String id) {
		try {
		driver.switchTo().frame(id);
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
	}
	public static void switchTo_frameIndex(int index) {
		try {
		driver.switchTo().frame(index);
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
	}
	public static void switchTo_DefaultContent() {
		try {
		driver.switchTo().defaultContent();
		}
		catch(Exception e) {
			System.out.println("Error : "+e);
		}
	}
	public static void actionsEvent(WebElement element) {
		try {
		ac=new Actions(driver);
		}
		catch(Exception e) {
			System.out.println("Error : "+e);
		}
		}
	public static void doubleClick(WebElement element) {
		try {
		ac.doubleClick(element);
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
	}
	public static void contextClick(WebElement element) {
		try {
			ac.contextClick(element);	
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}	
	}
	public static void moveToElement(WebElement element) {
		try {
		ac.moveToElement(element);
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}	
	}
	public static void clickElement() {
		try {
		ac.click();
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
	}
	public static void  drag_dropElement(WebElement element_drag,WebElement element_drop) {
		try {
		ac.dragAndDrop(element_drag,element_drop);
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
	}
	public static void perform() {
		try {
		ac.perform();
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
	}
	public static void getScreenshot(String pathName) throws IOException {
		try {
			ts = (TakesScreenshot) driver;	
		File f = ts.getScreenshotAs(OutputType.FILE);
		File path = new File(pathName);
		FileHandler.copy(f,path);
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
	}
	public static Alert alert_handling() {
		try {
	   at=driver.switchTo().alert();
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
		return at;
	}
	public static void accept_alert() {
		try {
		at.accept();
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
	}
	public static void dismiss_alert() {
		try {
		at.dismiss();
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
	}
	public static void selectEvents(WebElement element) {
		s = new Select(element);
	}
	public static void selectByVisibleTextOption(String text) {
		try {
		s.selectByVisibleText(text);
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
	}
	public static void selectByValueOption(String text) {
		try {
		s.selectByValue(text);
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
	}
	public static void selectByIndexOption(int index) {
		try {
		s.selectByIndex(index);
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
	}
	public static void getSelectOptions(WebElement element)
	{
		try {
			List<WebElement> li=s.getOptions();
			for (WebElement ref : li) {
				System.out.println( ref.getText());
		}
		}catch(Exception e)
			{
				System.out.println("Error"+ e);
			}
		}
	public static void selectAllOptions(WebElement element)
	{
		try {
			List< WebElement> selectedoptions=s.getAllSelectedOptions();
			
			for (WebElement ref : selectedoptions) {
				System.out.println(ref.getText());
			}
		}
		catch(Exception e)
		{
			System.out.println("Error"+ e);
		}
	}
	public static void getFirstOptionSelected(WebElement element)
	{
		try
		{
		WebElement firstOption=s.getFirstSelectedOption();
		 System.out.println("firstOption : "+ firstOption.getText());
		}
		 catch(Exception e)
			{
				System.out.println("Error"+ e);
			}
	}
	public static void selectoptionsIsMultiple(WebElement element)
	{
		try {
			boolean ismultiple=s.isMultiple();
			System.out.println("ismultiple "+ ismultiple);	
		}
		catch(Exception e)
		{
			System.out.println("Error"+ e);
		}
	}
	public static void deSelectByVisisbleTextMethod(WebElement element, String visibleText)
	{
		try {
		  s.deselectByVisibleText(visibleText);
		}
		catch(Exception e)
		{
			System.out.println("Error"+ e);
		}
	}
	public static void deSelectByValueMethod(WebElement element, String keyValue)
	{
		try
		{
		 s.deselectByValue(keyValue);
		}
		catch(Exception e)
		{
			System.out.println("Error"+ e);
		}
	}
	public static void deSelectByIndexMethod(WebElement element, int indexValue)
	{
		try
		{
		s.deselectByIndex(indexValue);
		}
		catch(Exception e)
		{
			System.out.println("Error"+ e);
		}
	}
	public static void deSelectAllOptions(WebElement element)
	{
		try {
		s.deselectAll();
		}
		catch(Exception e)
		{
			System.out.println("Error"+ e);
		}
	}
	public static void clear(WebElement element) {
		try {
		element.clear();
		} 
		catch(Exception e)
		{
			System.out.println("Error"+ e);
		}
		}
	public static void keyBoardEventskeyUp(CharSequence key) {
		try {
		ac.keyUp(key);
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
	}
	public static void keyBoardEventskeyDown(CharSequence key) {
		try {
		ac.keyDown(key);
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
	}
	public static void robotEvents(){
		try {
			robot=new Robot();
		}
		catch(Exception e){
			System.out.println("Error : "+e);
		}
	}
	public static void keyPress() {
		try {
		robot.keyPress(KeyEvent.VK_DOWN);
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
	}
	public static void keyRelease() {
		try {
		robot.keyPress(KeyEvent.VK_UP);
		}
		catch(Exception e) {
			System.out.println("Error : "+e);
		}
	}
	public static void javaScriptMethod() {
		try {
			js=(JavascriptExecutor) driver;
		}
		catch(Exception e) {
			System.out.println("Error : "+e);
		}
		}
	public static void javaScriptMethod(String attribute, WebElement element) {
		try {
			
		js.executeScript(attribute, element);
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
	}
	public static void radioCheckBoxDisplayed(WebElement element) {
		try {
		System.out.println(element.isDisplayed());
		}
		catch(Exception e) {
			System.out.println("Error : "+e);
		}
	}
	public static void radioCheckBoxEnabled(WebElement element) {
		try {
		System.out.println(element.isEnabled());
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
	}
	public static void radioCheckBoxSelected(WebElement element) {
		try {
		System.out.println(element.isSelected());
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
	}
	public static void send_Keys(WebElement element,String keyValues) {
		try {
		element.sendKeys(keyValues);
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
	}
	public static  void get_element_to_click(WebElement element) {
		try {
		element.click();
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
	}
	public static void implicitWait(int secs) {
		try {
		driver.manage().timeouts().implicitlyWait(secs, TimeUnit.MILLISECONDS);
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
	}
	
	public static  String getAttribute(WebElement element) {
		try {
		return element.getAttribute("value");
		}catch(Exception e) {
			System.out.println("Error"+ e);
		}
		return element.getAttribute("value");
	}
		
	public static void getText(WebElement element) {
		try {
		String text = element.getText();
		System.out.println(text);
		} 
		catch(Exception e)
		{
			System.out.println("Error"+ e);
		}
		}
	
	public static void close_window() {
		try {
		driver.close();
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
	}
	public static void closeAllWindow() {
		try {
		driver.quit();
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
	}
		public static String propRead(String username) {
			try {
				FileReader read = new FileReader(loctn);
				Properties prop = new Properties();
				prop.load(read);	
				value = prop.getProperty(username);
				return value;
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return value;
			
		}
		
		public static void readAllValuesFromExcel() {
			try {
				String fPath="C:\\Users\\itsme\\eclipse-workspace\\HotelProjectWithoutPageFactoryString\\src\\test\\resources\\Details.xlsx";
				File f=new File(fPath);
				FileInputStream fis=new FileInputStream(f);
				Workbook wb=new XSSFWorkbook(fis);
				Sheet sheet=wb.getSheet("Sheet1");
				int numOfRows=sheet.getPhysicalNumberOfRows();
				for(int i=0;i<numOfRows;i++) {
					Row row=sheet.getRow(i);
					int numOfCells=row.getPhysicalNumberOfCells();
					for(int j=0;j<numOfCells;j++) {
						Cell cell=row.getCell(j);
						System.out.println(cell);
					}
				}
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
				
			}
		
			public static void readValueFromExcel() {
			try {
				
				File f=new File(fpath);
				FileInputStream fis=new FileInputStream(f);
				Workbook wb=new XSSFWorkbook(fis);
				Sheet sheet=wb.getSheet("Sheet1");
				int numOfRows=sheet.getPhysicalNumberOfRows();
				for(int i=0;i<numOfRows;i++) {
					Row row=sheet.getRow(i);
					int numOfCells=row.getPhysicalNumberOfCells();
					for(int j=0;j<numOfCells;j++) {
						Cell cell=row.getCell(j);
						int cellType=cell.getCellType();
						if(cellType==1) {
							String value=cell.getStringCellValue();
							System.out.println(value);
						}
						else if(cellType==0){
							if(DateUtil.isCellDateFormatted(cell)) {
								Date dateCellValue=cell.getDateCellValue();
								SimpleDateFormat sc=new SimpleDateFormat("MMM-dd-yyyy");
								String value=sc.format(dateCellValue);
								System.out.println(value);
							}
							else {
								double numValue=cell.getNumericCellValue();
								long a=(long)numValue;
								System.out.println(a);
							}
						}	}
				}
						}
				catch(FileNotFoundException e) {
					e.printStackTrace();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}

		public static String readSingleValue(int r,int c,String sh) {
			try {
				
				File f=new File(fpath);
				FileInputStream fis=new FileInputStream(f);
				Workbook wb=new XSSFWorkbook(fis);
				Sheet sheet=wb.getSheet("Sheet1");
				Row row=sheet.getRow(r);
				Cell cell=row.getCell(c);
				int cellType=cell.getCellType();
				if(cellType==1) {
					value=cell.getStringCellValue();
					}
				else if(cellType==0) {
					if(DateUtil.isCellDateFormatted(cell)) {
						Date dateCellValue=cell.getDateCellValue();
						SimpleDateFormat sc=new SimpleDateFormat("dd/MM/yyyy");
						value=sc.format(dateCellValue);
						System.out.println(value);
					}
				else {
					double numCellValue=cell.getNumericCellValue();
					long a=(long)numCellValue;
					value=String.valueOf(a);
					
				}
				}
			}
		catch(FileNotFoundException e) {
			e.printStackTrace();
					}
			catch(IOException e) {
				e.printStackTrace();
			}
			return value;
		}
		public static void excelWrite(String data,String sh) {
			try {
				File f=new File(fpath);
				FileInputStream fis=new FileInputStream(f);
				Workbook wb=new XSSFWorkbook(fis);
				Sheet cSheet=wb.createSheet(sh);
				Row cRow=cSheet.createRow(1);
				Cell cCell=cRow.createCell(4);
				cCell.setCellValue(data);
				FileOutputStream fos=new FileOutputStream(f);
				wb.write(fos);
				wb.close();
				System.out.println("Created");
				
			}
			catch(FileNotFoundException e) {
				e.printStackTrace();
			}
		catch(IOException e) {
		e.printStackTrace();
		}

		}
		public static void excelRewrite(String sh,int r,int c,String newValue,String oldValue) {
			try {
				
				File f=new File(fpath);
				FileInputStream fis=new FileInputStream(f);
				Workbook wb=new XSSFWorkbook(fis);
				Sheet cSheet=wb.getSheet(sh);
				Row cRow=cSheet.getRow(r);
				Cell cCell=cRow.getCell(c);
				String cellValue=cCell.getStringCellValue();
				if(cellValue.equals(oldValue));
				{
					cCell.setCellValue(newValue);
				}
				FileOutputStream fos=new FileOutputStream(f);
				wb.write(fos);
				wb.close();
				System.out.println("Created");
			}
			catch(FileNotFoundException e) {
				e.printStackTrace();
			}
		catch(IOException e) {
		e.printStackTrace();
		}
				}
		
		

}


