
package exercise;
import java.util.ArrayList;
public class PersonList {
    ArrayList<Person>personList = new ArrayList<>();
    public void addPerson(Person person ){
        person.addPerson();
        personList.add(person);
        System.out.println("Added");
}
    public void updatePerson(String ID ){
        for( Person person : personList ){
            if(person.getID().equals(ID)){
                person.updatePerson(ID);
                return ;
            }
        }
        System.out.println("Not found ID : "+ ID );
    }
    public void deleteBookID(String ID){
        boolean removed = personList.removeIf(person.getID().equals(ID));
    }
