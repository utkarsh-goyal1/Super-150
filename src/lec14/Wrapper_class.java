package lec14;

public class Wrapper_class {
	public static void main(String[]args)
	{
		Integer a=10;//content store in heap.
		int a1=10;
		System.out.println(a);
		System.out.println(a1);
		a=a1;//primitive-->non-primitive. autoboxing
		int b=-6;
		Integer b1=-9009;
		b=b1;//non-primitive-->primitive unboxing.
	}

}
