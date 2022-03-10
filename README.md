# 2DGameEngine
This 2D Game Engine was designed in *Java*. It consists of a custom Game Library totalling 5 classes. Within the Main class there is some functionality showing what can currently be achieved.

## User Manual
Once the program is run, the user will see a short game playout in front of them inside their IDEs *console* as per the project brief. An Enemy will be created with its variables set using the setter inherited from the Sprite class. Next, a Player object is created again using the inherited setters from the Sprite class. Once the two classes are set up each will use the getName() method and print their respective names. 

Next, the enemy will jump and print their new location, followed by the player jumping and displaying their new location. From here the enemy attacks print their new location and the player will retreat and display their new location. Then two Vector objects will be created. One uses the player's locations and the other uses the Vector classes multipleVector() method to create a new Vector object by multiplying the first Vector by a scaler of 7. The second Vectors details will be displayed and a new Vector created. This new Vector will use the enemy's locations during creation. A final Vector is then created using the Vector classes addTwoVectors() method which allows two Vectors values to be added to create a new one. The third and final Vectors details are then printed.

Within the Main class, the user can create their very own game by using the methods available to them in the GameLibrary. As many Players, Enemys, and Vectors can be created in the user's desired game.


## Skills Demonstrated
During this project I had a chance to demonstrate my base knowledge of both *Abstract Classes* and *Inheritance*. Along with my ability to create a custom libraries.

## Further Development
The current version is missing the fun of sprites having health bars, attacks depleting health and the overall trill of my actions have consciences (if I attack will I win, or will I have to create a new character all over again). Like all games, even 2D command-line ones, the implementation of a leveling and experience system would increase user retention and make it hard for a user to want to stop playing. As a whole, the current limitations lay with how limited the Player and Enemy classes are but thankfully this can be improved with ease.

This is where I will seek to further develop the program.

