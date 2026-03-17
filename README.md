# Spring Cloud Microservices Lab - Infraestrutura

Este repositório é o laboratório inicial para validação de arquitetura de microsserviços. O objetivo aqui é estabelecer a conectividade.

## 🧱 Componentes Atuais

* **service-main**: Servidor central que integra:
    * **Spring Cloud Config Server**: Busca configurações remotas no repositório `config-server-microservices-lab`.
    * **Netflix Eureka Server**: Gerencia o registro e descoberta de instâncias.
* **service-one**: Cliente de validação.
    * Consome propriedades dinâmicas do Config Server.
    * Registra-se automaticamente no Eureka.

## 🚦 Status de Validação
- [x] Config Server lendo do GitHub.
- [x] Eureka Server operando na porta 8888.
- [x] Service-one registrando com sucesso.
- [x] Endpoint `/message` refletindo o Config Server.

## ⚙️ Configurações Externas

Este projeto utiliza o **Spring Cloud Config** para centralizar as configurações. Os arquivos de propriedades (`.properties`) de cada serviço estão hospedados no seguinte repositório:

🔗 [config-server-microservices-lab](https://github.com/1LucasSena/config-server-microservices-lab)

> **Nota:** Certifique-se de que a URL no arquivo `application.properties` do `service-main` está apontando corretamente para este repositório para que os serviços subam com as configurações desejadas.