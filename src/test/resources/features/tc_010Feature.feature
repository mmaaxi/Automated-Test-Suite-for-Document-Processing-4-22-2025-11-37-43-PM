Feature: Validar generación de 'Slip de salida' y almacenamiento en historial

  Scenario: Completar la carga y procesamiento de documentos
    Given que el usuario ha iniciado sesión en la aplicación
    When el usuario completa la carga y procesamiento de documentos
    Then el sistema genera el 'Slip de salida'
    And el sistema guarda los documentos originales en el historial de la solicitud
    And el sistema guarda los datos extraídos en el historial de la solicitud