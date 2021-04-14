package java113;

import java113.CodeLeanB;

public class CodeLeanE extends CodeLeanB {

    public static void main(String[] arg) {
        new CodeLeanB().methodPublic();
        new CodeLeanB().methodProtected();
        new CodeLeanE().methodProtected();
    }
}
