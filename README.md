Study API project under development for Sales Promoters. We can add products and their expiration date. Every Product has a Shop who has a City, and these three entitys can be CRUD'ed.

It's beign based on MSR (Mergulho Spring Rest) project, which can be visualized in https://github.com/Juuliocq/MSRApi, and some improvements are beign added to DateControlAPI, some of them:

Complete separation of the repository and service layers from the point of view of the controller layer.
In original project, the controller layer access methods from repository, crossing the responsibility of the service layer.



Projeto SPI de estudos em desenvolvimento para Promotores de Vendas. Podemos adicionar produtos e suas datas de validade. Cada Produto tem uma Loja que tem uma Cidade, e essas três entidades podem ser criadas, lidas, atualizadas e deletadas.

Está sendo baseado no projeto MSR (Mergulho Spring Rest), que pode ser visualizado em https://github.com/Juuliocq/MSRApi, e algumas melhorias estão sendo adicionadas ao DateControlAPI, algumas delas:

Separação completa das camadas de repositório e serviço do ponto de vista da camada de controlador.
No projeto original, a camada controladora acessa os métodos do repositório, cruzando a responsabilidade da camada de serviço. 