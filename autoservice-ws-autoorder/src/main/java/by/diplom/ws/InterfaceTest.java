package by.diplom.ws;

public interface InterfaceTest {
    default int helloJohn(){
        System.out.println("Hello John");
        return 0;
    }

}
