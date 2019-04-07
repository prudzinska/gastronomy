package pl.dupsa.gastronomy;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pl.dupsa.gastronomy.model.Ingredient;
import pl.dupsa.gastronomy.persistence.IngredientDAO;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = GastronomyApp.class)
public class IngredientDAOTest {

	@Autowired
	private IngredientDAO ingredientDAO;
	
	@Test
	@Transactional
	@Rollback(true)
	public void shouldSaveIngredient() {
		Ingredient ingredient = new Ingredient();
		ingredient.setName("lody truskawkowe");
		ingredientDAO.save(ingredient);
	}
	
}
