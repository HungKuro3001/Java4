package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import Utils.JpaUtil;
import entities.Oder;

public class OrderDAO {
	EntityManager em;

	public OrderDAO() {
		// TODO Auto-generated constructor stub
		this.em = JpaUtil.getEntityManager();
	}

	public Oder insert(Oder o) throws Exception {
		try {
			this.em.getTransaction().begin();
			this.em.persist(o);
			em.flush();
			this.em.getTransaction().commit();
			return o;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}
	public Oder update(Oder o) throws Exception {
		try {
			this.em.getTransaction().begin();
			this.em.merge(o);
			this.em.getTransaction().commit();
			return o;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}
	public List<Oder> findHoaDonByUser(int id){
		String jpql = "Select o from Oder o  where o.user.id = :id";
		TypedQuery<Oder> query = this.em.createQuery(jpql,Oder.class);
		query.setParameter("id", id);
		return query.getResultList();
	}
	public List<Oder> findHoaDonbystatus(int status){
		String jpql = "Select o from Oder o  where o.tinhTrang= :id";
		TypedQuery<Oder> query = this.em.createQuery(jpql,Oder.class);
		query.setParameter("id", status);
		return query.getResultList();
	}
	public Oder find(int id) {
		return this.em.find(Oder.class, id);
	}
	
}
