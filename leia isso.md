# Trabalho Aula5_4 lista duplamente encadeada
 1. Introdução "Hoje eu vou apresentar um projeto simples, mas muito útil, voltado
para a mobilidade urbana, com base na ODS 11 – Cidades e Comunidades
Sustentáveis. A proposta é desenvolver um sistema em Java que armazene e consulte
rotas de transporte público, como ônibus, metrô e trem, utilizando uma lista
duplamente encadeada."
 2. Objetivo do Projeto "O objetivo do sistema é:
Ler os dados de um arquivo
Filtrar as rotas por tipo de transporte ou região
Exibir as rotas tanto no sentido normal quanto no inverso, aproveitando os ponteiros da
lista duplamente encadeada."
 3. Estrutura do Código "O código está dividido em 3 partes principais:
 Classe No: Representa um elemento da lista.
Armazena: ID, nome da linha, tipo, região, e os ponteiros anterior e proximo.
 Classe ListaDuplamenteEncadeada: Responsável por armazenar os nós e
manipular a lista.
Funções principais:
inserirNaLista() → insere no final da lista.
carregarRotasDeArquivo() → lê o arquivo e aplica o filtro.
exibirListaEmOrdem() → mostra do primeiro ao último.
exibirListaEmOrdemInversa() → mostra do último ao primeiro.
liberarLista() → limpa a memória.
 Classe GerenciadorDeRotas (main): Pede ao usuário um filtro (tipo ou região).
Carrega os dados do arquivo .txt.
Exibe os resultados nos dois sentidos.
No final, libera a memória.
 4. Exemplo de Arquivo de Entrada
"O arquivo rotas_de_transportes tem esse formato: ID;Nome da Linha;Tipo;Região
Exemplo:
3;Expresso Norte;Ônibus;Zona Norte 6;BRT Express;Ônibus;Centro 7;Linha
Amarela;Trem;Zona Norte
 5. Conclusão "Esse exercício mostra na prática como aplicar estruturas de dados
como a lista duplamente encadeada.
Ele também reforça leitura de arquivos, manipulação de nós e filtros dinâmicos com
entrada do usuário.
Além disso, está diretamente relacionado com a sustentabilidade urbana da ODS 11,
ajudando a organizar rotas de transporte de forma inteligente."
