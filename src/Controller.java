import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Named
@SessionScoped
public class Controller implements Serializable {

    private Database database;

    private String pwd;
    private String username;
    private User currentUser;

    private List<Record> recordList;


    public Controller() {
        this.database = new Database();
        this.recordList = database.getRecordList();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }

    public List<Record> getRecordList() {
        return recordList;
    }

    public void setRecordList(List<Record> recordList) {
        this.recordList = recordList;
    }

    private void clearInputField() {
        this.username = "";
        this.pwd = "";
    }

    public String validateUsernamePassword() {
        User user = LoginDAO.validate(username, pwd);
        if (user != null) {
            currentUser = user;
            clearInputField();
            return "shop";
        } else {
            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Incorrect Username and Password",
                            "Please enter correct username and Password"));
            return "login";
        }

    }

    public void addToCart(int id) {
        Logger logger = Logger.getLogger(Controller.class.toString());
        logger.log(Level.INFO,Integer.toString(id));
    }
}
