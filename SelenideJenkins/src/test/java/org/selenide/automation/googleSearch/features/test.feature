Feature: Yo

  Background: Ingresamos URL
    Given Ingresamos a Google

  @selenide
  Scenario Outline: Realizamos la búsqueda en Google
    When Hacemos la busqueda
      | <search> |

    Examples:
      | search     |
      | selenide 1 |
      | selenide 2 |
      | selenide 3 |
