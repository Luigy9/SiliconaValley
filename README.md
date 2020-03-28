# SiliconaValley

## **Descripción de la aplicación web:**

La aplicación web esta destinada a la venta de productos informáticos y de entretenimiento como monitores,     
videojuegos,etc. Nuestra web tendrá dos partes:

  **-Parte Pública:** los usuarios podrán acceder a la web y consultar los productos disponibles y su precio.
  
  **-Parte Privada:** cuando el usuario este registrado, podran realizar los pedidos de los productos deseados.

## **Entidades principales de la aplicación:**

  **-Usuario:** es el destinatario de nuestras ventas. Puede estar registrado o no.
  
  **-Producto:** objeto que vendemos en la web. Se dispondrá de stock, el cual se actualizará segun las compras.
  
  **-Pedido:** constará de los diferentes objetos que el usuario quiera comprar.
  
  **-Mensaje:** ofrecemos un soporte al cliente para recibir mensajes de los usuario que podrán ser de 
  diferentes temas.
  
  **-Comentarios y valoración:** permitimos a los usuarios compartir su opinión sobre los productos y realizar su 
  valoración.
  
## **Servicios internos de la aplicación:**

La aplicación integrará los servicios internos:
  
  **-Comprobación del registro:** cuando realizamos el registro en la aplicación, se enviará un correo confirmando el            
  registro.
  
  **-Notificación por correo:** al realizar un usuario un pedido, se enviará la informacion de la compra a su correo.
  
## **Integrantes del equipo de desarrollo:**

  **-Jaime Oñate Rodríguez-Pardo:** j.onater@alumnos.urjc.es, jaimerman .
  
  **-Luis Alberto Riaño Osorio:** la.riano@alumnos.urjc.es, luigy9 .
  
  **-Daniel Santiago Muñoz:** d.santiagom@alumnos.urjc.es, dsantiagom95 
  
## **Capturas de pantalla:**

  **Inicio** 
  
  Aqui podemos ver la pagina inicio de la aplicación
  
  ![Captura](https://github.com/Luigy9/SiliconaValley/blob/master/capturas/inicio.png)
  
  **Ratones** 
  
  Aqui podemos ver los productos que se encuentran dentro de la categoría ratones
  
  ![Captura](https://github.com/Luigy9/SiliconaValley/blob/master/capturas/ratones.png)
  
  **Teclados** 
  
  Aqui podemos ver los productos que se encuentran dentro de la categoría teclados
  
  ![Captura](https://github.com/Luigy9/SiliconaValley/blob/master/capturas/teclados.png)
  
  **Monitores** 
  
  Aqui podemos ver los productos que se encuentran dentro de la categoría monitores
  
  ![Captura](https://github.com/Luigy9/SiliconaValley/blob/master/capturas/monitores.png)
  
  **Sobremesa** 
  
  Aqui podemos ver los productos que se encuentran dentro de la categoría sobremesa
  
  ![Captura](https://github.com/Luigy9/SiliconaValley/blob/master/capturas/sobremesa.png)
  
  **Portatiles** 
  
  Aqui podemos ver los productos que se encuentran dentro de la categoría portatiles
  
  ![Captura](https://github.com/Luigy9/SiliconaValley/blob/master/capturas/portatiles.png)
  
  **Consolas** 
  
  Aqui podemos ver los productos que se encuentran dentro de la categoría consolas
  
  ![Captura](https://github.com/Luigy9/SiliconaValley/blob/master/capturas/consolas.png)
  
  **Juegos PS4** 
  
  Aqui podemos ver los productos que se encuentran dentro de la categoría juegos ps4
  
  ![Captura](https://github.com/Luigy9/SiliconaValley/blob/master/capturas/ps4.png)
  
  **Juegos XOBOX ONE**
  
  Aqui podemos ver los productos que se encuentran dentro de la categoría juegos xbox one
  
  ![Captura](https://github.com/Luigy9/SiliconaValley/blob/master/capturas/xbox.png)
  
  **Juegos Nintendo Switch**
  
  Aqui podemos ver los productos que se encuentran dentro de la categoría juegos nintendo switch
  
  ![Captura](https://github.com/Luigy9/SiliconaValley/blob/master/capturas/nintendo.png)
  
  **Contacto**
  
  Aqui podemos ver la página contacto de la aplicación
  
  ![Captura](https://github.com/Luigy9/SiliconaValley/blob/master/capturas/contacto.png)
  
  **Carrito**
  
  Aqui podemos ver la pagina del carrito de la aplicación
  
  ![Captura](https://github.com/Luigy9/SiliconaValley/blob/master/capturas/carrito.png)
  
  
 ## **Diagrama de navegación:**
 
En el diagrama de navegación podemos ver la parte amarilla, correspondiente a la parte pública de la aplicacion, y la parte       verde, correspondiente a la parte privada de la aplicación. En cuanto a la navegacion por la página, todas las paginas tienen una relacion bidireccional, pudiendo ir a las demás páginas sin ningun problema.

![Captura](https://github.com/Luigy9/SiliconaValley/blob/master/capturas/diagrama.png)


 ## **Modelo de datos:**
 
 En cuanto al modelo de datos, es el siguiente:
  
 ![Captura](https://github.com/Luigy9/SiliconaValley/blob/master/capturas/uml.png)
 
 
 En cuanto al modelo entidad-relación, es el siguiente:
 
 ![Captura](https://github.com/Luigy9/SiliconaValley/blob/master/capturas/er.png)
 
 
 Donde podemos ver:
 
 -Un Usuario puede realizar varios pedidos y varios pedidos solo pueden tener un usuario. Relación 1:N
 
 -Un Usuario puede realizar varios mensajes y varios mensajes solo pueden tener un usuario. Relación 1:N
  
 -Un Usuario puede realizar varias valoraciones y varias valoraciones solo pueden tener un usuario. Relación 1:N
   
 -Un Producto puede estar en varios pedidos y varios pedidos pueden tener varios productos. Relación N:M
 
 -Un Producto puede realizar varias valoraciones y varias valoraciones solo pueden tener un producto. Relación 1:N
 
 
  ## **Virtualización:**


  ## **Diagrama de navegación:**
  
  
  
  
  ## **Servicio interno:**
