# Teste individual Accenture </br>
## Objetivo<br>
Criar um projeto em Selenium webdrive, com Java e Cucumber, usando Page objects.
<br>
<br>

## Caso de Teste :white_circle: <br>
 Acessar o site da SamppleApp e preencher todo o formulário.<br>

<b>Cenario:</b> Ver a mensagem de sucesso depois de preencher todos os formulários.<br>
    Dado que estou no site da sampleapp<br>
    E devo preencher o formulario da aba Enter Vehicle Data e clicar em next<br>
    E devo preencher o formulario da aba Enter Insurant Data e clicar em next<br>
    E devo preencher o formulario da aba Enter Product Data e clicar em next<br>
    E devo preencher o formulario da aba Select Price Option e clicar em next<br>
    E devo preencher o formulario da aba Send Quote e clicar em next<br>
    Entao devo ver a mensagem "Sending e-mail success!"<br>
 <br>  
 <br>   
## Tecnologias utilizadas :heart_eyes: <br>
 :white_check_mark: <b>Java</b><br>
> Linguagem de programação para desenvolvimento da aplicação.<br>
 
 :white_check_mark: <b>Selenium</b><br>
> Framework responsável por fazer a integração do código java com a linguagem Gherkin(Cucumber) abrindo o browser fazendo o teste de comportamento.<br>
 
 :white_check_mark: <b>Cucumber</b><br>
> Framework responsável por traduzir uma linguagem humana em código Java.<br>

:white_check_mark: <b>Maven</b><br>
> Gerenciador de dependências para o Java.<br>

<br>
<br>
<br>

## Como utilizar :computer:<br>

- Instalar o [Java](https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR)
- Instalar [JDK](https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html)
- Verificar se o JAVA_HOME está configurado em seu computador.
- Clone do projeto.<br>
`` git clone https://github.com/sarahhraamos/TesteIndividual_Accenture.git ``
- Entrando na pasta do projeto<br>
`` cd TesteIndividual_Accenture ``
- Fazer o download do [Chrome Webdriver](https://chromedriver.chromium.org/downloads) e colocar o arquivo descompactado dentro da pasta driver na raiz do projeto:<br>
<b>Exemplo:</b><br>
``cd driver``<br>
``curl https://chromedriver.storage.googleapis.com/89.0.4389.23/chromedriver_linux64.zip``<br>
``unzip chromedriver_linux64.zip``<br>
``rm -rf chromedriver_linux64.zip``<br>
``cd ../driver``<br>
- Limpando e validando maven Unix<br>
``./mvnw clean``<br>
- Limpando e validando maven Windows<br>
``mvnw.cmd clean``<br>
- Executando teste no Unix<br>
``./test.sh``<br>
- Executando teste no Windows<br>
``test.bat``<br




