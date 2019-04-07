package pl.dupsa.gastronomy;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pl.dupsa.gastronomy.model.Ord;
import pl.dupsa.gastronomy.model.OrderItem;
import pl.dupsa.gastronomy.persistence.OrdDAO;
import pl.dupsa.gastronomy.persistence.OrderItemDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = GastronomyApp.class)
public class OrderItemDAOTest {

	@Autowired
	private OrderItemDAO orderItemDAO;

	@Test
	@Transactional
	@Rollback(true)
	public void shouldSaveorderItem() {
		OrderItem orderItem = new OrderItem();
		orderItem.setQuantity(2);
		orderItemDAO.save(orderItem);
	}
}