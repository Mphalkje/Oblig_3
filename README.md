# Oblig_3

Først brukte jeg IntelliJ til å opprette et github repository. Deretter gikk jeg inn på Actions og la til "Java With Maven". 

Jeg hadde en del problemer med å legge til "Java with Maven". Hvor jeg fikk opp error meldingen:
  Error: Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.1:compile (default-compile) on project Oblig2_MoritzHalkjelsvik: Fatal error compiling: error: invalid target release: 17 -> [Help 1]

Etter en del testing og googling, fant jeg ut at jeg måtte endre workflow filen min til at den skulle kjøre på versjon 11 til at den kjørte på versjon 17.

Etter litt fram og tilbake med å få lastet ned riktig versjon av IntelliJ, JDK etc... La jeg til Surefire som en dependensy i pom.xml filen min. 

Jeg hadde en del problemer med error som jeg ikke er helt klar over hvorfor oppsto, men etter at jeg endret navnet på test-filen min, fra "LeapYearTest" til "Test" kjørte alle testene, og jeg fikk riktig resultat
  Det største problemet jeg hadde var det at jeg fikk opp feil versjon av junit.jupiter.
     Dette fikk jeg fikset ved å legge koden min inn i et nytt prosjekt, etter jeg hadde oppdatert Idea'et mitt.

Fikk tips av en medstudent til hvordan man kan legge inn en "Test Result" fane under jobs. De sendte meg denne linken: https://octopus.com/blog/githubactions-running-unit-tests
