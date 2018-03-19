public class FunctionName {
    private String name;
    private String parserName;

    public FunctionName(String nameToAdd, String parserNameToAdd) {
        name = nameToAdd;
        parserName = parserNameToAdd;
    }

    @Override
    public String toString()
    {
        return name;
    }
}
