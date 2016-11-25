package main;

import money.RectangleCoin;
import money.ShapeHandler;
import money.TriangleCoin;

import java.util.HashSet;
import java.util.Set;

import money.CircleCoin;
import money.CoinShape;

public class Main {

	public static void main(String[] args) {

		// Rectangle coins:

		CoinShape rectangleCoin1 = new RectangleCoin(4, 7);
		System.out.println("Real value of rectangleCoin1: " + rectangleCoin1.realValue());

		CoinShape rectangleCoin2 = new RectangleCoin(4, 7);
		System.out.println("Real value of rectangleCoin2: " + rectangleCoin2.realValue());

		CoinShape rectangleCoin3 = new RectangleCoin(5, 7);
		System.out.println("Real value of rectangleCoin3: " + rectangleCoin3.realValue());

		System.out.println("______________________________________________________");
		System.out.println();

		// Circle coins:

		CoinShape circleCoin1 = new CircleCoin(5);
		System.out.println("Real value of circleCoin1: " + circleCoin1.realValue());

		CoinShape circleCoin2 = new CircleCoin(6);
		System.out.println("Real value of circleCoin2: " + circleCoin2.realValue());

		CoinShape circleCoin3 = new CircleCoin(7);
		System.out.println("Real value of circleCoin3: " + circleCoin3.realValue());

		System.out.println("______________________________________________________");
		System.out.println();

		// Triangle coins:

		CoinShape triangleCoin1 = new TriangleCoin(3, 4, 3);
		System.out.println("Real value of triangleCoin1: " + triangleCoin1.realValue());

		CoinShape triangleCoin2 = new TriangleCoin(4, 7, 5);
		System.out.println("Real value of triangleCoin2: " + triangleCoin2.realValue());

		CoinShape triangleCoin3 = new TriangleCoin(13, 19, 15);
		System.out.println("Real value of triangleCoin3: " + triangleCoin3.realValue());

		System.out.println("______________________________________________________");
		System.out.println();

		// Set of all coins

		Set<CoinShape> coinsSet = new HashSet<>();
		coinsSet.add(triangleCoin1);
		coinsSet.add(triangleCoin2);
		coinsSet.add(triangleCoin3);

		coinsSet.add(circleCoin1);
		coinsSet.add(circleCoin2);
		coinsSet.add(circleCoin3);

		coinsSet.add(rectangleCoin1);
		coinsSet.add(rectangleCoin2);
		coinsSet.add(rectangleCoin3);
		
		// Operations

		ShapeHandler sh = new ShapeHandler();

		// Calculate how much money I have exactly

		System.out.println("I have " + sh.calculateHowMuchMoneyIHave(coinsSet) + " money.");
		
		System.out.println("______________________________________________________");
		System.out.println();

		// Separate a set of different type of shapes into a list of sets

		System.out.println("Separate a set of different type of shapes into a list of sets.");
		System.out.println("Size of list: " + sh.separateASetOfDifferentType(coinsSet).size());

		System.out.println("______________________________________________________");
		System.out.println();
		
		// Sort by area

		System.out.println("Sort by area: ");
		Set<CoinShape> sba = sh.sortByArea(coinsSet);
		for (CoinShape coinShape : sba) {
			System.out.println(coinShape);
		}

		System.out.println("______________________________________________________");
		System.out.println();
		
		// Sort by perimeter

		System.out.println("Sort by perimeter");
		Set<CoinShape> sbp = sh.sortByPerimeter(coinsSet);
		for (CoinShape coinShape : sbp) {
			System.out.println(coinShape);
		}

	}

}
