
Feature: Descarga Documentos Cuenta de Ahorro Despositos
  Yo como usuario deseo descargar el documento de Cuentas de Ahorro de Depositos Empresariales

  @tag1
  Scenario: Descarga Documento
    Given Lina ingresa en la Pagina de Banitsmo 
    When  Selecciona Cuenta de Ahorros Comercial 
    Then ella puede descargar el Docuemento 
    
 