class Screen {

public static Screen screen ;
public static Screen getScreen(){
return screen;
}
static {
screen = new Screen();
}
}