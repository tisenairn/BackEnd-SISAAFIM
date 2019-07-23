
## Glossário de valores das enumerações:

#### O modelo abaixo descreve como as enumerações se comportam na API e o que, cada valor inteiro significa como uma String.

> Layout de Formatação do Glossário:

  <`Nome-original-sem-formatações`>: <*valor: valor-enumerador*> - <**[String-formatada-no-padrão-do-sistema/String enumerada]**>;.

> [FAQ] - Quanto a interpretação da formatação do Glossário:


> O que é "<>"? Indica a posição onde está localizado o item significando o formato do texto por extenso.

> O que é nome original sem formatações? É o formato do português natural, contendo acentuações e símbolos. Está dentro de um retângulo quase transparente;

> O que é o valor enumerador? É o valor no qual está na API do sistema, este que enumera o valor do <[String-formatada-no-padrão-do-sistema/String enumerada]>. Está em itálico;

> O que é o [String-formatada-no-padrão-do-sistema/String enumerada]? é o nome que foi estabelecido na API, este, não pode conter, símbolos ou acentuações. Está em negrito;


### `Imóvel`:
#### `Tipo de imóvel` - [**TipoImovel**]:
  - `Apartamento`: *valor: 0* - [**APARTAMENTO**];
  - `Casa`: *valor: 1* - [**CASA**];
  - `Motel`: *valor: 2* - [**MOTEL**];
  - `Terreno`: *valor: 3* - [**TERRENO**];
  - `Hospital`: *valor: 4* - [**HOSPITAL**];
  - `Galpão`: *valor: 5* - [**GALPAO**];
  - `Shopping`: *valor: 6* - [**SHOPPING**];
  - `Ginásio`: *valor: 7* - [**GINASIO**];

#### `Utilização do imóvel` - [**UtilizacaoImovel**]:
  - `Mista`: *valor: 0* - [**MISTA**];
  - `Metálica`: *valor: 1* - [**METALICA**];
  - `Hospital`: *valor: 2* - [**HOSPITAL**];

#### `Padrão de Qualidade` - [**PadraoQualidade**]:
  - `Alto`: *valor: 0* - [**ALTO**];
  - `Médio`: *valor: 2* - [**MEDIO**];
  - `Baixo`: *valor: 3* - [**BAIXO**];

#### `Informações gerais`:

#### `Pedologia` - [**Pedologia**]:
  - `Normal`: *valor: 0* - [**NORMAL**];
  - `Alagado Total`: *valor: 1* - [**ALAGADO_TOTAL**];
  - `Alagado +50%`: *valor: 2* - [**ALAGADO_POSITIVO**];
  - `Alagado -50%`: *valor: 3* - [**ALAGADO_NEGATIVO**];

#### `Topografia` - [**Topografia**]:
  - `Plano`: *valor: 0* - [**PLANO**];
  - `Aclive/Declive`: *valor: 1* - [**ACLIVE_DECLIVE**];
  - `Redução de Capacidade`: *valor: 2* - [**REDUCAO_DE_CAPACIDADE**];

#### `Estado de Conservação` - [**EstadoConservacao**]:
  - `Ótimo`: *valor: 0* - [**OTIMO**];
  - `Regular`: *valor: 1* - [**REGULAR**];
  - `Ruim`: *valor: 2* - [**RUIM**];

#### `Situação do Terreno` - [**SituacaoTerreno**]:
  - `Meio de quadra`: *valor: 0* - [**MEIO_DE_QUADRA**];
  - `Encravado`: *valor: 1* - [**ENCRAVADO**];
  - `Esquina`: *valor: 2* - [**ESQUINA**];
  - `Mais de uma frente`: *valor: 3* - [**MAIS_DE_UMA_FRENTE**];
  - `Fundo/Interno`: *valor: 4* - [**FUNDO_INTERNO**];
