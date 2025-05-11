# Jeu de Devinette

## Description
Ce projet implémente un jeu interactif de devinette en ligne de commande, développé en Java. L'objectif est de deviner un nombre aléatoire généré par le programme en un maximum de 10 tentatives. Le programme fournit des indices pour guider l'utilisateur.

## Fonctionnalités principales
- Génération d'un nombre aléatoire entre 0 et 99.
- Interaction avec l'utilisateur via la ligne de commande.
- Limite de 10 tentatives pour trouver le nombre correct.
- Indices fournis après chaque tentative pour indiquer si la réponse correcte est plus grande ou plus petite que celle de l'utilisateur.
- Messages d'encouragement en cas de succès ou d'échec.

## Structure du projet
### Classe `Devinette`
Cette classe gère la logique principale du jeu, y compris :
- **Attributs** :
    - `int nombreAleatoire` : Un nombre aléatoire généré lors de l'initialisation de l'objet.
- **Méthodes** :
    - `Devinette()`: Constructeur qui génère un nombre aléatoire entre 0 et 99.
    - `boolean isWinn(int nombre)` : Vérifie si la tentative de l'utilisateur correspond au nombre aléatoire généré.
    - `String indice(int nombre)` : Fournit un indice selon la tentative de l'utilisateur :
        - "le nombre est plus grand" : si le nombre proposé est trop petit.
        - "le nombre est plus petit" : si le nombre proposé est trop grand.

### Classe `Main`
Cette classe contient le point d'entrée du programme et gère l'interaction utilisateur :
- Initialise un objet `Devinette`.
- Guide l'utilisateur pour entrer des nombres jusqu'à ce qu'il devine correctement ou atteigne le nombre maximum de tentatives.
- Affiche les messages correspondants à chaque action, comme :
    - Un indice si la tentative est incorrecte.
    - Un message de félicitations si l'utilisateur réussit.
    - Un message d'échec après 10 tentatives infructueuses.

## Instructions d'exécution
### Prérequis
- Java installé sur votre machine.
- Un terminal ou IDE pour exécuter le programme.

### Étapes
1. Compilez les fichiers Java :
   ```bash
   javac Devinette.java Main.java
   ```
2. Exécutez le fichier `Main` :
   ```bash
   java Main
   ```
3. Suivez les instructions affichées dans le terminal pour jouer.

## Exemple
Voici un exemple d'une session de jeu en ligne de commande :
