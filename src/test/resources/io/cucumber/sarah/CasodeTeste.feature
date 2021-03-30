# language: pt

Funcionalidade: Acessar o site e preencher todo o formulario.

Cenario: Ver a mensagem de sucesso depois de preencher o formulario.
    Dado que estou no site da sampleapp
    E devo preencher o formulario da aba Enter Vehicle Data e clicar em next
    E devo preencher o formulario da aba Enter Insurant Data e clicar em next
    E devo preencher o formulario da aba Enter Product Data e clicar em next
    E devo preencher o formulario da aba Select Price Option e clicar em next
    E devo preencher o formulario da aba Send Quote e clicar em next
    Entao devo ver a mensagem "Sending e-mail success!"
