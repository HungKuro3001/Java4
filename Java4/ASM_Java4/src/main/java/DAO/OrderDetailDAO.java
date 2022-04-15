package DAO;

import java.util.List;

import javax.persistence.EntityManager;

import Utils.JpaUtil;
import entities.Oder;
import entities.Orderdetail;

public class OrderDetailDAO {
    EntityManager em;
    public OrderDetailDAO() {
		// TODO Auto-generated constructor stub
	 this.em = JpaUtil.getEntityManager();
    }
    public Orderdetail insert(Orderdetail od)throws Exception {
    	try {
			this.em.getTransaction().begin();
			this.em.persist(od);
			this.em.clear();
			this.em.getTransaction().commit();
			return od;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
    }
    public List<Orderdetail> findHDCTbyHD(int hd){
    	List<Orderdetail> list = this.em.find(Oder.class, hd).getOrderdetails();
    	return list;
    }
}
