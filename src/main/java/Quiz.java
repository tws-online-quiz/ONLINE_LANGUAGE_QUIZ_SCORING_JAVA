public class Quiz {
    public String runUserCode(String arg) {
        // Setup: parse input from String and convert output to String
        UserCode userCode = new UserCode();
        return userCode.run(arg);
    }
}