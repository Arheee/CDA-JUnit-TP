## Application de gestion de personnel 

Cette application de gestion de personnel
est une application Java conçue pour faciliter 
la gestion des informations liées aux salariés 
d'une entreprise.

### Fonctionnalités du projet ✨

_A compléter_

### Structure du projet ✨
La structure du projet suit les conventions standard
de Maven qui contient des dossier tels que :

* **src**/ avec **tp2**/ pour le code source de l'application

* **test**/ pour les tests 
### Dépendances ✨

`Java` pour le code source.

`JUnit 5` pour les tests unitaires.

`Mockito` pour la création de mocks.

`Maven` pour la gestion des dépendances.

### 🐱‍👓Diagramme de classe ✨

````
@startuml

class Salaire {
+tauxHoraire
+payer(heures: int)
}

class Identite {
+nom
+prenom
+adresse: Adresse
}

class Adresse {
+voie
+rue
+cp
+ville
+pays
}

class SalarieCdi extends Salarie {
}

abstract class Salarie {
+salaire: Salaire
+identite: Identite
+demenager(adresse: Adresse)
+travailler(heures = 151)
+augmenter(pourcentage)
}

Salarie o-- Identite
Salarie o-- Salaire

Identite o-- Adresse

@enduml
````

### Licence ✨

_@CDA_Arheee ✨💖_