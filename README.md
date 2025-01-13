# Nome do Projeto
Tech Challenge - Parquímetro de Fiapolis

## Descrição
Os moradores de Fiapolis tem um grande desafio quando precisam estacionar seus veículos em lugares públicos da cidade. O maior problema é o sistema de parquímetro.

O sistema é usado há anos na cidade e nunca recebeu o devido suporte e atualizações, se tornando obsoleto e problemático. Diariamente apresenta erros de sistema, como lentidão e informações incorretas na hora de realizar o pagamento. Esses problemas causam irritação aos clientes, gerando assim, a falta de confiança no sistema e uma queda de faturamento, visto que os clientes vêm evitando estacionar em vagas com o parquímetro.

Outro problema bem comum é a baixa quantidade de informação sobre o veículo estacionado e seu dono. A falta dessas informações faz com que não seja possível saber quem não pagou a taxa, nem localizar essa pessoa. Trazendo um grande prejuízo mensalmente para a empresa.

Visando melhorar esse ponto, a cidade de Fiapolis decidiu contratar uma nova empresa e criar um novo sistema de parquímetro para corrigir esses problemas e fazer a gestão do mesmo.

Esse novo sistema será desenvolvido visando melhorar o processo de atendimento, deixando ele mais rápido e mais assertivo em todo o processo. 

Outro ponto que será resolvido com a implementação do novo sistema é a captação de informações sobre as vagas e veículos estacionados. Isso traz uma melhor rastreabilidade e diminui, assim, a quantidade de erros tornando o funcionamento mais seguro.

Com o novo sistema, será enviada uma notificação para o inspetor após o registro de cada veículo em uma vaga. Com essas informações, quando o inspetor for validar a legalidade do veículo, caso o veículo esteja em situação irregular, ele automaticamente recebe uma multa por sua falta de pagamento das horas adicionais em que permaneceu estacionado na vaga.

## Funcionamento
### Fluxo de Parquímetro
* Registro de parquímetro: ao instalar um novo parquímetro é necessário registrar ele no sistema, sendo necessário inserir a quantidade de vagas para carro e moto, e também os valores da hora de cada veículo.
### Fluxo de Veículos
* Registro do veículo: após estacionar em uma das vagas para veículos na rua, o condutor deve se dirigir ao parquímetro e realizar o registro do veículo no sistema e chama o serviço “Salvar Estacionamento”. Neste momento ele deve inserir os dados do veículo e efetuar o pagamento do tempo, em horas, que ele pretende utilizar aquela vaga.
* Pagamento de horas extras: em caso de atrasos ou imprevistos, é possível fazer o pagamento de horas extras para o veículo estacionado inserindo a placa do veículo e quantas horas a mais é necessário, junto com os dados para pagamento.
### Fluxo do Inspetor
* Salvar estacionamento: no momento em que o condutor registra e faz o pagamento do veículo no estacionamento rotativo, ele também é registrado no sistema do inspetor para que ele possa fazer consultas e aplicar multas, caso necessário.
* Consultar veículo: o inspetor pode fazer a consulta dos veículos através da placa, caso o veículo esteja irregular uma multa é aplicada automaticamente.

## Desenvolvedores
* Ana Carolina Oliveira Genova
* Denner Matheus Ribeiro de Oliveira
* Júlio do Nascimento Borges
* Lucas Marques Ferreira
* Rodrigo Dias Flamia
