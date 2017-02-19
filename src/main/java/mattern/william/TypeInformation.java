package mattern.william;

public class TypeInformation {

    boolean classImplementsInterface(Object o, String interfaceName){
        System.out.println(o.getClass());
        String fullInterfaceName = "interface " + interfaceName;
        boolean implementsInterface = false;
        for (Class interfaceFullName: o.getClass().getInterfaces()){
            System.out.println(fullInterfaceName);
            System.out.println(interfaceFullName);
            if(fullInterfaceName.equals(interfaceFullName)){
                implementsInterface = true;
            }
        }
        if("implements java.io.Serializable".equals(fullInterfaceName)){
            implementsInterface = true;
        }
        return implementsInterface;
    }

    public static void main(String[] args) {
        TypeInformation t = new TypeInformation();
        String s = "";
        t.classImplementsInterface(s, "java.io.Serializable");
        System.out.println(t.classImplementsInterface(s, "java.io.Serializable"));
    }

}
