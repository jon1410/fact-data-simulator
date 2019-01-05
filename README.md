# fact-data-simulator

Eine Applikation zum erzeugen von Testdaten für eine Faktentabelle (Umsatz) für ein IUBH-Projekt.

# Prerequisites
Eine laufende MySQL Instanz unter localhost:3306/iwbi starten (ggf. anpassen in application.properties, wenn JDBC-Url anders)

# How to use

Entweder mittels git clone das Repository klonen oder das Zip herunterladen.
Im Anschluss in einer IDE öffnen und die Main-Klasse FactDataSimulatorApplication.java ausführen

Alternativ mit Maven bauen und das erzeugte Uber-JAR direkt aus dem /target-Verzeichnis starten

1. mvn clean install (oder package)
2. cd /target
3. java -jar fact-data-simulator-0.0.1-SNAPSHOT.jar

Hinweis zum mvn clean install: eine MySQL-Instanz muss laufen, da mit dem Command Tests zum Starten des Spring Context ausgeführt werden.
Ggf. mit -DskipTests ausführen

URL: http://localhost:8080/facts/generate?timekey=<<timekeyValue>>
