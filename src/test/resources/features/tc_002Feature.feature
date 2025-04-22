Feature: File Upload

  Scenario: Validate upload of file with valid format and preview
    Given I navigate to the file upload page
    When I upload a valid file with format PDF/DOCX under 50MB
    Then I should see the file preview with name, size, and type