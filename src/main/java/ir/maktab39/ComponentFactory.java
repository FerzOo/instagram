package ir.maktab39;

import java.lang.reflect.Constructor;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ComponentFactory {

    private static volatile ConcurrentMap<String, Object> components =
            new ConcurrentHashMap<>();


    public static Object getSingletonObject(Class classObject,
                                            Object... constructorParams) {
        try {
            String simpleClassName = classObject.getSimpleName();
            if (!components.containsKey(simpleClassName)) {
                synchronized ((simpleClassName + "Component").intern()) {
                    Class[] constructorTypes = new Class[constructorParams.length];
                    for (int i = 0; i < constructorParams.length; i++) {
                        constructorTypes[i] = constructorParams[i].getClass();
                    }
                    Constructor constructor = classObject.getConstructor(constructorTypes);
                    Object component = constructor.newInstance(constructorParams);
                    components.putIfAbsent(simpleClassName, component);
                }
            }
            return components.get(simpleClassName);
        } catch (Exception e) {
            ir.maktab39.ErrorHandler.showMessage(e);
            return null;
        }
    }
}

