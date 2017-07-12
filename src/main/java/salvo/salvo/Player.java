package salvo.salvo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by nuriamolinalopez on 11/7/17.
 */
@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String userName;
    private String domain;

    public Player() { }

    public Player(String userNameInput, String domainInput) {
        this.userName = userNameInput;
        this.domain = domainInput;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDomain() {
        return domain;
    }
    public void setDomain(String userName) {
        this.domain = domain;
    }
}

