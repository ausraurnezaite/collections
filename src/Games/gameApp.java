package Games;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparingDouble;
import static java.util.Comparator.comparingInt;

public class gameApp {

    private static void printGames(List<Game> games) {
        games.forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Game> games = new ArrayList<>();
        games.add(new Game("cs", genre.SHOOTING, 40.00, 100));
        games.add(new Game("dinnerDash", genre.PUZZLE, 3.00, 30));
        games.add(new Game("mario", genre.ADVENTURE, 30.00, 50));
        games.add(new Game("checkers", genre.BOARD, 10.00, 60));

        System.out.println("\n__________original List____________");
        printGames(games);

        System.out.println("\n__________sorted by price ASC_________");
        List<Game> sortGamesByPrice = games.stream()
                .sorted(comparingDouble(Game::getPrice))
                .collect(Collectors.toList());
        printGames(sortGamesByPrice);

        System.out.println("\n__________sorted by price DESC___________");
        List<Game> sortGamesByPriceDesc = games.stream()
                .sorted(comparingDouble(Game::getPrice).reversed())
                .collect(Collectors.toList());
        printGames(sortGamesByPriceDesc);

        System.out.println("\n__________removed at index 1____________");
        games.remove(1);
        printGames(games);

        System.out.println("\n__________increment price by 10____________");
        games.stream().forEach(game -> game.setPrice(game.getPrice() + 10));
        ;


        System.out.println("\n__________increment price by 5____________");
        List<Game> increasedPrice5 = games.stream().
                map(game -> {
                    game.incrementPrice(5);
                    return game;
                })
                .collect(Collectors.toList());
        printGames(increasedPrice5);

        games.stream().filter(game -> game.getPrice() > 10);
        games.stream().filter(game -> game.getCopiesSold() > 50);


        System.out.println("\n__________sorted by price CopiesSold_________");
        games.stream().sorted(comparingInt(Game::getCopiesSold));
        printGames(games);

        Optional<Game> maxCopiesSold = games.stream().max(comparingDouble(Game::getCopiesSold));
        System.out.println("\n______________max CopiesSold____________");
        if (maxCopiesSold.isPresent()) {
            System.out.println(maxCopiesSold);
        }

        System.out.println("\n______________min CopiesSold____________");
        Optional<Game> minCopiesSold = games.stream().min(comparingDouble(Game::getCopiesSold));
        if (minCopiesSold.isPresent()) {
            System.out.println(minCopiesSold);
        }
/*
        Game maxCopiesSold2 = games.stream().max(Comparator.comparing(Game::getCopiesSold)).orElseThrow(NoSuchElementException::new);
        System.out.println("\n______________max CopiesSold____________");
        System.out.println(maxCopiesSold);

        Game minCopiesSold2 = games.stream().min(Comparator.comparing(Game::getCopiesSold)).orElseThrow(NoSuchElementException::new);
        System.out.println("\n______________min CopiesSold____________");
        System.out.println(minCopiesSold);

 */
    }
}
/*
+Using Streams Sorted sort Games by copies sold.
+Using Streams Min/Max find Games that has sold minimum copies and maximum.
*/
/*
+Using Streams ForEach method increment price.
+Create Method in Games class (incrementPrice)
+Using Streams Collect save changes to new list.
Using Stream Filter games by
+    Price is more than 10 euro.
+    Have sold copied are more than 50.
*/

/*
+Create 4 game objects with these properties.
+Create ArrayList and add Games.
+Use foreach to go through array of games and print it.
+For printing use toString
+Remove second game
+Printing to the method and print list again.
+Sort Games by Price ascending /descending.
 */






