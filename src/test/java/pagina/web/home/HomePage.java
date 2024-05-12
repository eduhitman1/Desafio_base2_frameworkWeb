package pagina.web.home;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.edsoft.framework.base.web.BasePaginaWeb;
import com.edsoft.framework.base.web.DriverContextWeb;
import com.edsoft.framework.configs.Settings;
import com.edsoft.framework.controls.elements.Button;
import com.edsoft.framework.controls.elements.TextBox;
import com.edsoft.framework.exception.EdsoftException;
import com.itextpdf.text.DocumentException;

import io.qameta.allure.Step;
import pagina.web.quantidadeProduto.ManageProductPage;

public class HomePage extends BasePaginaWeb {

	@FindBy(how = How.XPATH, using = "//*[@id=\"menuUserLink\"]/span")
	public WebElement linkUserName;

	@FindBy(how = How.ID, using = "menuUserLink")
	public Button btnDeslogar;

	@FindBy(how = How.ID, using = "menuUser")
	public WebElement btnLogin;

	// categorias
	@FindBy(how = How.ID, using = "speakersLink")
	public WebElement catSpeakers;
	@FindBy(how = How.ID, using = "tabletsTxt")
	public WebElement catTables;
	@FindBy(how = How.ID, using = "laptopsTxt")
	public WebElement catLaptops;
	@FindBy(how = How.ID, using = "miceTxt")
	public WebElement catMice;
	@FindBy(how = How.ID, using = "headphonesTxt")
	public WebElement catHeadphones;

	// Acionar contato
	@FindBy(how = How.NAME, using = "categoryListboxContactUs")
	public WebElement categoriaProdutoCombo;
	@FindBy(how = How.NAME, using = "productListboxContactUs")
	public WebElement modeloProdutoCombo;
	@FindBy(how = How.NAME, using = "emailContactUs")
	public TextBox emailContato;
	@FindBy(how = How.NAME, using = "subjectTextareaContactUs")
	public WebElement areaText;

