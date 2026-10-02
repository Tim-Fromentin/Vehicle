Je t'ai préparé un exo pour bosser la POO en Java ;) on reste dans le thème des véhicules.

L'idée : tu vas créer uu garage avec 4 véhicules : une Clio, une Tesla, une moto électrique Zero et un vélo.

Étape 1, les véhicules
Crée une classe Vehicle, puis Car, Motorbike et Bicycle qui sont des sortes de véhicules. Ensuite Clio et Tesla, qui sont des sortes de voitures, et Zero, qui est une sorte de moto.

Chaque véhicule a un nom. Ceux qui ont un moteur ont aussi une autonomie (les km qu'ils peuvent encore faire) et une autonomie max (quand ils sont pleins) :
Clio : 150 km au départ, 700 max, essence
Tesla : 80 km au départ, 500 max, électrique
Zero : 120 km au départ, 180 max, électrique
Vélo : pas d'autonomie, il a ses jambes

Deux questions à te poser en codant.
Est-ce que ça a du sens d'écrire new Vehicle() ?  
Et si ton Main peut écrire clio.autonomy = 5000, la Clio vient de faire le plein gratuitement. Qu'est-ce qui devrait l'en empêcher ?
Pour vérifier : ton Main crée les 4 véhicules et affiche le nom et l'autonomie de chacun.

Étape 2, rouler
Chaque véhicule a une méthode drive(int km).
Un véhicule à moteur perd autant d'autonomie que de km parcourus (logique).S'il n'en a pas assez, il refuse de partir et affiche "Pas assez d'autonomie". Le vélo, lui, roule toujours.
Dans ton Main, mets les 4 véhicules dans une seule liste, et fais-les tous rouler 100 km avec une seule boucle.
Pour vérifier : la Clio, la Zero et le vélo roulent, la Tesla refuse avec ses 80 km.

Étape 3, l'aire d'autoroute
La Tesla a besoin d'une borne. Crée une classe Station qui sait faire le plein d'un véhicule à essence et recharger un véhicule électrique. Dans les deux cas le véhicule repart avec son autonomie max. Fais-le comme tu le sens.
Pour vérifier : la Tesla se recharge et repart pour ses 100 km.
Ensuite réponds à ces 3 questions :
1. Combien de méthodes ta Station a besoin pour servir la Clio, la Tesla et la Zero ?
2. Est-ce que ta Station connaît les mots Clio, Tesla ou Zero quelque part ?
3. Demain une Mégane électrique arrive. Combien de fichiers tu dois modifier pour qu'elle puisse se recharger ?

Étape 4, une borne qui ne connaît aucune marque (la rectification de l'étape 3 donc)
Une vraie borne recharge tout ce qui se recharge. Elle ne demande ni la marque, ni si c'est une voiture ou une moto.
Réécris ta Station pour qu'elle ne contienne aucun nom de véhicule, et pour qu'une Mégane électrique puisse s'y recharger en créant un seul fichier. Ou que, dans l'idée, peu importe quel autre type de véhicule viendra s'y brancher un jour... ça n'aura qu'un impact minime.
Un seul mot : interface ;)
Pour vérifier : tu crées la classe Megane, elle se recharge sur ta station, et tu n'as touché à aucun autre fichier.

À la fin, tu viens m'expliquer ce que tu as compris de tout ça :D

Bon courage, et hésite pas si tu bloques !

