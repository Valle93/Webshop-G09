import java.util.ArrayList;
import java.util.List;

public class Database {

    List<Record> recordList;
    List<User> userList;


    public Database() {
        this.userList = new ArrayList<>();
        this.recordList = new ArrayList<>();

        this.userList.add(new User("mrtest","Test", "Testsson", "lösen"));

        this.recordList.add(new Record("Toto","Old is new","toto-1.jpg", 149));
        this.recordList.add(new Record("Excalibur","Live In Brocéliande","excalibur-1.jpg", 209));
        this.recordList.add(new Record(" John Hiatt","Ottawa","johnhiatt-1.jpg", 199));
        this.recordList.add(new Record("Streaplers","En gång till","streaplers-1.jpg",79));
        this.recordList.add(new Record("Toto","Old is new","toto-1.jpg", 149));
        this.recordList.add(new Record("Excalibur","Live In Brocéliande","excalibur-1.jpg", 209));
        this.recordList.add(new Record(" John Hiatt","Ottawa","johnhiatt-1.jpg", 199));
        this.recordList.add(new Record("Streaplers","En gång till","streaplers-1.jpg",79));
        this.recordList.add(new Record("Toto","Old is new","toto-1.jpg", 149));
        this.recordList.add(new Record("Excalibur","Live In Brocéliande","excalibur-1.jpg", 209));
        this.recordList.add(new Record(" John Hiatt","Ottawa","johnhiatt-1.jpg", 199));
        this.recordList.add(new Record("Streaplers","En gång till","streaplers-1.jpg",79));
        this.recordList.add(new Record("Toto","Old is new","toto-1.jpg", 149));
        this.recordList.add(new Record("Excalibur","Live In Brocéliande","excalibur-1.jpg", 209));
        this.recordList.add(new Record(" John Hiatt","Ottawa","johnhiatt-1.jpg", 199));
        this.recordList.add(new Record("Streaplers","En gång till","streaplers-1.jpg",79));
        this.recordList.add(new Record("Toto","Old is new","toto-1.jpg", 149));
        this.recordList.add(new Record("Excalibur","Live In Brocéliande","excalibur-1.jpg", 209));
        this.recordList.add(new Record(" John Hiatt","Ottawa","johnhiatt-1.jpg", 199));
        this.recordList.add(new Record("Streaplers","En gång till","streaplers-1.jpg",79));
        this.recordList.add(new Record("Toto","Old is new","toto-1.jpg", 149));
        this.recordList.add(new Record("Excalibur","Live In Brocéliande","excalibur-1.jpg", 209));
        this.recordList.add(new Record(" John Hiatt","Ottawa","johnhiatt-1.jpg", 199));
        this.recordList.add(new Record("Streaplers","En gång till","streaplers-1.jpg",79));
    }

    public List<Record> getRecordList() {
        return recordList;
    }

    public void setRecordList(List<Record> recordList) {
        this.recordList = recordList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
