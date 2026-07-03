É uma arquitetura onde o **front-end é dividido em partes menores e independentes**, parecida com a ideia de microserviços no backend.

Sistema Web
 ├── MFE Login
 ├── MFE Dashboard
 ├── MFE Produtos
 ├── MFE Pagamentos
 └── MFE Perfil do Usuário
 
Cada **MFE** pode ser desenvolvido, testado e publicado separadamente por times diferentes.

Um sistema com MFE geralmente tem uma aplicação principal chamada **Shell**, **Container** ou **Host**, que carrega os micro frontends.

Usuário
  -> Shell/Host/Container
      -> carrega MFE Produtos
      -> carrega MFE Pagamentos
      -> carrega MFE Perfil