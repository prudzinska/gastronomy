package pl.dupsa.gastronomy.persistence;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.dupsa.gastronomy.model.Ingredient;

@Transactional
public interface IngredientDAO extends JpaRepository<Ingredient, Long> {

}
