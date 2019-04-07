package pl.dupsa.gastronomy.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pl.dupsa.gastronomy.model.Ingredient;
import pl.dupsa.gastronomy.persistence.IngredientDAO;
import pl.dupsa.gastronomy.persistence.OrderItemDAO;

@Controller
public class IngredientController {

	@Autowired
	private IngredientDAO ingredientDAO;

	@RequestMapping("/ingredient/list")
	public ModelAndView listIngredient() {
		ModelAndView mav = new ModelAndView("ingredient/list");

		List<Ingredient> ingredients = ingredientDAO.findAll();
		mav.addObject("ingredients", ingredients);

		return mav;
	}

	@RequestMapping("/ingredient/add")
	public ModelAndView addIngredient() {
		ModelAndView mav = new ModelAndView("ingredient/add");
		List<Ingredient> ingredients = ingredientDAO.findAll();
		mav.addObject("ingredients", ingredients);
		return mav;
	}

	@RequestMapping(value = "/ingredient/added", method = RequestMethod.POST)
	public ModelAndView addedIngredient(
			@ModelAttribute("ingredient") Ingredient ingredient) {
		ModelAndView mav = new ModelAndView("ingredient/added");
		ingredientDAO.save(ingredient);
		return mav;
	}

	@RequestMapping("ingredient/delete/{ingredientId}")
	public ModelAndView deleteIngredient(
		@PathVariable("ingredientId") Long ingredientId) {
		ModelAndView mav = new ModelAndView("ingredient/delete");
		ingredientDAO.deleteById(ingredientId);
		return mav;
	}

	@RequestMapping("/ingredient/edit/{ingredientId}")
	public ModelAndView editIngredient(
			@PathVariable("ingredientId") Long ingredientId) {
		ModelAndView mav = new ModelAndView("ingredient/edit");

		Ingredient ingredient = ingredientDAO.getOne(ingredientId);
		mav.addObject("ingredient", ingredient);

		return mav;
	}

	@RequestMapping(value = "/ingredient/edited", method = RequestMethod.POST)
	public ModelAndView editedIngredient(
			@ModelAttribute("ingredient") Ingredient ingredient) {
		ModelAndView mav = new ModelAndView("ingredient/edited");

		System.out.println("Ingredient id:" + ingredient.getId());
		
		ingredientDAO.save(ingredient);

		return mav;
	}

}
