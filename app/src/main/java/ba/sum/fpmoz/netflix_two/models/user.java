package ba.sum.fpmoz.netflix_two.models;
import com.google.android.gms.common.util.ScopeUtil;
import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class user {

    public String firstname;
    public String lastname;
    public String gender;
    public String dateOfBirth;
    public String city;


    public String country;

    public user() {

    }

    public user(String firstname, String lastname, String gender, String dateOfBirth, String city, String country) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.city = city;
        this.country = country;
    }
}
