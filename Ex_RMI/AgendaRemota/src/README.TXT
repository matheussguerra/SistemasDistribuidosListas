Atividade:

Implementar um sistema de agenda remota usando RMI Java.

Deve-se especificar uma estrutura que represente um Compromisso na Agenda que contenha os campos:
- data, hora, assunto, descricao, notificacao.

Deve-se especificar uma interface de serviço que possibilite as seguintes operações:
1. Adicionar um compromisso. ok
2. Alterar um compromisso. ok
3. Remover um compromisso. ok
4. Listar os compromissos de uma data específica ok
5. Exibir todos os compromissos da Agenda. ok (ficou junto com o passo 4)

Lembrem-se que as informações estão remotas e são acessadas via um objeto remoto.

É fornecida uma GUI básica semi-implementada com duas classes:
- AgendaGUI: apresenta as operações a serem realizadas remotamente e a visualização dos dados.
- CompromissoGUI: possibilita a adição dos compromissos na Agenda.

Na AgendaGUI, para obter a referência remota, implemente a ação para o botão "Login". ok
Para remover a referência remota, implemente a ação para o botão "Logout". ok (faltou remover referencia)
No "Logout"  não é necessário realizar acesso remoto. ok

Ao realizar o "Login", acesse remotamente todos os compromissos e exiba para o usuário. ok