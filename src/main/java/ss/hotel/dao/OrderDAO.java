package ss.hotel.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ss.hotel.domain.HotelOrder;

/**
 *
 * @author Kateryna
 */
@Repository
public class OrderDAO implements IOrderDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addOrder(HotelOrder order) {
        sessionFactory.getCurrentSession().save(order);
    }

    @Override
    public void updateOrder(HotelOrder order) {
        sessionFactory.getCurrentSession().update(order);
    }

    @Override
    public void removeOrder(Long id) {
        HotelOrder toDelete = (HotelOrder) sessionFactory.getCurrentSession().
                get(HotelOrder.class, id);
        if (toDelete != null) {
            sessionFactory.getCurrentSession().delete(toDelete);
        }
    }

    @Override
    public HotelOrder getOrder(Long id) {
        HotelOrder toReturn = (HotelOrder) sessionFactory.getCurrentSession().
                get(HotelOrder.class, id);
        return toReturn;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<HotelOrder> getAllOrders() {
        List<HotelOrder> orders = sessionFactory.getCurrentSession().
                createQuery("from Order").list();
        return orders;
    }
}
