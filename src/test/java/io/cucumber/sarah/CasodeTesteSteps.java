package io.cucumber.sarah;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.pt.*;
import io.cucumber.sarah.services.Configuracao;


public class CasodeTesteSteps {


    @Dado("que estou no site da sampleapp")
    public void que_estou_no_site_da_sampleapp() {
        Configuracao.abrir("http://sampleapp.tricentis.com/101/app.php");
    }

    @Dado("devo preencher o formulario da aba Enter Vehicle Data e clicar em next")
    public void devo_preencher_o_formulario_da_aba_Enter_Vehicle_Data_e_clicar_em_next() {
        
        Configuracao.seletorQueryXpath("//*[@id='make']").click();
        Configuracao.seletorQueryXpath("//*[@id='make']/option[3]").click();
        Configuracao.seletorQueryXpath("//*[@id='model']").click();
        Configuracao.seletorQueryXpath("//*[@id='model']/option[3]").click();
        Configuracao.seletorQueryCss("input#cylindercapacity").sendKeys("100");
        Configuracao.seletorQueryCss("input#engineperformance").sendKeys("2000");
        Configuracao.seletorQueryCss("input#dateofmanufacture").sendKeys("04/01/2019");
        Configuracao.seletorQueryCss("select#numberofseats").click();
        Configuracao.seletorQueryXpath("//*[@id='numberofseats']/option[4]").click();
        Configuracao.seletorQueryXpath("//*[@id='insurance-form']/div/section[1]/div[7]/p/label[1]/span").click();
        Configuracao.seletorQueryCss("select#numberofseatsmotorcycle").click();
        Configuracao.seletorQueryXpath("//*[@id='numberofseatsmotorcycle']/option[3]").click();
        Configuracao.seletorQueryCss("select#fuel").click();
        Configuracao.seletorQueryXpath("//*[@id='fuel']/option[2]").click();
        Configuracao.seletorQueryCss("input#payload").sendKeys("200");
        Configuracao.seletorQueryCss("input#totalweight").sendKeys("350");
        Configuracao.seletorQueryCss("input#listprice").sendKeys("1000");
        Configuracao.seletorQueryCss("input#licenseplatenumber").sendKeys("2");
        Configuracao.seletorQueryCss("input#annualmileage").sendKeys("1400");
        Configuracao.seletorQueryCss("button#nextenterinsurantdata").click();    

    }


    @Dado("devo preencher o formulario da aba Enter Insurant Data e clicar em next")
    public void devo_preencher_o_formulario_da_aba_Enter_Insurant_Data_e_clicar_em_next() {

        Configuracao.seletorQueryCss("input#firstname").sendKeys("joao");
        Configuracao.seletorQueryCss("input#lastname").sendKeys("silva");
        Configuracao.seletorQueryCss("input#birthdate").sendKeys("02/06/1998");
        Configuracao.seletorQueryXpath("//*[@id='insurance-form']/div/section[2]/div[4]/p/label[1]/span").click();
        Configuracao.seletorQueryCss("input#streetaddress").sendKeys("americas avenue");
        Configuracao.seletorQueryCss("select#country").click(); 
        Configuracao.seletorQueryXpath("//*[@id='country']/option[14]").click();
        Configuracao.seletorQueryCss("input#zipcode").sendKeys("12548");
        Configuracao.seletorQueryCss("input#city").sendKeys("sidney");
        Configuracao.seletorQueryCss("select#occupation").click(); 
        Configuracao.seletorQueryXpath("//*[@id='occupation']/option[3]").click();
        Configuracao.seletorQueryXpath("//*[@id='insurance-form']/div/section[2]/div[10]/p/label[2]/span").click();
        Configuracao.seletorQueryCss("input#website").sendKeys("www.com.br");
        Configuracao.seletorQueryCss("button#nextenterproductdata").click();  

    }

    @Dado("devo preencher o formulario da aba Enter Product Data e clicar em next")
    public void devo_preencher_o_formulario_da_aba_Enter_Product_Data_e_clicar_em_next() {

        Configuracao.seletorQueryCss("input#startdate").sendKeys("02/01/2022");
        Configuracao.seletorQueryCss("select#insurancesum").click(); 
        Configuracao.seletorQueryXpath("//*[@id='insurancesum']/option[3]").click();
        Configuracao.seletorQueryCss("select#meritrating").click(); 
        Configuracao.seletorQueryXpath("//*[@id='meritrating']/option[3]").click();
        Configuracao.seletorQueryCss("select#damageinsurance").click(); 
        Configuracao.seletorQueryXpath("//*[@id='damageinsurance']/option[2]").click();
        Configuracao.seletorQueryXpath("//*[@id='insurance-form']/div/section[3]/div[5]/p/label[1]/span").click();
        Configuracao.seletorQueryCss("select#courtesycar").click(); 
        Configuracao.seletorQueryXpath("//*[@id='courtesycar']/option[3]").click();
        Configuracao.seletorQueryCss("button#nextselectpriceoption").click();      

    }

    @Dado("devo preencher o formulario da aba Select Price Option e clicar em next")
    public void devo_preencher_o_formulario_da_aba_Select_Price_Option_e_clicar_em_next() throws InterruptedException {
        Configuracao.seletorQueryXpath("//*[@id='priceTable']/tfoot/tr/th[2]/label[4]/span").click();
        Configuracao.scroll();
        Thread.sleep(2000);
        Configuracao.seletorQueryXpath("//*[@id='nextsendquote']").click();
    }

    @Dado("devo preencher o formulario da aba Send Quote e clicar em next")
    public void devo_preencher_o_formulario_da_aba_Send_Quote_e_clicar_em_next() {
        Configuracao.seletorQueryCss("input#email").sendKeys("teste@hotmail.com");
        Configuracao.seletorQueryCss("input#phone").sendKeys("021986574");
        Configuracao.seletorQueryCss("input#username").sendKeys("teste");
        Configuracao.seletorQueryCss("input#password").sendKeys("12345Ac");
        Configuracao.seletorQueryCss("input#confirmpassword").sendKeys("12345Ac");
        Configuracao.seletorQueryCss("textarea#Comments").sendKeys("teste");    
        Configuracao.seletorQueryCss("button#sendemail").click();      

    }


    @Entao("devo ver a mensagem {string}")
    public void devo_ver_a_mensagem(String string) throws InterruptedException {
        Thread.sleep(10000);
        Configuracao.seletorQueryCss("h2").getText();
        String mensagem = Configuracao.seletorQueryCss("h2").getText();
        assertEquals(mensagem, "Sending e-mail success!");
        Configuracao.fechar();
    }


}