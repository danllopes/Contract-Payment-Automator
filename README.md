# Automatizador de Pagamento de Contratos

Este projeto Java foi desenvolvido para automatizar o processamento de pagamentos de contratos empresariais, utilizando conceitos de interfaces para calcular parcelas mensais com juros simples e taxa fixa. Implementado como parte do aprendizado em programação Java.

## Descrição do Projeto

O projeto consiste em um programa Java que automatiza o processamento de pagamentos de contratos empresariais seguindo os passos abaixo:

1. ### Entrada de Dados do Contrato:
   - O usuário insere os dados do contrato, incluindo número do contrato, data de início e valor total do contrato.

2. ### Definição do Parcelamento:
   - Após inserir os dados do contrato, o usuário informa o número de meses desejado para o parcelamento do contrato.

3. ### Cálculo e Geração de Parcelas:
   - Com base nos dados inseridos, o programa calcula e gera as parcelas mensais a serem pagas, considerando juros simples e uma taxa fixa por parcela.

4. ### Exibição das Parcelas:
   - Após o processamento, o programa exibe as informações das parcelas geradas, incluindo data de vencimento e valor de cada parcela.

## Funcionalidades Implementadas

- **Classe `Contract`:** Representa um contrato com métodos para armazenar informações como número, data de início e valor total.
- **Classe `Installment`:** Representa uma parcela de pagamento com métodos para armazenar data de vencimento e valor.
- **Interface `PaymentService`:** Define os métodos para cálculo de juros e taxa de pagamento, implementada pela classe `PaypalService`.
- **Classe `ContractService`:** Utiliza um serviço de pagamento (como `PaypalService`) para processar o contrato e gerar as parcelas mensais.
- **Interface de Usuário por Console:** Interage com o usuário através de entradas e saídas no console, permitindo a entrada dos dados do contrato e exibindo as parcelas geradas.

## Tecnologias Utilizadas

- Java 21
- IntelliJ IDEA

## Como Executar

1. Clone o repositório para o seu ambiente local.
2. Abra o projeto no IntelliJ IDEA.
3. Execute o programa a partir do método `main` na classe `Main`.
4. Siga as instruções apresentadas no console para inserir os dados do contrato e configurar o parcelamento.
5. O programa calculará e exibirá as parcelas mensais do contrato com base nos dados inseridos.

## Exemplo de Uso

Ao iniciar o programa, siga as instruções apresentadas no console para inserir os dados do contrato, como número, data de início e valor total. Informe o número de meses desejado para o parcelamento e o programa calculará automaticamente as parcelas mensais com juros simples e taxa fixa. As parcelas geradas serão exibidas na tela com suas respectivas datas de vencimento e valores.