	// subir Barra
	@FindBy(how = How.NAME, using = "go_up_btn")
	public Button imgGoUp;
	

	
	
	
	@FindBy(how = How.ID, using = "username")
	public WebElement username;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"login-form\"]/fieldset/input[2]")
	public WebElement btnEntrar;
	
	@FindBy(how = How.ID, using = "password")
	public WebElement password;
	
	//*[@id="login-form"]/fieldset/input[3]
	@FindBy(how = How.XPATH, using = "//*[@id=\"login-form\"]/fieldset/input[3]")
	public WebElement btnEntrar2;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"sidebar\"]/ul/li[3]")
	public WebElement linkCriarTarefa;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"sidebar\"]/ul/li[2]/a")
	public WebElement linkVerTarefa;
	
	@FindBy(how = How.ID, using = "reproducibility")
	public WebElement frequencia;
	@FindBy(how = How.ID, using = "severity")
	public WebElement gravidade;
	@FindBy(how = How.ID, using = "priority")
	public WebElement prioridade;
	
	@FindBy(how = How.ID, using = "summary")
	public WebElement resumo;
	@FindBy(how = How.ID, using = "description")
	public WebElement descricao;
	@FindBy(how = How.ID, using = "steps_to_reproduce")
	public WebElement passReproduzir;
	@FindBy(how = How.ID, using = "additional_info")
	public WebElement inforAdicional;
	
	@FindBy(how = How.ID, using = "tag_string")
	public WebElement aplicaMarcado;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"report_bug_form\"]/div/div[2]/div[2]/input")
	public WebElement btnCriarNovaTarefa;
	
	
	@Step("Tocar em \"icone login\"")
	public LoginPage clickLogin() throws Exception {
		
		
		// CENARIO 01 CRIANDO TAREFA NOVA COM PRIORIDADE ALTA 
	    DriverContextWeb.digitarTexto(username, "Eduardo_Henrique", "erro ao digitar");
	    DriverContextWeb.clicarElemento(btnEntrar, "erro");
	    DriverContextWeb.digitarTexto(password, "eduhitman1**", "erro ao digitar");
	    DriverContextWeb.clicarElemento(btnEntrar2, "erro");
	    DriverContextWeb.sleep(5);
	    /*
	    DriverContextWeb.clicarElemento(linkCriarTarefa, "erro");
	    DriverContextWeb.digitarTexto(frequencia, "sempre", "erro");
	    DriverContextWeb.digitarTexto(gravidade, "grande", "erro");
	    DriverContextWeb.digitarTexto(prioridade, "alta", "erro");
	    DriverContextWeb.digitarTexto(resumo, "tarefa de urgencia", "erro");
	    DriverContextWeb.digitarTexto(descricao, "automatico", "erro");
	    DriverContextWeb.digitarTexto(passReproduzir, "passo a passo", "erro");
	    DriverContextWeb.digitarTexto(inforAdicional, "realiza teste", "erro");
	    DriverContextWeb.digitarTexto(aplicaMarcado, "Desenvolvimento", "erro");
	    //DriverContextWeb.clicarElemento(btnCriarNovaTarefa, "erro");
		
	    
	    
		// CENARIO 02 CRIANDO TAREFA NOVA COM PRIORIDADE URGENTE 
	    DriverContextWeb.digitarTexto(username, "Eduardo_Henrique", "erro ao digitar");
	    DriverContextWeb.clicarElemento(btnEntrar, "erro");
	    DriverContextWeb.digitarTexto(password, "eduhitman1**", "erro ao digitar");
	    DriverContextWeb.clicarElemento(btnEntrar2, "erro");
	    DriverContextWeb.sleep(5);
	    
	    DriverContextWeb.clicarElemento(linkCriarTarefa, "erro");
	    DriverContextWeb.digitarTexto(frequencia, "sempre", "erro");
	    DriverContextWeb.digitarTexto(gravidade, "grande", "erro");
	    DriverContextWeb.digitarTexto(prioridade, "urgente", "erro");
	    DriverContextWeb.digitarTexto(resumo, "tarefa de urgencia", "erro");
	    DriverContextWeb.digitarTexto(descricao, "automatico", "erro");
	    DriverContextWeb.digitarTexto(passReproduzir, "passo a passo", "erro");
	    DriverContextWeb.digitarTexto(inforAdicional, "realiza teste", "erro");
	    DriverContextWeb.digitarTexto(aplicaMarcado, "Desenvolvimento", "erro");
	    //DriverContextWeb.clicarElemento(btnCriarNovaTarefa, "erro");
		
	 // CENARIO 03 CRIANDO TAREFA NOVA COM PRIORIDADE IMEDIATA 
	    DriverContextWeb.digitarTexto(username, "Eduardo_Henrique", "erro ao digitar");
	    DriverContextWeb.clicarElemento(btnEntrar, "erro");
	    DriverContextWeb.digitarTexto(password, "eduhitman1**", "erro ao digitar");
	    DriverContextWeb.clicarElemento(btnEntrar2, "erro");
	    DriverContextWeb.sleep(5);
	    
	    DriverContextWeb.clicarElemento(linkCriarTarefa, "erro");
	    DriverContextWeb.digitarTexto(frequencia, "sempre", "erro");
	    DriverContextWeb.digitarTexto(gravidade, "grande", "erro");
	    DriverContextWeb.digitarTexto(prioridade, "imediata", "erro");
	    DriverContextWeb.digitarTexto(resumo, "tarefa de urgencia", "erro");
	    DriverContextWeb.digitarTexto(descricao, "automatico", "erro");
	    DriverContextWeb.digitarTexto(passReproduzir, "passo a passo", "erro");
	    DriverContextWeb.digitarTexto(inforAdicional, "realiza teste", "erro");
	    DriverContextWeb.digitarTexto(aplicaMarcado, "Desenvolvimento", "erro");
	    //DriverContextWeb.clicarElemento(btnCriarNovaTarefa, "erro");
		
	 // CENARIO 04 CRIANDO TAREFA NOVA COM A FREQUENCIA DE IMCAPAZ DE PRODUZIR
	    DriverContextWeb.digitarTexto(username, "Eduardo_Henrique", "erro ao digitar");
	    DriverContextWeb.clicarElemento(btnEntrar, "erro");
	    DriverContextWeb.digitarTexto(password, "eduhitman1**", "erro ao digitar");
	    DriverContextWeb.clicarElemento(btnEntrar2, "erro");
	    DriverContextWeb.sleep(5);
	    
	    DriverContextWeb.clicarElemento(linkCriarTarefa, "erro");
	    DriverContextWeb.digitarTexto(frequencia, "sempre", "erro");
	    DriverContextWeb.digitarTexto(gravidade, "grande", "erro");
	    DriverContextWeb.digitarTexto(prioridade, "imediata", "erro");
	    DriverContextWeb.digitarTexto(resumo, "tarefa de urgencia", "erro");
	    DriverContextWeb.digitarTexto(descricao, "automatico", "erro");
	    DriverContextWeb.digitarTexto(passReproduzir, "passo a passo", "erro");
	    DriverContextWeb.digitarTexto(inforAdicional, "realiza teste", "erro");
	    DriverContextWeb.digitarTexto(aplicaMarcado, "Desenvolvimento", "erro");
	    //DriverContextWeb.clicarElemento(btnCriarNovaTarefa, "erro");
	    */
	    //DriverContextWeb.clicarElemento(linkVerTarefa, "erro ao clicar");
           //DriverContextWeb.validarAtributoTexto(by, texto, mensagemErro);
	    
	    
	    
	    
	    
//	    
	    
		
		DriverContextWeb.WaitUntilElementClicked(By.id("menuUser"));
		DriverContextWeb.salvarEvidencia("clicar no login");
		return GetInstance(LoginPage.class);
	}

	public boolean isLogin() throws Exception {
		return btnLogin.isDisplayed();
	}

	@Step("Valida Usuario Cadastrado")
	public String txtUsuarioLogado() throws Exception {
		DriverContextWeb.retornarTexto(linkUserName, "erros ao retorna texto");
		DriverContextWeb.salvarEvidencia("Usuário cadastrado");
		return linkUserName.getText();
	}

	@Step("Selecionar \"Categoria do produto\"")
	public ManageProductPage selecionarCategorira(String categoria) throws Exception {
		switch (categoria) {
		case "SPEAKERS":
			DriverContextWeb.WaitForElementVisible(catSpeakers);
			catSpeakers.click();
			break;
		case "TABLETS":
			DriverContextWeb.WaitForElementVisible(catTables);
			catTables.click();
			break;
		case "LAPTOPS":
			DriverContextWeb.WaitForElementVisible(catLaptops);
			catLaptops.click();
			break;
		case "MICE":
			DriverContextWeb.WaitForElementVisible(catMice);
			catMice.click();
			break;
		case "HEADPHONES":
			DriverContextWeb.WaitForElementVisible(catHeadphones);
			catHeadphones.click();
			break;
		default:
			break;
		}
		DriverContextWeb.salvarEvidencia("Selecionado categoria");
		return GetInstance(ManageProductPage.class);
	}

	public HomePage descerBarraDeRolagem() throws IOException, DocumentException, Exception {
		try {
			Thread.sleep(9000);
			DriverContextWeb.barraDeRolagem(1900);
		} catch (Exception e) {
			Settings.Logs.GravaLog("Erro de rolagem para baixo: " + e.getStackTrace());
		}
		return GetInstance(HomePage.class);
	}

	public HomePage selecionarCategoriaDeProdutoCombo(String produto) throws Exception {
		DriverContextWeb.selectElementByVisibleText(categoriaProdutoCombo, produto);
		return GetInstance(HomePage.class);
	}

	public HomePage selecionarModeloDeProdutoCombo(String modelo) throws Exception {
		DriverContextWeb.selectElementByVisibleText(modeloProdutoCombo, modelo);
		return GetInstance(HomePage.class);
	}

	public HomePage selecionarEmail(String email) throws Exception {
		DriverContextWeb.WaitForElementVisible(emailContato);
		emailContato.EnterText(email);
		return GetInstance(HomePage.class);
	}

	public HomePage digitarAreaDeTexto(String texto) throws Exception {
		DriverContextWeb.WaitForElementVisible(areaText);
		areaText.sendKeys(texto);
		return GetInstance(HomePage.class);
	}

	public HomePage clicarNoBotaoGoUp() throws Exception {
		DriverContextWeb.WaitForElementVisible(imgGoUp);
		imgGoUp.Click();
		return GetInstance(HomePage.class);
	}
}
