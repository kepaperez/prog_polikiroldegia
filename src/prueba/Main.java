package prueba;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

sudo apt-get install phpldapadmin -y	
	
	http://localhost/phpldapadmin/
	
	sudo nano /usr/share/phpldapadmin/config/config.php
	
		
$servers->setValue('server','base',array('dc=somebooks,dc=local'));
...
$servers->setValue('login','bind_id','cn=admin,dc=somebooks,dc=local');

	
	
}
