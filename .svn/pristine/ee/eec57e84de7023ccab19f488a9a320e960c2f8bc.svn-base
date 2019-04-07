package pl.dupsa.gastronomy;

import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pl.dupsa.gastronomy.model.Ingredient;
import pl.dupsa.gastronomy.model.Ord;
import pl.dupsa.gastronomy.model.OrderItem;
import pl.dupsa.gastronomy.persistence.IngredientDAO;
import pl.dupsa.gastronomy.persistence.OrdDAO;
import pl.dupsa.gastronomy.persistence.OrderItemDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = GastronomyApp.class)
public class OrderDAOTest {

	@Autowired
	private OrdDAO ordDAO;

	@Autowired
	private IngredientDAO ingredientDAO;

	@Autowired
	private OrderItemDAO orderItemDAO;

	@Test
	@Transactional
	@Rollback(true)
	public void shouldSaveEmptyOrder() {
		Ord ord = new Ord();
		ordDAO.save(ord);
	}

	@Test
	@Transactional
	@Rollback(true)
	public void shouldSaveOrder() {
		// given
		Ingredient caramelIceCream = new Ingredient();
		caramelIceCream.setName("lody karmelowe");
		ingredientDAO.save(caramelIceCream);

		Ingredient raspberryIceCream = new Ingredient();
		raspberryIceCream.setName("lody malinowe");
		ingredientDAO.save(raspberryIceCream);

		// when
		OrderItem orderItemA = new OrderItem();
		orderItemA.setIngredient(caramelIceCream);
		orderItemA.setQuantity(2);

		OrderItem orderItemB = new OrderItem();
		orderItemB.setIngredient(raspberryIceCream);
		orderItemB.setQuantity(3);

		Ord ord = new Ord();
		List<OrderItem> orderItems = new ArrayList<OrderItem>();
		orderItems.add(orderItemA);
		orderItems.add(orderItemB);
		ord.setOrderItems(orderItems);
		ordDAO.save(ord);

		// then
		Ord orderFromRepository = ordDAO.getOne(ord.getId());
		Assert.assertEquals(2, orderFromRepository.getOrderItems().size());

	}
}
