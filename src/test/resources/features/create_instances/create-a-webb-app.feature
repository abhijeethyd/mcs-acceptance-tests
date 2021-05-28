Feature: Create a web app using MicroCloud Services

  Scenario: Create a web app
    Given Stuart is logged in on mcs "Dashboard" with a default "SimpleMenuUser"
    When he creates a web app with WebAppName as "myFirstApp" and Plan as "F1"