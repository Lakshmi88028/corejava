class ChatCentre{

String centreName;
int centreId;
String location;
String ownerName;
boolean open;
String items[] = new String[5];

public ChatCentre(){
System.out.println("ChatCentre object is created");
}

public ChatCentre(String centreName, String location, String items[], int centreId, String ownerName, boolean open){
	
	this.centreName = centreName;
	this.location = location;
	this.items = items;
	this.centreId = centreId;
	this.ownerName = ownerName;
	this.open = open;
	}
	
	
	
	public void displayChatCentre(){
		System.out.println(centreName+ " "+centreId+ " "+location+ " "+ownerName+ " "+open);
	}
		public void getItems(){
			for(int i=0;i<items.length;i++){
				System.out.println(items[i]);
			}
		}
		
		
	}

