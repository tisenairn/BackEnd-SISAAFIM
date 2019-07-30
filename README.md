


***

# Glossário de valores das enumerações:

## Introdução
  Visto que algumas entidades que serão tratadas no sistema possuem atributos com valores predefinidos, por exemplo, um imóvel possui, objetivamente, duas naturezas. <br/>
  São elas: Predial e Territorial, estas então, podem ser enumeradas. Isto quer dizer que, a palavra "Predial" ao ser enumerada, estará intrinsecamente relacionada com o valor inteiro 0, por conseguinte, a palavra Territorial relacionar-se-á com o valor de número 1. <br/>
  Baseando-nos então neste método, decidimos demarcá-los com enumeradores. Esta abordagem nos traz mais performance e um ganho significativo nas transações do banco de dados. <br/>
>  O documento a seguir deverá auxiliar a utilizar estes valores enumeradores e conhecer os valores enumerados.

## Sumário
### Imóvel:
* [Natureza](#natureza);
* [Loteamento;](#loteamento)
* [Endereço do Imóvel:](#endereço-do-imóvel)
  - Tipo de Subunidade;
  - Bairro;
  - Edifício;
* [Informações da Unidade:](#informações-da-unidade)
  - Limitação;
  - Patrimônio;
* [Informações da Edificação:](#informações-da-edificação)
  - Tipo de Imóvel;
  - Tipo de Estrutura;
  - Utilização do Imóvel;
  - Padrão de Qualidade;
* [Informações do Terreno:](#informações-do-terreno)
  - Pedologia;
  - Topografia;
  - Estado de Conservação;
  - Situação do Terreno;

***

#### O modelo abaixo descreve como as enumerações se comportam na API e o que, cada valor inteiro (enumerador) representa como valor enumerado (String).

> Layout de Formatação do Glossário:

<**valor-enumerador**> - <`String-formatada-no-padrão-do-sistema/Valor enumerado`>

> [FAQ] - Quanto a interpretação da formatação do Glossário:

> O que é "<>"? Indica a posição onde está localizado o item descrito, serve apenas para exemplificar o formato.

> O que é o valor enumerador? É o valor no qual a API do sistema se encarrega de atribuir, este que enumera o valor do <String-formatada-no-padrão-do-sistema/Valor enumerado> - Está em negrito;

> O que é o String-formatada-no-padrão-do-sistema/Valor enumerado? é o nome que foi estabelecido na API, este, não pode conter, símbolos ou acentuações. Está em grifado;

***

## `Imóvel`:

### `Natureza`:
**0** - `PREDIAL,`<br />
**1** - `TERRITORIAL;`<br />

### `Loteamento`:
**0** - `CENTRO,`<br />
**1** - `SANTO_ANTONIO_DO_POTENGI,`<br />
**2** - `REGOMOLEIRO,`<br />
**3** - `NOVO_AMARANTE,`<br />
**4** - `JARDIM_LOLA,`<br />
**5** - `CONJUNTO_AMARANTE,`<br />
**6** - `GOLANDIM,`<br />
**7** - `DESM_RAVENNA_II,`<br />
**8** - `NEBRASKA,`<br />
**9** - `SANTA_LUZIA,`<br />
**10** - `PARQUE_DAS_CERAMICAS,`<br />
**11** - `ALMEIDAO,`<br />
**12** - `SAMBURA,`<br />
**13** - `SAMBURA_II,`<br />
**14** - `CANAA,`<br />
**15** - `PARQUE_DOS_SONHOS,`<br />
**16** - `CONJ_MONTE_LIBANO,`<br />
**17** - `SOL_NASCENTE,`<br />
**18** - `SAO_FRANCISCO_II,`<br />
**19** - `PARQUE_DOS_EUCALIPTOS,`<br />
**20** - `CONJUNTO_RES_PARQUE_DOS_COQUEIROS,`<br />
**21** - `JARDIM_LEBLOM,`<br />
**22** - `GIZELDA_CAMARA,`<br />
**23** - `BELA_VISTA,`<br />
**24** - `PATAMAR_I,`<br />
**25** - `PATAMAR_II,`<br />
**26** - `VEGA,`<br />
**27** - `CONJUNTO_PROLAR,`<br />
**28** - `ALAMEDA_POTIGUAR,`<br />
**29** - `CONJUNTO_ALAMEDA_,`<br />
**30** - `SAO_DOMINGOS,`<br />
**31** - `SAO_FRANCISCO_I,`<br />
**32** - `CAPINHACU,`<br />
**33** - `CONJUNTO_RES_MORADA_ESPACO_ABERTO,`<br />
**34** - `LISBOA,`<br />
**35** - `PARQUE_IGARACU,`<br />
**36** - `SANTO_ANTONIO,`<br />
**37** - `ESPLANADA,`<br />
**38** - `REGOMOLEIRO_LOT,`<br />
**39** - `ESPLANADA_II,`<br />
**40** - `PARQUE_MONTE_LIBANO_LOT,`<br />
**41** - `VILA_SAO_JORGE,`<br />
**42** - `BELO_HORIZONTE,`<br />
**43** - `JARDIM_REDENCAO,`<br />
**44** - `NOVO_JARDIM_REDENCAO_I,`<br />
**45** - `NOVO_JARDIM_REDENCAO_II,`<br />
**46** - `NOVA_ZELANDIA,`<br />
**47** - `PARQUE_INDUSTRIAL,`<br />
**48** - `CAMPO_BELO,`<br />
**49** - `BOA_VISTA_I,`<br />
**50** - `BOA_VISTA_II,`<br />
**51** - `BOA_VISTA_III,`<br />
**52** - `JARDIM_,`<br />
**53** - `JARDIM_BRASIL,`<br />
**54** - `JARDIM_FRANCESA,`<br />
**55** - `SAO_PEDRO_NOVO_AMARANTE,`<br />
**56** - `SAO_PEDROSTO_ANT,`<br />
**57** - `MANOEL_BEZERRA_NOVO_AMARAN,`<br />
**58** - `VILA_PARAISO,`<br />
**59** - `JOAO_ANGELO_DA_FONSECA,`<br />
**60** - `PARQUE_MONTE_LIBANO,`<br />
**61** - `MONTE_LIBANO_II,`<br />
**62** - `CONJUNTO_REGO_MOLEIRO_III,`<br />
**63** - `PADRE_JOAO_MARIA_BARREIROS,`<br />
**64** - `SAO_FRANCISCO_III,`<br />
**65** - `NOVO_SAO_GONCALO,`<br />
**66** - `ALTO_DE_SAO_GONCALO,`<br />
**67** - `ALTO_DAS_COLINAS,`<br />
**68** - `SANTA_TEREZINHA_I,`<br />
**69** - `SANTA_TEREZINHA_II,`<br />
**70** - `SANTA_TEREZINHA_III,`<br />
**71** - `NOVA_ALVORADA,`<br />
**72** - `RECANTO,`<br />
**73** - `REGO_MOLEIRO_I,`<br />
**74** - `REGO_MOLEIRO_II,`<br />
**75** - `NOVA_ZELANDIA_II,`<br />
**76** - `GANCHO,`<br />
**77** - `PLANALTO,`<br />
**78** - `TEREZA_G_DA_SILVA,`<br />
**79** - `NOVO_MILENIO,`<br />
**80** - `HORIZONTE,`<br />
**81** - `SAO_CARLOS,`<br />
**82** - `PARQUE_DAS_ROSAS,`<br />
**83** - `ENCANTO,`<br />
**84** - `BARREIROS,`<br />
**85** - `OLHO_D_AGUA_DO_CARRILHO,`<br />
**86** - `MORADA_ESPACO_ABERTO,`<br />
**87** - `JARDIM_BELO_HORIZONTE,`<br />
**88** - `MASSARANDUBA_ZONA_EXP_URBANA,`<br />
**89** - `DT_INDUSTRIAL,`<br />
**90** - `PASSAGEM_DA_VILA,`<br />
**91** - `AMARANTE,`<br />
**92** - `JARDIM_PETROPOLIS_SETOR_A,`<br />
**93** - `CONJUNTO_IPE_AMARANTE,`<br />
**94** - `LAGOA_AZUL_LOT,`<br />
**95** - `GUANDUBA,`<br />
**96** - `NOVA_MARBELLA,`<br />
**97** - `SAO_JOSE,`<br />
**98** - `SERRINHA,`<br />
**99** - `CAMPOS_VERDES_BOULEVARD,`<br />
**100** - `CIDADE_DAS_FLORES,`<br />
**101** - `PLAZA_GARDENS,`<br />
**102** - `CIDADE_DAS_ROSAS,`<br />
**103** - `DESM_PORTO_BELLO,`<br />
**104** - `DESM_CAMPOS_VERDES_FASE_I,`<br />
**105** - `DESM_CAMPOS_VERDES_FASE_II,`<br />
**106** - `SOLAR_DOS_IPES,`<br />
**107** - `DESM_RAVENNA_I,`<br />
**108** - `JUNCARA,`<br />
**109** - `GUAJIRU,`<br />
**110** - `DESM_ARUANA,`<br />
**111** - `DESM_RAVENNA_III,`<br />
**112** - `DESM_MONTEZANO_GLEBA_17,`<br />
**113** - `DESM_RENATO_BANDEIRA,`<br />
**114** - `DESM_MIRANTE_DO_SOL_I,`<br />
**115** - `DESM_MIRANTE_DO_SOL_II,`<br />
**116** - `DESM_MIRANTE_DO_SOL_III,`<br />
**117** - `DESM_MIRANTE_DO_SOL_IV,`<br />
**118** - `DESM_BOSQUE_DOS_COQUEIROS,`<br />
**119** - `COQUEIROS,`<br />
**120** - `PAU_FERRO,`<br />
**121** - `MILHARADA,`<br />
**122** - `BRASIL_RESID_JOMAR_ALECRIM,`<br />
**123** - `LAGOA_AZUL,`<br />
**124** - `BRASIL_RESID_LUIZA_QUEIROZ,`<br />
**125** - `GREEN_PARK,`<br />
**126** - `BURITI,`<br />
**127** - `PARK_BOULEVARD,`<br />
**128** - `JARDIM_PETROPOLIS_SETOR_B,`<br />
**129** - `CHACARA_BEIJA_FLOR,`<br />
**130** - `SANTA_LUCIA,`<br />
**131** - `BOSQUE_DAS_LEUCENAS,`<br />
**132** - `PARQUE_AMARANTE,`<br />
**133** - `FLORIDA_PARK,`<br />
**134** - `CISPLATINA,`<br />
**135** - `JARDIM_PETROPOLIS_SETOR_C,`<br />
**136** - `CIDADE_DAS_FLORES_II,`<br />
**137** - `DESM_JOANA_MARQUES,`<br />
**138** - `RECANTO_DAS_PALMEIRAS,`<br />
**139** - `CIDADE_DAS_ROSAS_II,`<br />
**140** - `JARDIM_PLANALTO,`<br />
**141** - `JACAREPAGUA,`<br />
**142** - `RECANTO_DOS_PASSAROS,`<br />
**143** - `FLORES_DO_CAMPO,`<br />
**144** - `GENOVA,`<br />
**145** - `FLORES_DO_CAMPO_II,`<br />
**146** - `POTENGI,`<br />
**147** - `NOVO_HORIZONTE,`<br />
**148** - `OLHO_DAGUA_DO_CHAPEU,`<br />
**149** - `CONJUNTO_HABITACIONAL_DE_TODOS,`<br />
**150** - `RIO_DA_PRATA,`<br />
**151** - `VISTA_DO_ALTO_TRIGUEIROS,`<br />
**152** - `BOSQUE_RESIDENCIAL_NATAL_NORTE,`<br />
**153** - `SANTA_BEATRIZ,`<br />
**154** - `JARDIM_BOTANICO,`<br />
**155** - `BELA_VISTA_EXPANSAO_URBANA,`<br />
**156** - `BELO_MONTE,`<br />
**157** - `CALIFORNIA,`<br />
**158** - `BOSQUE_DAS_TULIPAS,`<br />
**159** - `CATAMBOEIRA,`<br />
**160** - `MIRANTES_DA_LAGOA,`<br />
**161** - `DESM_VILLAGE,`<br />
**162** - `SAO_FRANCISCO,`<br />
**163** - `CONJUNTO_DE_TODOS,`<br />
**164** - `CHA_DO_MORENO,`<br />
**165** - `PARQUE_DAS_ANDORINHAS,`<br />
**166** - `JARDIM_ARVOREDO,`<br />
**167** - `DESM_JARDIM_PETROPOLIS,`<br />
**168** - `ALAGADICO_GRANDE,`<br />
**169** - `SANTA_HELENA,`<br />
**170** - `RIACHO_DO_MEIO,`<br />
**171** - `CIDADE_JARDIM,`<br />
**172** - `DESM_ALTO_DA_LAGOA,`<br />
**173** - `OLHO_DAGUA_DOS_LUCAS,`<br />
**174** - `RESIDENCIAL_ARAUCARIA,`<br />
**175** - `RESIDENCIAL_FLAMBOYANT,`<br />
**176** - `DESM_IGARACU_I,`<br />
**177** - `DESM_LOTES_01_AO_51,`<br />
**178** - `KERME_SOL,`<br />
**179** - `LAGOA_DE_PEDRAS,`<br />
**180** - `FAZENDA_PEQUECABA,`<br />
**181** - `FAZENDA_MILHARADA,`<br />
**182** - `RESIDENCIAL_PADRE_JOAO_MARIA,`<br />
**183** - `DESM_MASSARANDUBA,`<br />
**184** - `SOLAR_DO_POTENGI,`<br />
**185** - `LOTEAMENTO_VILA_SAO_JORGE_ESPECIAL,`<br />
**186** - `GRANJA_REGINA_LUCIA,`<br />
**187** - `GENIPAPO,`<br />
**188** - `SANTA_TEREZINHA,`<br />
**189** - `FAZENDA_JACOBINA,`<br />
**190** - `FLORIDA_PARK_II,`<br />
**191** - `DESM_GUAGIRUMIRIM_XINGU,`<br />
**192** - `SERRINHA_DE_CIMA,`<br />
**193** - `BARRO_DURO,`<br />
**194** - `PADRE_JOAO_MARIA,`<br />
**195** - `ESPLANADA_JARDIM,`<br />
**196** - `JARDIM_SETE_CASCOS,`<br />
**197** - `IGREJA_NOVA,`<br />
**198** - `CAPELA_SAO_JOSE,`<br />
**199** - `POCO_DE_PEDRA,`<br />
**200** - `COND_RES_SAO_GONCALO,`<br />
**201** - `SMART_CITY_NATAL,`<br />
**202** - `ALTO_PLANO,`<br />
**203** - `SANTOS_DUMONT,`<br />
**204** - `MIRANTE_DA_LAGOA_ML2,`<br />
**205** - `SITIO_OITEIROS,`<br />
**206** - `DESM_SANTA_HELENA,`<br />
**207** - `DESM_LISBOA,`<br />
**208** - `NOVA_MARBELLA_II,`<br />
**209** - `URUACU,`<br />
**210** - `PAJUCARA,`<br />
**211** - `BOSQUE_RESIDENCIAL;`<br />

### `Endereço do Imóvel`:
#### `Tipo de Subunidade`:

**0** - `ANDAR,`<br />
**1** - `ANEXO,`<br />
**2** - `APARTAMENTO,`<br />
**3** - `BOX,`<br />
**4** - `CASA,`<br />
**5** - `CHALE,`<br />
**6** - `CINEMA,`<br />
**7** - `CLINICA,`<br />
**8** - `CLUBE,`<br />
**9** - `COMERCIAL,`<br />
**10** - `COMPARTIMENTO,`<br />
**11** - `CONJUNTO,`<br />
**12** - `DEPOSITO,`<br />
**13** - `DUPLEX,`<br />
**14** - `ED_ESPECIAL,`<br />
**15** - `ESCOLA,`<br />
**16** - `FINANCEIRA,`<br />
**17** - `GALPAO,`<br />
**18** - `GARAGEM,`<br />
**19** - `GLEBA,`<br />
**20** - `HOSPITAL,`<br />
**21** - `HOTEL,`<br />
**22** - `INDUSTRIA,`<br />
**23** - `JUNTO,`<br />
**24** - `LOJA,`<br />
**25** - `LOTE,`<br />
**26** - `ONDE_EXISTIU,`<br />
**27** - `P_POSTERIOR,`<br />
**28** - `PAVIMENTO,`<br />
**29** - `PRACA,`<br />
**30** - `QUADRA,`<br />
**31** - `SALA,`<br />
**32** - `SOBRADO,`<br />
**33** - `SOBRELOJA,`<br />
**34** - `SUBSOLO,`<br />
**35** - `TEATRO,`<br />
**36** - `TELHEIRO,`<br />
**37** - `TERREO,`<br />
**38** - `UI,`<br />
**39** - `UNID_C,`<br />
**40** - `VILA;`<br />

#### `Bairro`:

**0** - `BAIRRO_INEXISTENTE,`<br />
**1** - `CENTRO,`<br />
**2** - `SANTO_ANTONIO_DO_POTENGI,`<br />
**3** - `REGOMOLEIRO,`<br />
**4** - `NOVO_AMARANTE,`<br />
**5** - `JARDIM_LOLA,`<br />
**6** - `GOLANDIM,`<br />
**7** - `MILHARADA,`<br />
**8** - `LOTEAMENTO_NEBRASKA,`<br />
**9** - `LOTEAMENTO_SANTA_LUZIA,`<br />
**10** - `LOTEAMENTO_PARQUE_DAS_CERAMICAS,`<br />
**11** - `LOTEAMENTO_ALMEIDAO,`<br />
**12** - `LOTEAMENTO_SAMBURA,`<br />
**13** - `LOTEAMENTO_SAMBURA_II,`<br />
**14** - `LOTEAMENTO_CANAA,`<br />
**15** - `LOTEAMENTO_PARQUE_DOS_SONHOS_AMARANTE,`<br />
**16** - `CONJUNTO_MONTE_LIBANO_NOVO_AMARANTE,`<br />
**17** - `LOTEAMENTO_SOL_NASCENTE_REGOMOLEIRO,`<br />
**18** - `LOTEAMENTO_SAO_FRANCISCO,`<br />
**19** - `LOTEAMENTO_PARQUE_DOS_EUCALIPTOS_AMARANTE,`<br />
**20** - `CONJUNTO_RESIDENCIAL_PARQUE_DOS_COQUEIROS,`<br />
**21** - `LOTEAMENTO_JARDIM_LEBLOM_GOLANDIM,`<br />
**22** - `LOTEAMENTO_GIZELDA_CAMARA_NOVO_AMARANTE,`<br />
**23** - `LOTEAMENTO_BELA_VISTA_AMARANTE,`<br />
**24** - `LOTEAMENTO_PATAMAR_I_JARDIM_LOLA,`<br />
**25** - `LOTEAMENTO_PATAMAR_II_JARDIM_LOLA,`<br />
**26** - `LOTEAMENTO_VEGA_JARDIM_LOLA,`<br />
**27** - `CONJUNTO_PROLAR_AMARANTE,`<br />
**28** - `CONJUNTO_ALAMEDA_POTIGUAR_AMARANTE,`<br />
**29** - `LOTEAMENTO_SAO_DOMINGOS_REGOMOLEIRO,`<br />
**30** - `LOTEAMENTO_SAO_FRANCISCO_I_REGOMOL,`<br />
**31** - `LOTEAMENTO_CAPINHACU_MASSARANDUB,`<br />
**32** - `CONJUNTO_RESIDENCIAL_MORADA_ESPACO_ABERTO,`<br />
**33** - `LOTEAMENTO_LISBOA_SANTO_ANT_POTENGI_,`<br />
**34** - `LOTEAMENTO_PARQUE_IGARACU_GUAJIRU,`<br />
**35** - `SANTO_ANTONIO,`<br />
**36** - `LOTEAMENTO_ESPLANADA_I_SANTO_ANTONIO,`<br />
**37** - `LOTEAMENTO_REGOMOLEIRO,`<br />
**38** - `LOTEAMENTO_ESPLANADA_II_SANTO_ANTONIO,`<br />
**39** - `LOTEAMENTO_PARQUE_MONTE_LIBANO_REGOMOLEIRO,`<br />
**40** - `LOTEAMENTO_VILA_SAO_JORGE_GUAJIRU,`<br />
**41** - `LOTEAMENTO_JARDIM_REDENCAO_GUAJI,`<br />
**42** - `LOTEAMENTO_NOVO_JARDIM_REDENCAO_I,`<br />
**43** - `LOTEAMENTO_NOVO_JARDIM_REDENCAO_II,`<br />
**44** - `LOTEAMENTO_NOVA_ZELANDIA_OLHO_D,`<br />
**45** - `LOTEAMENTO_PARQUE_INDUSTRIAL_OLHO_D,`<br />
**46** - `LOTEAMENTO_CAMPO_BELO_OLHO_D,`<br />
**47** - `LOTEAMENTO_BOA_VISTA_I_JARDINS,`<br />
**48** - `LOTEAMENTO_BOA_VISTA_II_JARDINS,`<br />
**49** - `LOTEAMENTO_BOA_VISTA_III_JARDINS,`<br />
**50** - `LOTEAMENTO_JARDIM_JARDINS,`<br />
**51** - `LOTEAMENTO_JARDIM_BRASIL_JARDINS,`<br />
**52** - `LOTEAMENTO_JARDIM_FRANCESA_GUAJI,`<br />
**53** - `LOTEAMENTO_SAO_PEDRO_AMARANTE,`<br />
**54** - `LOTEAMENTO_SAO_PEDRO_SANTO_ANT_POTENGI_,`<br />
**55** - `LOTEAMENTO_MANOEL_BEZERRA_AMARANTE,`<br />
**56** - `LOTEAMENTO_VILA_PARAISO_OLHO_D,`<br />
**57** - `LOTEAMENTO_JOAO_ANGELO_DA_FONSECA,`<br />
**58** - `LOTEAMENTO_MONTE_LIBANO_AMARANTE,`<br />
**59** - `LOTEAMENTO_MONTE_LIBANO_II_NOVO_AMARA,`<br />
**60** - `CONJUNTO_REGOMOLEIRO_III,`<br />
**61** - `LOTEAMENTO_PADRE_JOAO_MARIA,`<br />
**62** - `LOTEAMENTO_SAO_FRANCISCO_III_GOLANDIM,`<br />
**63** - `LOTEAMENTO_NOVO_SAO_GONCALO,`<br />
**64** - `LOTEAMENTO_ALTO_DE_SAO_GONCALO,`<br />
**65** - `LOTEAMENTO_ALTO_DAS_COLINAS,`<br />
**66** - `LOTEAMENTO_SANTA_TEREZINHA_I,`<br />
**67** - `LOTEAMENTO_SANTA_TEREZINHA_II,`<br />
**68** - `LOTEAMENTO_SANTA_TEREZINHA_III,`<br />
**69** - `LOTEAMENTO_NOVA_ALVORADA,`<br />
**70** - `LOTEAMENTO_RECANTO,`<br />
**71** - `LOTEAMENTO_REGOMOLEIRO_I,`<br />
**72** - `LOTEAMENTO_REGOMOLEIRO_II,`<br />
**73** - `NOVA_ZELANDIA_II_OLHO_D,`<br />
**74** - `LOTEAMENTO_GANCHO_AMARANTE,`<br />
**75** - `LOTEAMENTO_PLANALTO,`<br />
**76** - `LOTEAMENTO_TEREZA_G_DA_SILVA_AMARANTE,`<br />
**77** - `LOTEAMENTO_NOVO_MILENIO_TRIGUEIROS_,`<br />
**78** - `LOTEAMENTO_HORIZONTE_REGOMOLEIRO_,`<br />
**79** - `LOTEAMENTO_SAO_CARLOS,`<br />
**80** - `LOTEAMENTO_PARQUE_DAS_ROSAS,`<br />
**81** - `LOTEAMENTO_ENCANTO,`<br />
**82** - `BARREIROS,`<br />
**83** - `OLHO_DAGUA_DO_CARRILHO,`<br />
**84** - `MORADA_ESPACO_ABERTO,`<br />
**85** - `LOTEAMENTO_JARDIM_BELO_HORIZONTE,`<br />
**86** - `MACARANDUBA,`<br />
**87** - `DT_INDUSTRIAL,`<br />
**88** - `PASSAGEM_DA_VILA,`<br />
**89** - `AMARANTE,`<br />
**90** - `CONJUNTO_JARDIM_PETROPOLIS,`<br />
**91** - `CONJUNTO_IPE_AMARANTE,`<br />
**92** - `LAGOA_AZUL,`<br />
**93** - `GUANDUBA,`<br />
**94** - `LOTEAMENTO_NOVA_MARBELLA_REGOMOLEIRO,`<br />
**95** - `ZONA_RURAL,`<br />
**96** - `ZONA_DE_EXPANSAO_URBANA,`<br />
**97** - `OITEIROS,`<br />
**98** - `GUAJIRU,`<br />
**99** - `URUACU,`<br />
**100** - `COQUEIROS,`<br />
**101** - `IGREJA_NOVA,`<br />
**102** - `SERRINHA,`<br />
**103** - `CARNAUBINHA,`<br />
**104** - `BELA_VISTA,`<br />
**105** - `CHA_DO_MORENO,`<br />
**106** - `LADEIRA_GRANDE,`<br />
**107** - `JACOBINA,`<br />
**108** - `POCO_DE_PEDRA,`<br />
**109** - `JACARE_MIRIM,`<br />
**110** - `PAJUCARA,`<br />
**111** - `CAMPOS_VERDES_BOULEVARD,`<br />
**112** - `OLHO_DAGUA_DO_CHAPEU,`<br />
**113** - `LOTEAMENTO_CIDADE_DAS_FLORES,`<br />
**114** - `BARRO_DURO,`<br />
**115** - `LOTEAMENTO_PLAZA_GARDENS,`<br />
**116** - `OLHO_DAGUA_DE_BAIXO,`<br />
**117** - `CIDADE_DO_SOL,`<br />
**118** - `TRIGUEIROS,`<br />
**119** - `LOTEAMENTO_CIDADE_DAS_ROSAS,`<br />
**120** - `IGAPO,`<br />
**121** - `FELIPE_CAMARAO,`<br />
**122** - `PAU_FERRO,`<br />
**123** - `UTINGA,`<br />
**124** - `DESM_BOSQUE_DOS_COQUEIROS,`<br />
**125** - `JARDIM_PETROPOLIS,`<br />
**126** - `JARDINS,`<br />
**127** - `JACAREPAGUA,`<br />
**128** - `CALIFORNIA,`<br />
**129** - `CATAMBOEIRA,`<br />
**130** - `JARDIM_ARVOREDO,`<br />
**131** - `OLHO_DAGUA,`<br />
**132** - `RIACHO_DO_MEIO,`<br />
**133** - `NOVO_SAO_GONCALO,`<br />
**134** - `JENIPAPU,`<br />
**135** - `SANTA_TEREZINHA,`<br />
**136** - `RIO_DA_PRATA,`<br />
**137** - `OUTROS,`<br />
**138** - `SANTOS_DUMONT,`<br />
**139** - `DESM_LISBOA_SANTO_ANTONIO;`<br />

#### `Edifício`:

**0** - `CONJUNTO_REGOMOLEIRO_III,`<br />
**1** - `CONJUNTO_JARD_PETROPOLIS,`<br />
**2** - `CONDOMINIO_BRISA_POTENGI_I,`<br />
**3** - `CONDOMINIO_BRISA_POTENGI_II,`<br />
**4** - `CONDOMINIO_PORTO_DO_POTENGI,`<br />
**5** - `CONDOMINIO_CORAIS_DO_POTENGI_I,`<br />
**6** - `CONDOMINIO_GAMBOA_POTENGI_I,`<br />
**7** - `CONDOMINIO_GAMBOA_POTENGI_II,`<br />
**8** - `CONDOMINIO_GAMBOA_POTENGI_III,`<br />
**9** - `CONDOMINIO_GAMBOA_POTENGI_IV,`<br />
**10** - `CONDOMINIO_CORAIS_DO_POTENGI_II,`<br />
**11** - `CONDOMINIO_CORAIS_DO_POTENGI_III,`<br />
**12** - `CONDOMINIO_CORAIS_DO_POTENGI_IV,`<br />
**13** - `CONDOMINIO_CORAIS_DO_POTENGI_V,`<br />
**14** - `CONJUNTO_AIRTON_SENNA,`<br />
**15** - `CONDOMINIO_VILA_PARAISO,`<br />
**16** - `CONDOMINIO_BELEM,`<br />
**17** - `ARTE_OPERA_I,`<br />
**18** - `ARTE_OPERA_II,`<br />
**19** - `RESIDENCIAL_AMAZONAS,`<br />
**20** - `RESIDENCIAL_VILA_FLOR,`<br />
**21** - `PARQUE_DOS_GIRASSOIS,`<br />
**22** - `MANARI,`<br />
**23** - `CONDOMINIO_RECANTO_DAS_ARVORESIDENCIAL_I,`<br />
**24** - `CONDOMINIO_MIRANTES_DA_LAGOA_1,`<br />
**25** - `RESIDENCIAL_GERBERA,`<br />
**26** - `JARDIM_DOS_LIRIOS,`<br />
**27** - `JARDIM_DAS_HORTENCIAS,`<br />
**28** - `CONDOMINIO_PORTO_DO_POTENGI_II,`<br />
**29** - `CONDOMINIO_PORTO_DO_POTENGI_III,`<br />
**30** - `CONDOMINIO_PORTO_DO_POTENGI_IV,`<br />
**31** - `CONDOMINIO_PORTO_DO_POTENGI_V,`<br />
**32** - `CONDOMINIO_PORTO_DO_POTENGI_VI,`<br />
**33** - `RESIDENCIAL_INTERCITIES,`<br />
**34** - `CONDOMINIO_CORAIS_DO_POTENGI_VI,`<br />
**35** - `CONDOMINIO_CORAIS_DO_POTENGI_VII,`<br />
**36** - `CONDOMINIO_CORAIS_DO_POTENGI_VIII,`<br />
**37** - `CONDOMINIO_CORAIS_DO_POTENGI_10,`<br />
**38** - `CONDOMINIO_CORAIS_DO_POTENGI_11,`<br />
**39** - `CONDOMINIO_RESIDENCIAL_VILLAGE,`<br />
**40** - `CONDOMINIO_LUANA_AVILA,`<br />
**41** - `ESCOLA_LEA_FELIPE,`<br />
**42** - `CONDOMINIO_RESIDENCIAL_SAO_GONCALO,`<br />
**43** - `SHOCK_SHOW,`<br />
**44** - `CONDOMINIO_ALHAMBRA_I,`<br />
**45** - `CONDOMINIO_RESIDENCIAL_PORTO_UNICO,`<br />
**46** - `CONDOMINIO_RESIDENCIAL_CIDADE_DO_CABO,`<br />
**47** - `RESIDENCIAL_CANTO_DOS_PASSAROS,`<br />
**48** - `RESIDENCIAL_JEQUITIBA,`<br />
**49** - `RAIZEN_COMBUSTIVEIS_S_A_,`<br />
**50** - `CONDOMINIO_SAO_GONCALO_AMARANTE_01,`<br />
**51** - `RESIDENCIAL_IPE_AMARELO,`<br />
**52** - `CONDOMINIO_SAO_GONCALO_AMARANTE_02,`<br />
**53** - `RESIDENCIAL_JACARANDA,`<br />
**54** - `CONDOMINIO_SAO_GONCALO_AMARANTE_03,`<br />
**55** - `CONDOMINIO_SAO_GONCALO_AMARANTE_04,`<br />
**56** - `RESIDENCIAL_PIRANGI,`<br />
**57** - `CONDOMINIO_SAO_GONCALO_AMARANTE_05,`<br />
**58** - `RESIDENCIAL_TIBAU_DO_SUL,`<br />
**59** - `CONDOMINIO_SAO_GONCALO_AMARANTE_06,`<br />
**60** - `CONJUNTO_IPE_GANCHO,`<br />
**61** - `RESIDENCIAL_ARAUCARIA,`<br />
**62** - `RESIDENCIAL_FLAMBOYANT,`<br />
**63** - `AREA_REM_CID_DOS_PINTORESIDENCIAL_I_A,`<br />
**64** - `AREA_REM_CID_DOS_PINTORESIDENCIAL_I_B,`<br />
**65** - `AREA_REM_CID_DOS_PINTORESIDENCIAL_I_C,`<br />
**66** - `AREA_REM_CID_DOS_PINTORESIDENCIAL_III,`<br />
**67** - `QUINTA_DO_GUAJIRU_I,`<br />
**68** - `QUINTA_DO_GUARIJU_II,`<br />
**69** - `QUINTA_DO_GUARIJU_III,`<br />
**70** - `QUINTA_DO_GUARIJU_IV,`<br />
**71** - `QUINTA_DO_GUARIJU_V,`<br />
**72** - `QUINTA_DO_GUARIJU_VI,`<br />
**73** - `QUINTA_DO_GUARIJU_VII,`<br />
**74** - `QUINTA_DO_GUARIJU_VIII,`<br />
**75** - `IPES_I,`<br />
**76** - `IPES_II,`<br />
**77** - `IPES_III,`<br />
**78** - `IPES_IV,`<br />
**79** - `IPES_V,`<br />
**80** - `IPES_VI,`<br />
**81** - `IPES_VII,`<br />
**82** - `IPES_VIII,`<br />
**83** - `IPES_IX,`<br />
**84** - `PROSPERAR_RESIDENCE_I,`<br />
**85** - `PROSPERAR_RESIDENCE_II,`<br />
**86** - `PROSPERAR_RESIDENCE_III,`<br />
**87** - `PROSPERAR_RESIDENCE_IV,`<br />
**88** - `PROSPERAR_RESIDENCE_V,`<br />
**89** - `RESIDENCIAL_LUXEMBURGO,`<br />
**90** - `RESIDENCIAL_LARANJEIRAS,`<br />
**91** - `RESIDENCIAL_GARDENIA,`<br />
**92** - `BOSQUE_RESIDENCIAL,`<br />
**93** - `CONFORT_COLISEUM,`<br />
**94** - `RESIDENCIAL_OLHO_DAGUA_I,`<br />
**95** - `PORTO_ESPERANCA,`<br />
**96** - `RESIDENCIAL_DAS_ALAMANDAS,`<br />
**97** - `RESIDENCIAL_PORTO_UNICO,`<br />
**98** - `RESIDENCIAL_BARCELONA,`<br />
**99** - `CONDOMINIO_ESPERANCA_I,`<br />
**100** - `CONDOMINIO_ACACIAS,`<br />
**101** - `CONDOMINIO_PORTAL_DAS_FLORES,`<br />
**102** - `RESIDENCIAL_SAO_GONCALO,`<br />
**103** - `CONDOMINIO_PARQUE_DAS_FLORES,`<br />
**104** - `CONDOMINIO_ALAMO,`<br />
**105** - `CONDOMINIO_BOSQUE_DOS_BURITIS,`<br />
**106** - `RESIDENCIAL_BARRA_DE_CUNHAU,`<br />
**107** - `MIRANTES_DA_LAGOA_II,`<br />
**108** - `RESIDENCIAL_ALTO_DOS_LIRIOS_II,`<br />
**109** - `RESIDENCIAL_ALTO_DOS_LIRIOS_V,`<br />
**110** - `RESIDENCIAL_ALTO_DOS_LIRIOS_III,`<br />
**111** - `RESIDENCIAL_DAS_ORQUIDEAS,`<br />
**112** - `RESIDENCIAL_ALTO_DOS_LIRIOS_IV,`<br />
**113** - `RESIDENCIAL_MURIU,`<br />
**114** - `RESIDENCIAL_GALINHOS,`<br />
**115** - `RESIDENCIAL_PRAIA_DE_JACUMA,`<br />
**116** - `RESIDENCIAL_DAS_BROMELIAS_I,`<br />
**117** - `RESIDENCIAL_DAS_BROMELIAS_II,`<br />
**118** - `RESIDENCIAL_DAS_BROMELIAS_III,`<br />
**119** - `CONDOMINIO_RESIDENCIAL_CASA_NOVA_GREEN,`<br />
**120** - `RESIDENCIAL_RECANTO_DAS_BROMELIAS_III;`<br />

### `Informações da Unidade`:
#### `Limitação`:

**0** - `MURADO,`<br />
**1** - `PARCIALMENTE_MURADO,`<br />
**2** - `NAO_MURADO;`<br />

#### `Patrimônio`:

**0** - `PARTICULAR,`<br />
**1** - `PUBLICO,`<br />
**2** - `RELIGIOSO,`<br />
**3** - `OUTROS;`<br />

### `Informações da edificação`:
#### `Tipo de imóvel`:

**0** - `APARTAMENTO,`<br />
**1** - `EDIFICIO_COMERCIAL,`<br />
**2** - `CASA_ISOLADA,`<br />
**3** - `CASA_GERMINADA_1L,`<br />
**4** - `CASA_GERMINADA_2L,`<br />
**5** - `LOJA_GALERIA_SHOPPING,`<br />
**6** - `CLUBE_CINEMA,`<br />
**7** - `GINASIO,`<br />
**8** - `EDIFICACAO_ESPECIAL,`<br />
**9** - `EDUCACAO,`<br />
**10** - `TEMPLO,`<br />
**11** - `GARAGEM_DEPOSITO,`<br />
**12** - `HOTEL_POUSADA_MOTEL,`<br />
**13** - `GALPAO,`<br />
**14** - `INDUSTRIA_FABRICA,`<br />
**15** - `HOSPITAL_CLINICA,`<br />
**16** - `SUBSTACAO,`<br />
**17** - `POSTO_DE_COMBUSTIVEL,`<br />
**18** - `INSTITUICAO_FINANCEIRA,`<br />
**19** - `TELHEIRO_EDIFICACAO_PRECARIA,`<br />
**20** - `CONTRUCAO_PRECARIA,`<br />
**21** - `TERRENO;`<br />

#### `Tipo de Estrutura`:

**0**	-	`CONCRETO,`<br />
**1**	-	`MISTA,`<br />
**2**	-	`METALICA,`<br />
**3**	-	`ALVENARIA,`<br />
**4**	-	`MADEIRA,`<br />
**5**	-	`TAIPA,`<br />
**6**	-	`OUTROS;`<br />

#### `Utilização do imóvel`:

**0** - `RESIDENCIAL,`<br />
**1** - `INDUSTRIAL,`<br />
**2** - `MISTA,`<br />
**3** - `COMERCIAL,`<br />
**4** - `HOSPITAL,`<br />
**5** - `ENTRADA_PUBLICA,`<br />
**6** - `PRESTACAO_DE_SERVICO,`<br />
**7** - `EDUCACAO;`<br />

#### `Padrão de Qualidade`:

**0** - `ESPECIAL,`<br />
**1** - `OTIMO,`<br />
**2** - `BOM,`<br />
**3** - `REGULAR;`<br />

### `Informações do terreno`:
#### `Pedologia`:

**0**	-	`NORMAL,`<br />
**1**	-	`ALAGADO_TOTAL,`<br />
**2**	-	`ALAGADO_50_POSITIVO,`<br />
**3**	-	`ALAGADO_50_NEGATIVO;`<br />

#### `Topografia`:

**0**	-	`PLANO,`<br />
**1**	-	`ACLIVE_DECLIVE,`<br />
**2**	-	`REDUCAO_DE_CAPACIDADE,`<br />
**3**	-	`FORMATO_QUE_IMPEDE_CONSTRUCAO;`<br />

#### `Estado de Conservação`:

**0**	-	`OTIMO,`<br />
**1**	-	`BOM,`<br />
**2**	-	`REGULAR,`<br />
**3**	-	`RUIM;`<br />

#### `Situação do Terreno`:

**0**	-	`MEIO_DE_QUADRA,`<br />
**1**	-	`ENCRAVADO,`<br />
**2**	-	`ESQUINA,`<br />
**3**	-	`MAIS_DE_UMA_FRENTE,`<br />
