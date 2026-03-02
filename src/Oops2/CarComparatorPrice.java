package Oops2;
import java.util.*;
public class CarComparatorPrice implements Comparator<Cars>{

	@Override
	public int compare(Cars o1, Cars o2) {
		// TODO Auto-generated method stub
		return o2.price-o1.price;
	}

}
