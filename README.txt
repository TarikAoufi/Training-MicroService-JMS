Demo d'un Micro-Service, qui montre comment : 
						 + Créer un Listener JMS 
						 + Recevoir des messages à partir d'un client JMS via un broker ActiveMQ

URL pour tester les WS DATA REST :
	+ Liste des étudiants:			http://localhost:8080/api/students
	+ Liste des formations:			http://localhost:8080/api/trainings
	
	+ Lorsqu'on utilise des projections nommées 'P1' et 'P2'
		http://localhost:8080/api/students?projection=P1
		http://localhost:8080/api/students?projection=P2
		
	+ Lorsqu'on envoyer des messages à un client JMS
		http://localhost:8080/sendMessage?message=hello   
