mvn -q clean package

sudo cp target/BancoDeDados.war /var/lib/tomcat9/webapps/

sudo systemctl restart tomcat9
