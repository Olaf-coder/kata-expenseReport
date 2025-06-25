# Kata: Outil de suivi de dépenses personnelles
## Objectif
Créer une application web pour enregistrer et catégoriser les dépenses personnelles.
Demande spécifique: Utiliser l'architecture port/adapter.
## Fonctionnalités:
- Backend (Spring Boot, Java 17, Maven): API REST permettant de:
  -  Ajouter une nouvelle dépense (montant, catégorie, date, description
  optionnelle).
 
  - Lister toutes les dépenses.
  - Filtrer les dépenses par catégorie et/ou par période.
  - Calculer le total des dépenses par catégorie.

- Frontend (Angular 19) 
  - Interface utilisateur pour saisir les dépenses
  - Afficher la liste des dépenses
  - Visualiser les statistiques (total par catégorie, dépenses
    totales sur une période)
  - Proposer un menu déroulant pour choisir la catégorie de
    la dépense. 

- Données: Stockage en mémoire.

## Composants techniques
- Spring Boot
- Maven
- Java 17
- Angular 19. 

## Livrable
- Code source sur GitHub.

Merci de ne pas utiliser Docker pour ce test.

## Notes personnelles
La categorie des dépenses ne devant pas être manipulable par l'utilisateur directement, c'est a l'architecte de creer la source d'information.
J'ai pris le parti de creer un ENUM pour la catégorie pour eviter le sur-engineering (autrement, j'aurai pu utiliser le boostrap ou un adapterIn protégé).
