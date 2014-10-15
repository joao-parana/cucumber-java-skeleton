# Arquivo : tables.feature
#
Feature: Requisitar Dados do Serviço
  Serviço deve estar no ar e atendendo requisições

Scenario: Renaming headers
Given I am logged in as a buyer
When I search for available cars
Then I should see the following cars:
    | color | model   |
    | rust  | Camaro  |
    | blue  | Gremlin |

