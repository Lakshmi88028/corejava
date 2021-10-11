class Shirt{
	
	private static Shirt shirt = null;
	public static Shirt getShirt(){
		return shirt;
	}
	static {
		shirt = new Shirt();
	}
}