import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {

    public static final String ACCOUNT_REGEX = "[a-zA-Z0-9_]{6,}";

    public AccountExample(){

    }

    public boolean validateAccount(String regex){
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
