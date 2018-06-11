# APs2resumo padroes 


observer : 

é um padrao de dependencia um para muitos , que quando um objeto muda o estado , todos os seus dependentes são notificados e atualizados automaticamente . E utilizado quando eu quero eu realizo uma mudança é preciso que o sistema me retorne que realizei tao mudança e avise para o resto do sistema : O padrão Observer pode ser usado quando uma abstração tem dois aspectos, um dependente do outro. Encapsular tais aspectos em objetos separados permite que variem e sejam reusados separadamente. Quando uma mudança a um objeto requer mudanças a outros e você não sabe quantos outros objetos devem mudar ou quando um objeto deve ser capaz de avisar outros sem fazer suposições sobre quem são os objetos. Em outras palavras, sem criar um acoplamento forte entre os objetos.

----------------------------------------------------------------------------------------
singleton : 
é um padrão aonde garante a existencia de apenas um instancia de uma classe , mantendo um ponto glona de acesso ao seu objeto, essa padrão é utilizado quando eu quero chamar diversas vezes uma classe , para nao ficar toda vez criando um objeto novo para chamar essa classe usando esse padrão evita o uso desnecessario de codigo , pois você so vai chamar a classe por essa instancia.


----------------------------------------------------------------------------------------------
compose : 
é  um padrão utilizado para representar  um objeto formado pela a composição de objetos similares . Utilizamos esse padrao quando queremos tratar de varias objetos semelhantes da mesma forma : exemplo imagine um gerenciador de arquivo aonde eu preciso falar que todos os objetos sao arquivos logo todos ele pode criar , excluir e editar , utitlizando o compose isso se torna facilmente tratavel pois irei tratar esses objetodos da mesma forma deixa o codigo bem menor e mais entendivel .


----------------------------------------------------------------------------------------------

MVC:

model - view - control é um padrao que separa a representação de informação da interação do usuario com ele , muito utilizado em sistema web aonde temos os model aonde nois fazermos as regras de negocio , logica e funçoes , os controles que ser como intermediario e a view que geralmente é a GUI aonde so mostra o resoltado para o usuario final .


------------------------------------------------------------------------------------


Referencias : 

https://pt.wikipedia.org/wiki/Observer
https://pt.wikipedia.org/wiki/MVC
https://github.com/MarcosX/Padr-es-de-Projeto
https://brizeno.wordpress.com/2011/09/12/mao-na-massa-composite/
https://brizeno.wordpress.com/2011/10/17/mao-na-massa-observer/ 
