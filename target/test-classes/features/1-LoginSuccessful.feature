@SuiteChatbox @Chatbox
Feature: CP-01 - Login como administrador plataforma Iplacex

  Scenario: 1- Validar con credenciales correctas
    Given Usuario navega hacia login para autenticarse
    When Ingresar usuario administador
    And Ingresar contraseña
    Then Me redirige a la vista principal del administrador


