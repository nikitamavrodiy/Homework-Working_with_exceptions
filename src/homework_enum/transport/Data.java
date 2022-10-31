package homework_enum.transport;

public class Data {
    public static boolean verificationOfLogin(String login, String password, String confirmPassword) throws Exception {
        if (!isValidData(login)){
            throw new WrongLoginException("Некорректный логин");
        } else if (!isValidData(password)) {
            throw new WrongPasswordException("Некорректный пароль");
        } else if (!confirmPassword.equals(password)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
        return true;
    }

    public static boolean isValidData(String login) {
        if (login.length() < 1 || login.length() > 20) {
            return false;
        }
        char[] loginChars = login.toCharArray();
        for (char loginChar : loginChars) {
            if (!isValidChar(loginChar)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValidChar(char symbol) {
        String allowedSymbols = "qwertyuiopasdfghjklzxcvbnm1234567890_QWERTYUIOPASDFGHJKLZXCVBNM";
        return allowedSymbols.contains("" + symbol);
    }

}
