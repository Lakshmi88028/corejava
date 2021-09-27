class ChatCentreUtil{
public static void main(String a[]){
	
ChatCentre centre = new ChatCentre();
centre.items[0] = "Pani Puri";
centre.items[1] = "Kachori";
centre.items[2] = "Samosa";
centre.items[3] = "Pav Bhaji";
centre.items[4] = "sandwich";

ChatCentre centre1 = new ChatCentre("Sai Chats", "near KLE ground", centre.items, 2,"Ramaswami", true);
centre1.displayChatCentre();
centre1.getItems();



}

}