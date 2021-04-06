Feature: Propondo um lance

  Scenario: Propondo um unico lance valido
    Given um lance valido
    When propoe um lance
    Then o lance e aceito