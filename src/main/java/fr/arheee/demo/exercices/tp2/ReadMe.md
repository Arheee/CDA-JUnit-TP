<h2 p align="center"> Application de gestion de personnel </h2> 
<h4 p align="center"> ༼ つ ◕_◕ ༽つ </h4>

Cette application de gestion de personnel
est une application Java conçue pour faciliter 
la gestion des informations liées aux salariés 
d'une entreprise.

<h3 p align="center"> Fonctionnalités du projet ✨ </h3>
Pour le moment le projet ne contient qu'un Salarié en CDI.

On peut lui attribuer une adresse, une identité, un salaire.
On peut aussi modifier ses informations personnel
ou augmenter/baisser son salaire. 


<h3 p align="center"> Structure du projet ✨</h3>
La structure du projet suit les conventions standard
de Maven qui contient des dossier tels que :

* **src**/ avec **tp2**/ pour le code source de l'application

* **test**/ pour les tests
  <h3 p align="center"> Dépendances ✨ </h3>

`Java` pour le code source.

`JUnit ` pour les tests unitaires.

`Mockito` pour la création de mocks.

`Maven` pour la gestion des dépendances.

<h3 p align="center"> 🐱‍👓Diagramme de classe ✨ </h3>

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
<h3 p align="center"> Auteurs ✨ </h3>

<p align="center">Justine W. alias Arheee <p>

<h3 p align="center"> Licence ✨ </h3>

<p align="center">fr.arheee </p>

#### Citation spéciale poulpe ⚆_⚆ 
>Quand un poulpe est retiré de sa coquille, 
> une infinité de petites pierres s'attachent à ses bras.

