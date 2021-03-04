package com.ibm;//package com.ibm;

import java.util.ArrayList;
import java.util.List;

class Code {
    String name, text;
    List<Code> fields = new ArrayList<>();
    private final String newLine = System.lineSeparator();

    public Code() {
    }

    public Code(String name, String text) {
        this.name = name;
        this.text = text;
    }

    private String toStringClass() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("public class %s%s{%s", name, newLine,newLine));


        for (Code code : fields) {
            sb.append(code.toStringFields(0, code.name, code.text));
        }

        sb.append("}");

        return sb.toString();
    }

    private String toStringFields(int indent, String name, String text) {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("  public %s %s;\n", text, name, newLine));

        return sb.toString();
    }

    @Override
    public String toString() {
        return toStringClass( );
    }
}

class CodeBuilder {
    private String rootName;
    private Code root = new Code();

    public CodeBuilder(String className) {
        rootName = className;
        root.name = rootName;
    }

    public CodeBuilder addField(String name, String type) {
        Code field = new Code(name, type);
        root.fields.add(field);
        return this;
    }


    @Override
    public String toString() {
        return root.toString();
    }
}

public class ExerciseBuilder {
    public static void main(String[] args) {
        CodeBuilder class1 = new CodeBuilder("Person").addField("name","String").addField("age","int");
        System.out.println(class1);
    }
}

