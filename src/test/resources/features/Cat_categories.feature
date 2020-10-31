Feature: Cat API

  @CatApi @Code200
    Scenario Outline: Obtengo la lista de categorias
    When realizo una petición '<operation>' a '<entity>' al endpoint de categorias - '<request>'
    Then obtengo el status code '<statusCode>'
    And los datos son correctos
    @SuccessCat
    Examples:
      | request                   | statusCode  | operation | entity    |
      | request/rq_cat_categories | 200         | GET       | CATEGORIES|


  @CatApi @Code400
    Scenario Outline:
    When realizo una petición '<operation>' a '<entity>' al endpoint de images id - '<request>'
    Then obtengo el status code '<statusCode>'
    @ImageIdCat
    Examples:
      | request                   | statusCode  | operation | entity    |
      | request/cat_image_id      | 400         | GET       | IMAGEID   |


  @CatApi @Code401
    Scenario Outline: Analisis de imagenes
    When realizo una petición '<operation>' a '<entity>' al endpoint de analisis - '<request>'
    Then obtengo el status code '<statusCode>'
    @AnalysisCat
    Examples:
      | request                   | statusCode  | operation | entity    |
      | request/cat_analysis      | 401         | POST      | ANALYSIS  |


  @CatApi @Code404
    Scenario Outline: Obtengo un breed de una imagen
    When realizo una petición '<operation>' a '<entity>' al endpoint de razas - '<request>'
    Then obtengo el status code '<statusCode>'
    @BreedCat
    Examples:
      | request                   | statusCode  | operation | entity    |
      | request/cat_breeds        | 404         | GET       | BREEDS    |

