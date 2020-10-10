package ir.maktab39;

//import ir.maktab39.entities.Customer;

import javax.persistence.EntityManager;

public class Session {


//    private static ThreadLocal<Customer> customerThreadLocal = new ThreadLocal<>();
    private static ThreadLocal<EntityManager> entityManagerThreadLocal =
            new ThreadLocal<>();

    public static void destroy(){
        closeAndRemoveEntityManagers();
//        removeUser();
    }

//    public static Customer getUser(){
//        return customerThreadLocal.get();
//    }
//
//    public static void setUser(Customer user){
//        customerThreadLocal.set(user);
//    }
//
//    private static void removeUser(){
//        customerThreadLocal.remove();
//    }

    public static EntityManager getEntityManager(){
        return entityManagerThreadLocal.get();
    }

    public static void setEntityManager(EntityManager entityManager){
        entityManagerThreadLocal.set(entityManager);
    }

    private static void closeAndRemoveEntityManagers(){
        entityManagerThreadLocal.get().close();
        entityManagerThreadLocal.remove();
    }

}
