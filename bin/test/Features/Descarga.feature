
Feature: Descarga Documentos Cuenta de Ahorro Despositos
  Yo como usuario deseo descargar el documento de Cuentas de Ahorro de Depositos Empresariales

  @tag1
  Scenario: Ingreso a Pagina principal
    Given Lina ingresa en la Pagina de Banitsmo 
    When  ella selecciona Productos y Servicios
    Then  puede ver la categoria Depositos 
  
        
   @tag2
       
  Scenario: Descarga Documento
    Given Lina selecciona categoria Depositos
    When  ella selecciona Cuenta de Ahorro Comecial
    Then  selecciona opcion Documentos 
    And   Descarga el documento
    
 