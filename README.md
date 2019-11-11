# Reto Intercorp Microservicios

Ruta Swagger: http://intercorp-api-gateway.herokuapp.com/client-service/swagger-ui.html

### Notas

El proyecto está desplegado en Heroku con Free Dynos. Esto implica que los servidores entran en modo de suspensión cada 30 minutos de inactividad. Para visualizar el proyecto correctamente se tiene que hacer lo siguiente, respetando el orden:

  ```bash
curl https://intercorp-eureka-server.herokuapp.com
curl https://intercorp-eureka-client.herokuapp.com
curl https://intercorp-api-gateway.herokuapp.com
```
