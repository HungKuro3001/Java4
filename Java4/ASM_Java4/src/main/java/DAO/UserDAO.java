package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import Utils.JpaUtil;
import entities.User;

public class UserDAO {
    EntityManager em;

    public UserDAO(){
        this.em = JpaUtil.getEntityManager();
    }
    public User insertUser(User user){
        try {
            em.getTransaction().begin();
            em.persist(user);
            em.flush();
            em.getTransaction().commit();
            return user;
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            throw e;
        }
    }
    
    public User updateUser(User user){
        try {
            em.getTransaction().begin();
            em.merge(user);
            em.getTransaction().commit();
            return user;
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            throw e;
        }
    }

    public void deleteUser(User user){
        try {
            em.getTransaction().begin();
            em.remove(user);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            throw e;
        }
    }
    public User checkLogin(String email){
        String jpql = "Select u from User u where u.email = :email";
        TypedQuery<User> query = em.createQuery(jpql, User.class);
        query.setParameter("email", email);
        User user = query.getSingleResult();
        return user;
    }

    public User findUserById(int id){
        return this.em.find(User.class, id);
    }

    public List<User> findUserByName(String name, int page , int size){
        String jpql = "select u from User u where u.hoTen like :name";
        TypedQuery<User> query = em.createQuery(jpql, User.class);
        query.setParameter("name", "%" + name + "%");
        query.setFirstResult((page - 1) * size);
        query.setMaxResults(size);
        return query.getResultList();
    }
    public long getCount(String name){
        String jqpl = "select count(u) from User u where u.hoTen like :name";
        TypedQuery<Long> query = em.createQuery(jqpl, Long.class);
        query.setParameter("name", "%" + name + "%");
        return query.getSingleResult();
    }
}
