class ProjectUtil{
public static void main(String a[]){

ProjectDTO pro = new ProjectDTO();
pro.setName("Poultryfarm management system");
pro.setNoOfMembers(4);
pro.setId(4717);
pro.setGuideName("prof.Jyoti katagi");
pro.setIsCompleted(true);

System.out.println(pro.getName()+ " "+pro.getNoOfMembers()+ " "+pro.getId()+ " "+pro.getGuideName()+ " "+pro.getIsCompleted());
}
}