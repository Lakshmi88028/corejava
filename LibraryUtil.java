class LibraryUtil{
public static void main(String a[]){
LibraryDTO lib = new LibraryDTO();
lib.setName("Basaveshwara");
lib.setAddress("Bagalkot");
lib.setType("Local Library");
lib.setIsOpen(true);
lib.setNoOfBooks(897);

System.out.println(lib.getName()+ " "+lib.getAddress()+ " "+lib.getType()+ " "+lib.getIsOpen()+lib.getNoOfBooks());
}
}