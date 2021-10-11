class Application{

private static Application app;
public static Application getApplication(){
	return app;
}
static{
app = new Application();
}
}