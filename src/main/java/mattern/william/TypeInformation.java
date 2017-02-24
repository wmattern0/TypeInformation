package mattern.william;

public class TypeInformation {

    boolean classImplementsInterface(Object o, String interfaceName){
        for (Class<?> interfaceClass: o.getClass().getInterfaces()){
            String objectInterfaceName = interfaceClass.getSimpleName();
            if(objectInterfaceName.equals(interfaceName)){
                return true;
            }
        }
        return false;
    }
}
