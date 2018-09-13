<h1>Scrapping Java! by@luisfsolano</h1>
En este repo podras ver un proyecto Java Maven que utiliza jsoup para hacer Scrapping. Hecho en NetBeans


<h2>la victima</h2>
La empresa MetroBus Panamá y su página de consulta de saldo


<h2>Complejidad</h2>
Básica, de hecho traté de eliminarle todo el codigo de maquillaje posible, solo quedó lo necesario, y aunque aun se puede mejorar, tambien se tenia que entender de una manera simple

<h2>Funcionamiento</h2>
Se trabaja directamente sobre la URL que hace la petición que seria la de a continuación

<br>
http://200.46.245.230:8080/PortalCAE-WAR-MODULE/SesionPortalServlet?accion=6&NumDistribuidor=99&NomUsuario=usuInternet&NomHost=AFT&NomDominio=aft.cl&Trx=&RutUsuario=0&NumTarjeta="+id+"&bloqueable=

como pueden ver el ejemplo se hace mas sencillo aún porque la peticion se maneja por Get, más adelante veremos como implementarlo en una app.
