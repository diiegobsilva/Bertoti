# Bertoti
  <p>
 1) Classe ContaBancaria:
  A classe ContaBancaria representa uma conta bancária com um número de conta e um saldo. Ela possui métodos para depositar e sacar dinheiro da conta, além de gerenciar uma lista de
  observadores. Quando ocorre uma operação de depósito ou saque, a classe notifica todos os observadores registrados sobre a mudança no saldo.

  2) Interface OperacaoBancaria (Strategy):
  A interface OperacaoBancaria define o contrato para as operações bancárias, como depósito e saque. Ela possui um único método executar() que é implementado pelas estratégias concretas.

  3) Classes Deposito e Saque (estratégias concretas):
  As classes Deposito e Saque implementam a interface OperacaoBancaria e representam estratégias concretas para realizar as operações de depósito e saque, respectivamente. Cada uma dessas classes recebe uma instância da classe ContaBancaria no construtor para poder executar a operação correspondente na conta.

  4) Interface Observador (Observer):
  A interface Observador define o contrato para os objetos que desejam ser notificados sobre mudanças no saldo da conta bancária. Ela possui um único método atualizar() que é chamado quando ocorre uma alteração no saldo.

  5) Classe NotificacaoSaldo (observador concreto):
  A classe NotificacaoSaldo implementa a interface Observador e representa um observador concreto que imprime o saldo atualizado sempre que ocorre uma operação de depósito ou saque na conta bancária. Essa classe também é responsável por registrar-se como observador da conta bancária no momento da sua criação.

  6) Classe BancoFacade (Facade):
  A classe BancoFacade atua como uma fachada simplificada para interagir com o banco. Ela recebe um número de conta e um saldo inicial no construtor e encapsula as operações bancárias (depósito e saque), a conta bancária e o objeto de notificação de saldo. Através dos métodos depositar() e sacar() da fachada, o cliente pode interagir com a conta bancária sem precisar conhecer os detalhes internos da implementação.
  </p>
  <hr/>

