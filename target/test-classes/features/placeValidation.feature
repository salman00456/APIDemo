Feature: Validating Place API's

  @AddPlace
  Scenario Outline: Verify if Place is being Succesfully added using AddPlaceAPI
    Given Add Place Payload with "<name>" "<language>" "<address>"
    When user calls "addPlaceAPI" with "POST" http request
    Then the API call got sucess with status code 200
    And "status" in response body is "OK"
    And "scope" in response body is "APP"
    And verify place_Id created maps to "<name>" using "getPlaceAPI"

    Examples: 
      | name         | language | address                |
      | Centre Villa | German   | Tower one suite Secure |

  #   | BBHouse villa| spanish  | Tower suite Second     |
  
  
  @DeletePlace
  Scenario: Verify if Delete Place functionality is working
    Given DeletePlace Payload
    When user calls "deletePlaceAPI" with "POST" http request
    Then the API call got sucess with status code 200
    And "status" in response body is "OK"
