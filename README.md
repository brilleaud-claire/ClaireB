# Design
![Design](https://github.com/brilleaud-claire/ClaireB/assets/156075990/fd94ea76-6721-47e6-9e3d-cdbf56d0f6fc)  
J’ai choisi le design 3 et la technologie Android+Jetpack Compose. 

## Explication de ma startegie
Pour la première partie j’ai créé un fichier HomePageActivity.kt dont le rôle est d’afficher tout ce qui se trouve sur la première page de l’application. 
La partie la plus difficile ici fut de créer les différents boutons pour chaque localisation. Pour se faire j’ai créé un autre fichier : ComponentActivity.kt. 
L’idée était de créer une fonction composable où l’on peut rentrer une température, une fourchette, la localisation, le type de météo et le nom de l’image 
(un nuage avec de la pluie par exemple) à afficher. Ainsi je n’ai qu’à faire une colonne appelant cette fonction avec différents paramètres pour créer la première page.

# En bonus 
J’ai pu ajouté la possibilité de scroller à la verticale sur la première page. J’ai utilisé LazyColumn pour le faire.
J’ai aussi réalisé la deuxième page du design. Concernant la stratégie que j’ai mis en place, j’ai repris mon idée de la première page : pour les widget qui changeaient 
en fonction des températures et du temps, j’ai créé un fichier BonusComponentActivity.kt pour créer la fonction composable qui me permet en entrant les paramètres : température, 
heure, précipitation et le nom de l’image à afficher, à créer une ligne (Row) dans SecondPageActivity.kt que l’on peut scroller horizontalement. Le reste n’est qu’une superposition 
d’image et de colonnes de texte. 
Pour finir j’ai rajouter de la navigation afin que lorsqu’on appui sur un des boutons de la première page on arrive à la seconde. D’où la présence d’un fichier Screen et NavGraph.  

## Difficultés 
J’ai eu quelques difficultés sur le changement de police du texte et sur la mise en page en général. Mais après quelques recherches j’ai fini par réussir à changer la police et a 
effectuer ma mise en page. En effet le téléphone que j’ai utilisé (pixel 7) était plus grand que l’écran d’IPhone pour lequel le template à été conçu. J’ai donc un peu agrandi certains 
widget sur la deuxième page. 


