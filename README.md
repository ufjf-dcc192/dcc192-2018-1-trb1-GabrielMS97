# dcc192-2018-1-trb1-GabrielMS97
dcc192-2018-1-trb1-GabrielMS97 created by GitHub Classroom

<h2> Identificação </h2>

Nome: Gabriel Martins Santana <br/>
Matrícula: 201576002 <br/>
Curso: Sistemas de Informação <br/>

<h2> Cenário do Sistema </h2>

<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   O sistema foi desenvolvido como trabalho para a disciplina DCC192 - Laboratório de Programação de Sistemas Web. 
   Neste contexto procurei desenvolvê-lo baseado em uma lanchonete comum.
</p>
<p>
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   O sistema apresenta funcionalidades para que o mantenedor ou responsável da lanchonete possa manter um controle de pedidos durante um
   dia de funcionamento da mesma. Portanto é possível: <br/>
   <ul>
      <li> Incluir pedidos, de acordo com os pedidos feitos pelos clientes; </li> 
      <li> Incluir e excluir itens associados aos pedidos; </li> 
      <li> Visualizar a listagem de pedidos; </li>
      <li> Visualizar a listagem de itens relacionados à um pedido; </li> 
      <li> Visualizar o valor total a ser pago por cada pedido;</li>
      <li> Fechar os pedidos, impossibilitando a inclusão de novos itens ao mesmo. </li>
   </ul>
</p>

<h2> Modelo de Dados </h2>
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   Segue um link para o Modelo de Dados do sistema:
</p>
<p>
  (https://drive.google.com/file/d/1axpXN0yvYWsm89E9__CjS2rNpdxKrFEe/view?usp=sharing)
</p>

<h2> Levantamento dos Campos Necessários </h2>
<p>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  O sistema possui uma página inicial de apresentação, uma para a criação e visualização dos pedidos e outra para
  a inclusão e visualização dos itens de um pedido. Na página de pedidos temos uma tabela que lista os pedidos feitos, juntamente com a 
  mesa que os pediu, seu valor, horários de abertura e fechamento, seus status e um link para suas listas de itens. Já na página de 
  itens, temos uma tabela que informa os itens que estão associados ao pedido, juntamente com o nome do item, seu preço e a quantidade
  pedida.

<h2> Pontos de maior dificuldade </h2>
<p>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  Minha maior dificuldade no desenvolvimento deste sistema foi fazer com que o as listas de itens ficassem referenciadas aos pedidos
  corretos. Após superar esta dificuldade o desenvolvimento pôde fluir de forma mais rápida.
</p>

<h2> Melhorias Futuras </h2>
<p>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  Algumas funcionalidades podem ser implementadas para melhorar este sistema como:
  <ul>
    <li>Permitir que sejam adicionados novos itens ao cardápio da lanchonete, além dos itens padrão;</li>
    <li>Permitir a persistência dos dados de pedidos feitos no sistema;</li>
    <li>Adicionar uma funcionalidade para gerir pedidos de delivery;</li>
    <li>Adicionar uma funcionalidade para gerir o estoque de mercadorias e ingredientes.</li>
  </ul>
</p>
