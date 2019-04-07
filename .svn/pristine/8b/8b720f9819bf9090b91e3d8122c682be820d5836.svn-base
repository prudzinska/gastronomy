package pl.dupsa.gastronomy.controler;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pl.dupsa.gastronomy.model.Ingredient;
import pl.dupsa.gastronomy.model.Ord;
import pl.dupsa.gastronomy.model.OrderItem;
import pl.dupsa.gastronomy.persistence.IngredientDAO;
import pl.dupsa.gastronomy.persistence.OrdDAO;
import pl.dupsa.gastronomy.persistence.OrderItemDAO;

@Controller
public class OrdController {

	@Autowired
	private OrdDAO ordDAO;

	@Autowired
	private IngredientDAO ingredientDAO;

	@RequestMapping("/ord/list")
	public ModelAndView listOrd() {
		ModelAndView mav = new ModelAndView("ord/list");

		List<Ord> ords = ordDAO.findAll();
		mav.addObject("ords", ords);

		return mav;
	}

	@RequestMapping("/ord/add")
	public ModelAndView addOrd() {
		ModelAndView mav = new ModelAndView("ord/add");

		Ord ord = new Ord();
		List<Ingredient> ingredients = ingredientDAO.findAll();

		mav.addObject("ord", ord);
		mav.addObject("ingredients", ingredients);

		return mav;
	}

	@RequestMapping(value = "/ord/added", method = RequestMethod.POST)
	public ModelAndView addedOrd(@ModelAttribute("ord") Ord ord,
			BindingResult result, Model model) {
		ModelAndView mav = new ModelAndView("ord/added");

		for (OrderItem orderItem : ord.getOrderItems()) {
			orderItem.setOrder(ord);
		}

		ordDAO.save(ord);

		return mav;
	}

	@RequestMapping("ord/delete/{ordId}")
	public ModelAndView deleteOrd(@PathVariable("ordId") Long ordId) {
		ModelAndView mav = new ModelAndView("ord/delete");
		ordDAO.deleteById(ordId);
		return mav;
	}
}
