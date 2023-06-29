import entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args){
        Employee emp1 = new Employee("rex", "beats");

        //persistence
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();

        //session
        em.getTransaction().begin();
        em.persist(emp1);
        em.getTransaction().commit();

        //closing resources
        em.close();
        emf.close();

    }
}
