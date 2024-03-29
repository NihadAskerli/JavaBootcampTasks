package az.code.repos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class AbstractDao {
    private static EntityManagerFactory emf =null;
    public static EntityManager em(){
        if(emf==null){
            emf= Persistence.createEntityManagerFactory("productSales");
        }
        EntityManager entityManager=emf.createEntityManager();
        return entityManager;
    }
    public static void emfclose(){
        emf.close();
    }
}
