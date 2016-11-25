package money;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ShapeHandler {

	public double calculateHowMuchMoneyIHave(Set<CoinShape> input) {
		double allMoney = 0;
		for (CoinShape coin : input) {
			allMoney = allMoney + coin.realValue();
		}
		return allMoney;
	}

	public List<Set<CoinShape>> separateASetOfDifferentType(Set<CoinShape> input) {
		List<Set<CoinShape>> listOfSets = new ArrayList<>();

		Set<CoinShape> triangleSet = new HashSet<>();
		Set<CoinShape> circleSet = new HashSet<>();
		Set<CoinShape> rectangleSet = new HashSet<>();

		Iterator<CoinShape> iterator = input.iterator();
		while (iterator.hasNext()) {
			CoinShape actual = iterator.next();

			if (actual instanceof RectangleCoin) {
				rectangleSet.add(actual);
			} else if (actual instanceof CircleCoin) {
				circleSet.add(actual);
			} else if(actual instanceof TriangleCoin){
				triangleSet.add(actual);
			}
		}
		
		listOfSets.add(rectangleSet);
		listOfSets.add(circleSet);
		listOfSets.add(triangleSet);

		return listOfSets;
	}

	public Set<CoinShape> sortByArea(Set<CoinShape> input) {
		SortedSet<CoinShape> sort = new TreeSet<>(Comparator.comparing(CoinShape :: area));
		sort.addAll(input);
		return sort;
	}
	
	public Set<CoinShape> sortByPerimeter(Set<CoinShape> input) {
		SortedSet<CoinShape> sort = new TreeSet<>(Comparator.comparing(CoinShape :: perimeter));
		sort.addAll(input);
		return sort;
	}
	
	
	
}
