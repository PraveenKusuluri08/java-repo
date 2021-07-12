package Super;

//super class
class SUPERDEMOCLASS {
	SUPERDEMOCLASS(final int n) {
		if (n > 10) {
			System.out.println("Dog is alive");
		} else {
			System.out.println("Dogs are went out");
		}
	}
}

//sub class
class DOGCLASS extends SUPERDEMOCLASS {
	DOGCLASS(final int m) {
		super(m);
		String dogsStatus= (m>=10) ?
		"  Dogs are in the SHELTER": " Dogs are not there";
		System.out.println(dogsStatus);
		String s ="praveen";
		
	}
}
