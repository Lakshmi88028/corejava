class Laptop{

private static Laptop laptop = null;
public static Laptop getLaptop(){
return laptop;
}

static{
laptop = new Laptop();
}
}